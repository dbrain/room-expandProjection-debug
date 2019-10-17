package com.tinyfiddler.roomduplicatecolumns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.room.Room
import com.tinyfiddler.roomduplicatecolumns.persistence.PetDb
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val petDb = Room.databaseBuilder(applicationContext, PetDb::class.java, "pets").build()
            val petsWithSameOwners = petDb.petDao().getDogsWithACatAndOptionalBirdIGuess()
            withContext(Dispatchers.Main) {
                findViewById<TextView>(R.id.misc).text = petsWithSameOwners.map { it.dog.ownerId }.joinToString(",")
            }
        }
    }
}
