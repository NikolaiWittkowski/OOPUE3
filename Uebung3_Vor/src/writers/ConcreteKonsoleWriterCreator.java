package writers;

public class ConcreteKonsoleWriterCreator extends WriterCreator {

    @Override
    public WriterProduct createWriter() {
        return new ConcreteKonsoleWriterProduct();
    }
}
