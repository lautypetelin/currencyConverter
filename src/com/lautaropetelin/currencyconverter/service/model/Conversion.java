package com.lautaropetelin.currencyconverter.service.model;

public class Conversion {
    
    // Atributos
    private String from;
    private double fromValue;
    private String to;
    private double toValue;
    private String tiempo;
    
    // Constructor
    public Conversion(String from, double fromValue, String to, double toValue, String tiempo) {
        this.from = from;
        this.fromValue = fromValue;
        this.to = to;
        this.toValue = toValue;
        this.tiempo = tiempo;
    }
    
    // Getters y Setters
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public double getFromValue() {
        return fromValue;
    }

    public void setFromValue(double fromValue) {
        this.fromValue = fromValue;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getToValue() {
        return toValue;
    }

    public void setToValue(double toValue) {
        this.toValue = toValue;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}