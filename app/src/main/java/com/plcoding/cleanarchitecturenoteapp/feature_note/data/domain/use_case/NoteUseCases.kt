package com.plcoding.cleanarchitecturenoteapp.feature_note.data.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
)
