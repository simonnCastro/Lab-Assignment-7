public class TestDocument{
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        Document pdf1 = registry.createPdfDocument("annual_report_2024", 150);
        pdf1.open();
        System.out.println("Type: " + pdf1.getType() + ", Name: " + ((PdfDocument) pdf1).getFileName());

        Document text1 = registry.createTextDocument("meetiing_notes", 250);
        text1.open();
        System.out.println("Type: " + text1.getType());

        Document spreadsheet1 = registry.createSpreadsheetDocument(5,5);
        spreadsheet1.open();
        System.out.println("Type: " + spreadsheet1.getType() + ", row count: " + ((SpreadsheetDocument) spreadsheet1).getRowCount());

        Document pdf2 = registry.createPdfDocument("summary_report", 30);
        pdf2.open();
    }
}
