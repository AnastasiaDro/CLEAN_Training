package com.nestdev.domainl

import kotlinx.coroutines.flow.StateFlow

/**
 * Interface that represents a Repository for getting Note related data.
 */
interface NoteRepository {

    fun getSingleNote(noteId: Int): StateFlow<Note>
    fun addSingleNote(note: Note): StateFlow<Boolean>
}