package com.tangwei.csc2017.b1;

/**
 * @author TangWei on 2022/1/18
 */
public class SheetMusic {
    private String title;
    private String author;
    private String reference;

    public SheetMusic(String title, String author,
                      String reference) {
        this.title = title;
        this.author = author;
        this.reference = reference;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReference() {
        return reference;
    }

    /**
     * search title for some words, return true or false
     */
    public boolean titleMatch(String text) {
        return this.title.contains(text);
    }
}
