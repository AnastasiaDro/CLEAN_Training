package com.nestdev.realsolidtraining

import com.nestdev.data.NoteRepositoryImpl
import com.nestdev.domainl.NoteRepository

//The example of the singletone pattern
//Just for writing something in apllication class
class DependencyInjector {
    fun printHello() = println("Hello, I am SingleTone example instance")
    fun getNoteRepositoryInstance(): NoteRepository {
        if (noteRepository == null)
        {
            noteRepository = NoteRepositoryImpl()
            return noteRepository  as NoteRepository
        } else {
            return noteRepository as NoteRepository
        }
    }

    companion object {

        var noteRepository: NoteRepository? = null


    }
}
