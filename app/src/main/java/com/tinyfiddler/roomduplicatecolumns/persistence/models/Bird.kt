package com.tinyfiddler.roomduplicatecolumns.persistence.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Bird(
    @PrimaryKey val id: String,
    @ColumnInfo(index = true) val ownerId: String? = null
)