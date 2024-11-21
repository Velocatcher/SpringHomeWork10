package com.github.velocatcher.service;

import com.github.velocatcher.model.Note;

import java.util.List;

public interface NoteService {

    Note createNote(Note note);

    List<Note> getAllNotes();

    Note getNoteById(Long id);

    Note updateNote(Note note);

    void deleteNote(Long id);

}
