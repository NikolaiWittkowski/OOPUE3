package main;

import java.io.IOException;
import business.ArtikelModel;

public class Main {

    public static void main(String[] args) {
        ArtikelModel artikelModel = new ArtikelModel();
        try {
            artikelModel.leseArtikelAusCsvDatei();
            artikelModel.schreibeArtikelInTxtDatei();
            artikelModel.schreibeArtikelInKonsole(); // Konsolenausgabe
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
