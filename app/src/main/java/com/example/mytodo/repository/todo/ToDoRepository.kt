package com.example.mytodo.repository.todo

interface ToDoRepository {
    suspend fun create(title: String, detail: String)
}