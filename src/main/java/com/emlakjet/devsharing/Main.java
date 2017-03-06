package com.emlakjet.devsharing;

import com.emlakjet.devsharing.marketplace.Emlakjet;
import com.emlakjet.devsharing.marketplace.Sahibinden;
import com.emlakjet.devsharing.marketplace.Zingat;

public class Main {
    public static void main(String[] args) {
        Emlakjet emlakjet = new Emlakjet();
        Zingat zingat = new Zingat();
        Sahibinden sahibinden = new Sahibinden();
        System.out.println(emlakjet.getSlogan() + " <-> " + zingat.getSlogan() + " <-> " + sahibinden.getSlogan());
    }
}
