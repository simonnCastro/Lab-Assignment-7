public class PdfDocument implements Document {
    private String fileName = "Default PDF Name";
    private String author = "Acme Corp";
    private int pageCount = 0;
    
    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getPageCount() {
        return pageCount;
    }  

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public PdfDocument clone() {
        try {
            return (PdfDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + ".pdf by " + author + " (" + pageCount + " pages)" );
    }

    @Override
    public String getType() {
        return "PDF";
    }
}