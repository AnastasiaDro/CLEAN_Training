package com.nestdev.data

import com.nestdev.domainl.Note
import com.nestdev.domainl.NoteRepository
import kotlinx.coroutines.flow.MutableStateFlow


class DataRepositoryImpl : NoteRepository {
    private val dataSource = DataSource()

    override fun getSingleNote(noteId: Int): Note {
       return  dataSource.getNote(noteId)
    }

    override fun addSingleNote(note: Note): Boolean {
        return dataSource.addNote(note)
    }
}
