package com.example.BuggyTableExample;

import java.util.ArrayList;

public class ReportData {
    public int rowCount = 30;
    ArrayList<Column> displayTable;

    public ReportData() {
        displayTable = new ArrayList<Column>();
        displayTable.add(new Column("test1", rowCount));
        displayTable.add(new Column("test2", rowCount));
        displayTable.add(new Column("test3", rowCount));
    }

}
