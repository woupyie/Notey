package com.woupyie.notey.model;

public class Note {
    private String noteText;
    private String noteTitle;
    private long noteDate;

    public Note(String noteText, String noteTitle, long noteDate){
        this.noteTitle = noteTitle;
        this.noteText = noteText;
        this.noteDate = noteDate;
    }
}
