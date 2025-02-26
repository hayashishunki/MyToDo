package com.example.mytodo.model.todo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDAO {
    @Query("select * from ToDo where created < :startCreated order by created desc limit :limit")
    fun getWithCreated(startCreated: Long, limit: Int): Flow<List<ToDo>>

    @Insert
    suspend fun create(todo: ToDo): Long

    @Update
    suspend fun update(todo: ToDo): Int

    @Delete
    suspend fun delete(todo: ToDo): Int
}