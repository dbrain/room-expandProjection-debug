package com.tinyfiddler.roomduplicatecolumns.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tinyfiddler.roomduplicatecolumns.persistence.dao.PetDao
import com.tinyfiddler.roomduplicatecolumns.persistence.models.Bird
import com.tinyfiddler.roomduplicatecolumns.persistence.models.Cat
import com.tinyfiddler.roomduplicatecolumns.persistence.models.Dog

@Database(
    entities = [
        Dog::class,
        Cat::class,
        Bird::class
    ],
    version = 1
)
abstract class PetDb : RoomDatabase() {
    abstract fun petDao(): PetDao
}