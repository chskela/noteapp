package com.chskela.noteapp.feature_note.presentation.notes

import com.chskela.noteapp.feature_note.domain.model.Note
import com.chskela.noteapp.feature_note.domain.util.NoteOrder
import com.chskela.noteapp.feature_note.domain.util.OrderType

data class NotesUiState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectorVisible: Boolean = false
)
