package com.emlakjet.devsharing.marketplace;

public abstract class RealtyMarketplace {
    private String name;

    private String slogan;

    private int established;

    private String address;

    public RealtyMarketplace(String name, String slogan, int established, String address) {
        this.name = name;
        this.slogan = slogan;
        this.established = established;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public int getEstablished() {
        return this.established;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (est. %d)", getSlogan(), getName(), getEstablished());
    }
}
