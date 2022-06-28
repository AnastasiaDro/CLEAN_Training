package com.nestdev.domainl

class GetNoteUseCase (noteRepository: NoteRepository) {
    val noteRepo = noteRepository

    fun getNote(id: Int) {
        noteRepo.getSingleNote(id)
    }
}
