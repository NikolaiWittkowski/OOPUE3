package readers;

import business.Artikel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteCsvReaderProduct extends ReaderProduct {

    private BufferedReader reader;
    private String ersteZeile; // Speichert die erste Zeile für Anzahl der Artikel

    public ConcreteCsvReaderProduct(String dateiPfad) throws IOException {
        this.reader = new BufferedReader(new FileReader(dateiPfad));
        this.ersteZeile = reader.readLine(); // Lese die erste Zeile direkt beim Erstellen
    }

    @Override
    public int leseAnzahlArtikel() throws IOException {
        try {
            return Integer.parseInt(ersteZeile); // Versuche die erste Zeile in eine Zahl umzuwandeln
        } catch (NumberFormatException e) {
            throw new IOException("Ungültige Anzahl Artikel in der CSV-Datei: " + ersteZeile, e);
        }
    }

    @Override
    public Artikel[] leseArtikel() throws IOException {
        int anzahlArtikel = leseAnzahlArtikel();
        Artikel[] artikelArray = new Artikel[anzahlArtikel];
        String zeile;

        for (int i = 0; i < anzahlArtikel; i++) {
            zeile = reader.readLine();
            if (zeile == null) {
                throw new IOException("Unerwartetes Ende der Datei beim Lesen von Artikeln.");
            }

            String[] daten = zeile.split(";");
            if (daten.length != 3) {
                throw new IOException("Ungültiges Datenformat in Zeile: " + zeile);
            }

            artikelArray[i] = new Artikel(
                    Integer.parseInt(daten[0]),  // Artikelnummer
                    daten[1],                   // Artikelname
                    Double.parseDouble(daten[2]) // Basispreis
            );
        }
        reader.close();
        return artikelArray;
    }
}
