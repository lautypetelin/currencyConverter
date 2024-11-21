package com.lautaropetelin.currencyconverter.service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProveedorAPI implements IKey{

    private static final String API_KEY = KEY;
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

            Map<String, Object> responseMap = gson.fromJson(response.body(), Map.class); // Obtener JSON completo
            Map<String, Double> conversionRates = (Map<String, Double>)responseMap.get("conversion_rates"); // Filtrar un mapa del JSON obtenido
            
            return conversionRates.get(to);

        }catch(JsonSyntaxException | IOException | InterruptedException e){
            throw new RuntimeException("Ocurrió un error al obitener la tasa de conversión.");
        }
    }
    
    public static List<String> getRate(){

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";
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

            List<String> listRates = new ArrayList<>();
            for(String rate: conversionRates.keySet()){
                listRates.add(rate);
            }
            return listRates;

        }catch(Exception e){
            throw new RuntimeException("Ocurrió un error al obitener la tasa de conversión.");
        }
    }
}