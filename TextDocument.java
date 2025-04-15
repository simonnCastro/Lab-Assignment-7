public class TextDocument implements Document {
    private String filePath = "Default Text Name";
    private String encoding = "UTF-8";
    private int wordCount = 0;
    
    public TextDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + ".txt with" + encoding + "(" + wordCount + " words)" );
    }

    @Override
    public String getType() {
        return "Text";
    }
}