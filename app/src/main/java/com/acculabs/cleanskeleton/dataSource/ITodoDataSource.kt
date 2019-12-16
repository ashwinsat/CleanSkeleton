package com.acculabs.cleanskeleton.dataSource

import com.acculabs.cleanskeleton.dto.TodoDto
import com.acculabs.cleanskeleton.dto.TodoStatus
import com.acculabs.cleanskeleton.dto.TodoType

interface ITodoDataSource {

    fun getAllTodos(): List<TodoDto>
    fun getTodos(status: TodoStatus, type: TodoType): List<TodoDto>
    fun insert(todoDto: TodoDto): Boolean
    fun update(todoDto: TodoDto): Boolean
    fun delete(todoId: String): Boolean
    fun updateTitle(todoId: String, title: String): Boolean
    fun updateStatus(todoId: String, status: TodoStatus): Boolean
    fun updateContent(todoId: String, content: String): Boolean
}