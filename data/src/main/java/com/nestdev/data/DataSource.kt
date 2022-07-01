package com.nestdev.data

import com.nestdev.domainl.Note

class DataSource {
    val notesList = mutableListOf<Note>()
    init {
        for (i in 0..10)
            notesList.add( Note(i, "Here is a note number $i"))
    }

    fun getNote(id: Int): Note = notesList[id]

    fun addNote(note: Note): Boolean = notesList.add(note)
}
