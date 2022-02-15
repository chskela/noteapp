package com.chskela.noteapp.feature_note.domain.use_case

import com.chskela.noteapp.feature_note.domain.model.InvalidNoteException
import com.chskela.noteapp.feature_note.domain.model.Note
import com.chskela.noteapp.feature_note.domain.repository.NoteRepository

class InsertNoteUseCase(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title can't be empty!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content can't be empty!")
        }
        repository.insertNote(note)
    }
}