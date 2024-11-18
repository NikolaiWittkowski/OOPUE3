package readers;

import business.Artikel;
import java.io.IOException;

public abstract class ReaderProduct {
    public abstract int leseAnzahlArtikel() throws IOException;
    public abstract Artikel[] leseArtikel() throws IOException;
}
