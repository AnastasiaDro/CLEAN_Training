package com.nestdev.data

import com.nestdev.domainl.Note
import com.nestdev.domainl.NoteRepository

class NoteRepositoryImpl : NoteRepository {
    private val dataSource = DataSource()

    override fun getSingleNote(noteId: Int): Note {
       return dataSource.getNote(noteId)
    }

    override fun addSingleNote(note: Note): Boolean {
        return dataSource.addNote(note)
    }
}
