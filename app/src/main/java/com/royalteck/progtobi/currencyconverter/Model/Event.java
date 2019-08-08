package com.royalteck.progtobi.currencyconverter.Model;

//Event Model for setting Values for Currency Country and the Equivalent Value
public class Event {
    public Double Value;
    public String Country;

    public Event(Double value, String country) {
        Value = value;
        Country = country;
    }

    public Double getValue() {
        return Value;
    }

    public String getCountry() {
        return Country;
    }
}
