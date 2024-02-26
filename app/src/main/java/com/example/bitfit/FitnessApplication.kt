package com.example.bitfit

import android.app.Application

class FitnessApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}