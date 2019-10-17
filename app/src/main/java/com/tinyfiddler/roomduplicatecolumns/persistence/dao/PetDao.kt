package com.tinyfiddler.roomduplicatecolumns.persistence.dao

import androidx.room.Dao
import androidx.room.Query
import com.tinyfiddler.roomduplicatecolumns.persistence.models.joins.DogCatBirdPeople

@Dao
interface PetDao {
    @Query("SELECT * FROM Dog INNER JOIN Cat AS cat_ ON cat_.ownerId = Dog.ownerId LEFT JOIN Bird AS bird_ ON bird_.ownerId = Dog.ownerId")
    suspend fun getDogsWithACatAndOptionalBirdIGuess(): List<DogCatBirdPeople>
}