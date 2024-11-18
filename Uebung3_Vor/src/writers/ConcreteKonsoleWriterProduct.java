package writers;

import business.Artikel;

public class ConcreteKonsoleWriterProduct extends WriterProduct {

    @Override
    public void schreibeArtikel(int anzahlArtikel, Artikel[] artikel) {
        // Schreibe die Artikelanzahl in die Konsole
        System.out.println("Anzahl vorhandener Artikel: " + anzahlArtikel);
        System.out.println();

        // Schreibe die Artikeldaten in die Konsole
        for (int i = 0; i < anzahlArtikel; i++) {
            System.out.println(artikel[i].getArtikelnummer());
            System.out.println(artikel[i].getArtikelname());
            System.out.printf("%.2f%n", artikel[i].getBasispreis()); // Preis mit zwei Nachkommastellen
            System.out.println(); // Leere Zeile nach jedem Artikel
        }
    }
}
