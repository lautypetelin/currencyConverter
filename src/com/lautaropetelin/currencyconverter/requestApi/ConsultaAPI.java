package com.lautaropetelin.currencyconverter.requestApi;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaAPI {

    private static final String API_KEY = "0313126688a08be61400f10c";
    private static Gson gson = new Gson();

    public static double getConversionRate(String from, String to) {

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + from;
        URI direccion = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Map<String, Object> responseMap = gson.fromJson(response.body(), Map.class);
            Map<String, Double> conversionRates = (Map<String, Double>)responseMap.get("conversion_rates");

            return conversionRates.get(to);

        }catch(Exception e){
            throw new RuntimeException("Ocurrió un error al obitener la tasa de conversión.");
        }
    }
}