package business;

import readers.ConcreteCsvReaderCreator;
import readers.ReaderCreator;
import readers.ReaderProduct;
import writers.*;

import java.io.IOException;

public class ArtikelModel {

    private Artikel[] artikel = new Artikel[100];
    private int anzahlArtikel;

    public int getAnzahlArtikel() {
        return anzahlArtikel;
    }

    public void setAnzahlArtikel(int anzahlArtikel) {
        this.anzahlArtikel = anzahlArtikel;
    }

    public void leseArtikelAusCsvDatei() throws IOException {
        ReaderCreator creator = new ConcreteCsvReaderCreator();
        ReaderProduct reader = creator.createReader("Artikel.csv");
        this.anzahlArtikel = reader.leseAnzahlArtikel();
        this.artikel = reader.leseArtikel();
    }

    public void schreibeArtikelInTxtDatei() throws IOException {
        WriterCreator creator = new ConcreteTxtWriterCreator();
        WriterProduct writer = creator.createWriter();
        writer.schreibeArtikel(this.getAnzahlArtikel(), this.artikel);
    }
    
    public void schreibeArtikelInKonsole() throws IOException {
        WriterCreator creator = new ConcreteKonsoleWriterCreator();
        WriterProduct writer = creator.createWriter();
        writer.schreibeArtikel(this.getAnzahlArtikel(), this.artikel);
    }
}
