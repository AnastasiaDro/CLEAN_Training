package com.nestdev.realsolidtraining

import android.app.Application
import com.nestdev.data.NoteRepositoryImpl
import com.nestdev.domainl.AddNoteUseCase
import com.nestdev.domainl.GetNoteUseCase
import com.nestdev.domainl.NoteRepository

class NoteApplication : Application() {
   private var noteRepository = NoteRepositoryImpl()
    override fun onCreate() {
        super.onCreate()
        AddNoteUseCase.injectNoteRepository(getNoteRepositoryInstance())
        GetNoteUseCase.injectNoteRepository(getNoteRepositoryInstance())
    }

    private fun getNoteRepositoryInstance(): NoteRepository {
            return noteRepository
    }
}
