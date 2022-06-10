package com.plcoding.cleanarchitecturenoteapp.feature_note.data.presentation.util

sealed class Screen(val rout: String) {
    object NoteScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}
