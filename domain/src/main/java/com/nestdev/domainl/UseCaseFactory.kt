package com.nestdev.domainl


//TODO It is not really factory now, need to make factory later. Moreover, it doesn't work -_-'
abstract class UseCaseFactory {

    companion object {
        var noteRepository: NoteRepository? = null
        fun injectNoteRepository(noteRepo: NoteRepository) {
            noteRepository = noteRepo
        }
    }
}
