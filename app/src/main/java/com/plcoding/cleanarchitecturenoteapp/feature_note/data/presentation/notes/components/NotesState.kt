package com.plcoding.cleanarchitecturenoteapp.feature_note.data.presentation.notes.components

import com.plcoding.cleanarchitecturenoteapp.feature_note.data.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
