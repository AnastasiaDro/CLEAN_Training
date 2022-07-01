package com.nestdev.domainl

import android.app.Application
import android.content.Context

class AddNoteUseCase () : UseCaseFactory() {

    fun addNote(note: Note) {
        noteRepository?.addSingleNote(note)
    }

    companion object {
        var noteRepository: NoteRepository? = null
        fun injectNoteRepository(noteRepo: NoteRepository) {
            noteRepository = noteRepo
            println("AddNoteUseCase has been  injected")
        }
    }
}
