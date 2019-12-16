package com.acculabs.cleanskeleton.dataSource.testDataSource

import android.content.Context
import com.acculabs.cleanskeleton.common.GsonParser
import com.acculabs.cleanskeleton.di.AppModule
import com.acculabs.cleanskeleton.di.DaggerAppComponent
import com.acculabs.cleanskeleton.dto.TodoDto
import com.acculabs.cleanskeleton.dto.TodoList
import javax.inject.Inject

class TestAssetsDataProvider @Inject constructor() {
     var  context: Context = DaggerAppComponent.builder().appModule(AppModule()).build().getApplication()

    fun getTodoTestData(): List<TodoDto> {

        var todoList: List<TodoDto>? = null
        val jsonString = context.assets.open("todoList.json").bufferedReader().use{
            it.readText()
        }

        todoList = GsonParser.instance.gson.fromJson(jsonString, TodoList::class.java).todos
        // assests -> stream -> string -> gson() -> model

        return todoList ?: emptyList()
    }

}