package com.tangwei.csc2016.b1;

/**
 * @author TangWei on 2022/1/18
 */
public class Note {
    private final String subject;
    private final String contents;

    public Note(String topic, String words) {
        subject = topic;
        contents = words;
    }

    /**
     * search note for some words, return true or false
     */
    public boolean includes(String text) {
        return this.contents.contains(text) || this.subject.contains(text);
    }
}
