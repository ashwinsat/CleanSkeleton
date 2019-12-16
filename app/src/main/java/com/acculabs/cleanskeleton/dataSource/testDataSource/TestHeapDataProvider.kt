package com.acculabs.cleanskeleton.dataSource.testDataSource

import com.acculabs.cleanskeleton.dto.TodoDto
import com.acculabs.cleanskeleton.dto.TodoStatus
import com.acculabs.cleanskeleton.dto.TodoType
import javax.inject.Inject

open class TestHeapDataProvider @Inject constructor(){

    open fun getTodoTestData(): ArrayList<TodoDto> {

        val todoList: ArrayList<TodoDto> = ArrayList()
        for (i in 1..4) {
            val status = if (i % 2 == 0) {
                TodoStatus.ACTIVE
            } else {
                TodoStatus.COMPLETED
            }
            todoList.add(TodoDto.Builder().name("Title$i").content("Content$i").status(status).type(TodoType.NORMAL).build())
        }

        // assests -> stream -> string -> gson() -> model

        return todoList
    }
}