package readers;

import java.io.IOException;

public abstract class ReaderCreator {
    public abstract ReaderProduct createReader(String dateiPfad) throws IOException;
}
