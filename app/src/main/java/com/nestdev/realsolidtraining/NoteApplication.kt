package com.nestdev.realsolidtraining

import android.app.Application
import android.content.Context

class NoteApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SingleToneExample.getInstanse()
    }
}
