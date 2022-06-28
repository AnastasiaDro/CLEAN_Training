package com.nestdev.domainl


class AddNoteUseCase (noteRepository: NoteRepository) {
    val noteRepo = noteRepository

    fun addNote(note: Note) {
        noteRepo.addSingleNote(note)
    }

}
