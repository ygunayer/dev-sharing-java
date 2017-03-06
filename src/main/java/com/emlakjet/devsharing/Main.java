package com.emlakjet.devsharing;

public class Main {
    public static void main(String[] args) {
        Emlakjet emlakjet = new Emlakjet();
        Zingat zingat = new Zingat();
        System.out.println(emlakjet.getSlogan() + " <-> " + zingat.getSlogan());
    }
}
