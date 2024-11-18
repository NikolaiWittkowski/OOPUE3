package writers;

import java.io.IOException;

public class ConcreteWriterCreator extends WriterCreator {
    @Override
    public WriterProduct createWriter(String type) throws IOException {
        if (type.equals("txt")) {
            return new ConcreteTxtWriterProduct();
        } else if (type.equals("konsole")) {
            return new ConcreteKonsoleWriterProduct();
        } else {
            throw new IllegalArgumentException("Unknown writer type");
        }
    }
}

//Anpassung für Main
public void schreibeArtikelInDateiOderKonsole(String type, Artikel[] artikel) throws IOException {
    ConcreteWriterCreator creator = new ConcreteWriterCreator();
    WriterProduct writer = creator.createWriter(type);
    writer.schreibeArtikel(artikel.length, artikel);
}

