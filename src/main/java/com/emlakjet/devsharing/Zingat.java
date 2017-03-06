package com.emlakjet.devsharing;

public class Zingat implements RealtyMarketplace {
    private String name = "Zingat";

    private String slogan = "Türkiye'nin akıllı emlak sitesi";

    private int established = 2015;

    private String address = "Kağıthane, İstanbul";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSlogan() {
        return this.slogan;
    }

    @Override
    public int getEstablished() {
        return this.established;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
