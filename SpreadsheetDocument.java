class SpreadsheetDocument implements Document {
    private String spreadsheetName = "name of spreadsheet document";
    private int rowCount = 0;
    private int columnCount = 0;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public SpreadsheetDocument clone() {
        try {
            return (SpreadsheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("A spreadsheet opens: " + spreadsheetName);
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}
