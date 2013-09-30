package com.example.BuggyTableExample;

import java.util.ArrayList;

public class Column {
    public int width = 100;
    public String header;
    public ArrayList<String> textData;

    public Column(String header, int count) {
        this.header = header;
        textData = new ArrayList<String>();

        for (int i=0; i<count; i++) {
            textData.add(String.valueOf(i));
        }
    }
}
