package com.nestdev.domainl

class GetNoteUseCase : UseCaseFactory() {

    fun getNote(id: Int) {
        noteRepository?.getSingleNote(id)
    }

    companion object {
        var noteRepository: NoteRepository? = null
        fun injectNoteRepository(noteRepo: NoteRepository) {
            noteRepository = noteRepo
            println("GetNoteUseCase has been injected")
        }
    }
}
