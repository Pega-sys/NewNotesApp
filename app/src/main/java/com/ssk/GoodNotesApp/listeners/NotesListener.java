package com.ssk.GoodNotesApp.listeners;

import com.ssk.GoodNotesApp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
