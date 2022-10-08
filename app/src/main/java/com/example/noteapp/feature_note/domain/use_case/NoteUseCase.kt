package com.example.noteapp.feature_note.domain.use_case

data class NoteUseCase(
    val getNotes: GetNotesUseCase,
    val deleteNotes: DeleteNoteUseCase
)
