package readers;

import java.io.IOException;

public class ConcreteCsvReaderCreator extends ReaderCreator {

    @Override
    public ReaderProduct createReader(String dateiPfad) throws IOException {
        return new ConcreteCsvReaderProduct(dateiPfad);
    }
}
