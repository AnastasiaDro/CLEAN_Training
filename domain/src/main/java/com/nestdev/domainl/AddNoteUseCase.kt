package com.nestdev.domainl

import kotlinx.coroutines.flow.StateFlow
import java.util.*

class AddNoteUseCase (noteRepository: NoteRepository, flow: StateFlow<Note>):
    AbstractUseCase<Note, GetNoteUseCase.Params>() {
    val noteRepo = noteRepository

    override fun buildUseCaseFlow(params: GetNoteUseCase.Params): StateFlow<Note?> {
        return noteRepo.addSingleNote(params.note)
    }

    class Params private constructor(noteId: Int, content: String, date: Date) {
        val note = Note(noteId, content, date)
        var success = true

        companion object {
            fun forNote(noteId: Int, content: String, date: Date): Params {
                return Params(noteId, content, date)
            }
        }
    }
}
