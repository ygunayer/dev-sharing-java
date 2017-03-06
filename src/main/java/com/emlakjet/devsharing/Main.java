package com.emlakjet.devsharing;

import com.emlakjet.devsharing.marketplace.Emlakjet;
import com.emlakjet.devsharing.marketplace.RealtyMarketplace;
import com.emlakjet.devsharing.marketplace.Sahibinden;
import com.emlakjet.devsharing.marketplace.Zingat;

public class Main {
    public static void main(String[] args) {
        RealtyMarketplace[] marketplaces = new RealtyMarketplace[] { new Emlakjet(), new Sahibinden(), new Zingat() };

        for (RealtyMarketplace market : marketplaces) {
            printMarketplace(market);
        }
    }

    public static void printMarketplace(RealtyMarketplace market) {
        System.out.println(market.getSlogan() + " - " + market.getName() + " (est. " + market.getEstablished() + ")");
    }
}
