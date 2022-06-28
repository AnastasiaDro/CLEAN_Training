package com.nestdev.domainl

import kotlinx.coroutines.flow.StateFlow


class GetNoteUseCase(noteRepository: NoteRepository, flow: StateFlow<Note>): AbstractUseCase<Note, GetNoteUseCase.Params>() {
    val noteRepo = noteRepository

    override fun buildUseCaseFlow(params: Params): StateFlow<Note> {
        return noteRepo.getSingleNote(params.id)
    }

    class Params private constructor(noteId: Int) {
        val id = noteId
        companion object {
            fun forNote(noteId: Int): Params {
                return Params(noteId)
            }
        }
    }
}
