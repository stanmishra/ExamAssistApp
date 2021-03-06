package com.examassistapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [DocumentEntity::class],
    version = 1,
    exportSchema = false
)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): DocumentDao

}