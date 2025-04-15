public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument();
    private TextDocument textPrototype = new TextDocument();
    private SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument();

    public Document createPdfDocument(String fileName, int pageCount) {
        PdfDocument newPdfDocument = pdfPrototype.clone();
        newPdfDocument.setFileName(fileName);
        newPdfDocument.setPageCount(pageCount);
        return newPdfDocument;
    }

    public Document createTextDocument(String filePath, int wordCount) {
        TextDocument newTextDocument = textPrototype.clone();
        newTextDocument.setFilePath(filePath);
        newTextDocument.setWordCount(wordCount);
        return newTextDocument;
    }

    public Document createSpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument newSpreadsheetDocument = spreadsheetPrototype.clone();
        newSpreadsheetDocument.setSpreadsheetName(spreadsheetName);
        newSpreadsheetDocument.setRowCount(rowCount);
        newSpreadsheetDocument.setColumnCount(columnCount);
        return newSpreadsheetDocument;
    }
}
