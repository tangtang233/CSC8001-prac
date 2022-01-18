package com.tangwei.csc2017.b1;

import java.util.ArrayList;

/**
 * @author TangWei on 2022/1/18
 */
public class Catalogue {
    private String name;
    private ArrayList<SheetMusic> tunes;

    public Catalogue(String name) {
        this.name = name;
        this.tunes = new ArrayList<>();
    }

    public void addTune(SheetMusic sheetMusic) {
        this.tunes.add(sheetMusic);
    }

    public ArrayList<SheetMusic> tunesMatching(String text) {
        ArrayList<SheetMusic> matchList = new ArrayList<>();
        for (SheetMusic sheetMusic : this.tunes) {
            String title = sheetMusic.getTitle();
            if (title.contains(text)) {
                matchList.add(sheetMusic);
            }
        }
        return matchList;
    }
}
