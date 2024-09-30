

abstract class Document {
    public abstract void open();
}

class PDFDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}

class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}

class DocumentFactory {
    public Document createDocument(String docType) {
        switch (docType) {
            case "pdf":
                return new PDFDocument();
            case "word":
                return new WordDocument();
            default:
                throw new IllegalArgumentException("Unknown document type");
        }
    }
}

public class factory {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Document pdfDoc = factory.createDocument("pdf");
        pdfDoc.open();

        Document wordDoc = factory.createDocument("word");
        wordDoc.open();
    }
}
