package com.example.mynoteapp.listeners;

import com.example.mynoteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
