package writers;

public class ConcreteTxtWriterCreator extends WriterCreator {

    @Override
    public WriterProduct createWriter() {
        return new ConcreteTxtWriterProduct();
    }
}
