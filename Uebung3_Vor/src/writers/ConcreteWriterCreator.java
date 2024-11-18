package writers;

import business.Artikel;

/*public class ConcreteWriterCreator extends WriterCreator {

    // Entscheide, ob ein CSV-Schreiber oder ein Konsole-Schreiber benötigt wird
    private String typ;

    public ConcreteWriterCreator(String typ) {
        this.typ = typ;
    }

    @Override
    public WriterProduct createWriter() {
        if ("csv".equalsIgnoreCase(typ)) {
            return new ConcreteCsvWriterProduct();
        } else if ("konsole".equalsIgnoreCase(typ)) {
            return new ConcreteKonsoleWriterProduct();
        } else {
            throw new IllegalArgumentException("Unbekannter Writer-Typ: " + typ);
        }
    }
}*/
