package com.tangwei.csc2016.b1;

import java.util.ArrayList;

/**
 * @author TangWei on 2022/1/18
 */
public class Journal {
    private String name;
    private ArrayList<Note> notes;

    public Journal(String name) {
        this.name = name;
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public int notesContaining(String text) {
        int n = 0;
        for (Note note : this.notes) {
            if (note.includes(text)) {
                n++;
            }
        }
        return n;
    }
}
