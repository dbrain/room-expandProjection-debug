package com.tinyfiddler.roomduplicatecolumns.persistence.models.joins

import androidx.room.Embedded
import com.tinyfiddler.roomduplicatecolumns.persistence.models.Bird
import com.tinyfiddler.roomduplicatecolumns.persistence.models.Cat
import com.tinyfiddler.roomduplicatecolumns.persistence.models.Dog

data class DogCatBirdPeople(
    @Embedded(prefix = "cat_") var cat: Cat,
    @Embedded val dog: Dog,
    @Embedded(prefix = "bird_") val bird: Bird? = null
)