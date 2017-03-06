package com.emlakjet.devsharing;

public class Emlakjet implements RealtyMarketplace {
    private String name = "Emlakjet";

    private String slogan = "Sen o evi hayal et, gerisi Emlakjet!";

    private int established = 2006;

    private String address = "Kozyatağı, İstanbul";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSlogan() {
        return slogan;
    }

    @Override
    public int getEstablished() {
        return established;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
