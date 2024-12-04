package com.example.shredsweat

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history-table")
data class HistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: String = "",
    val totalExerciseDone: Int = 0
)
