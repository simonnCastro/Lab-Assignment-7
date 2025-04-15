public class TestDocument{
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        System.out.println();

        Document pdf1 = registry.createPdfDocument("annual_report_2024", 150);
        pdf1.open();
        System.out.println("Type:" + pdf1.getType() + ", File:" + ((PdfDocument) pdf1).getFileName()+ ".pdf, Author:" + ((PdfDocument) pdf1).getAuthor()+ ", Pages:" + ((PdfDocument) pdf1).getPageCount());
        System.out.println();
        
        Document text1 = registry.createTextDocument("meeting_notes", 250);
        text1.open();
        System.out.println("Type: " + text1.getType() + ", Path: " + ((TextDocument) text1).getFilePath() + ".txt, Encoding:" + ((TextDocument) text1).getEncoding() + ", Words:" + ((TextDocument) text1).getWordCount());
        System.out.println();

        Document spreadsheet1 = registry.createSpreadsheetDocument("sales_data_q1", 1000, 20);
        spreadsheet1.open();
        System.out.println("Type: " + spreadsheet1.getType() + ", Name:" + ((SpreadsheetDocument) spreadsheet1).getSpreadsheetName() + ".xlsx, Rows:" + ((SpreadsheetDocument) spreadsheet1).getRowCount() + ", Columns:" + ((SpreadsheetDocument) spreadsheet1).getColumnCount());
        System.out.println();

        Document pdf2 = registry.createPdfDocument("summary_report", 30);
        pdf2.open();
    }
}
