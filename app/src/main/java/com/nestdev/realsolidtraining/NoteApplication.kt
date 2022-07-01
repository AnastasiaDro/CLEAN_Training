package com.nestdev.realsolidtraining

import android.app.Application
import com.nestdev.data.NoteRepositoryImpl
import com.nestdev.domainl.AddNoteUseCase
import com.nestdev.domainl.GetNoteUseCase
import com.nestdev.domainl.NoteRepository

class NoteApplication : Application() {
   private var dependencyInjector = DependencyInjector()

    override fun onCreate() {
        super.onCreate()
        AddNoteUseCase.injectNoteRepository(dependencyInjector.getNoteRepositoryInstance())
        GetNoteUseCase.injectNoteRepository(dependencyInjector.getNoteRepositoryInstance())
    }


}
