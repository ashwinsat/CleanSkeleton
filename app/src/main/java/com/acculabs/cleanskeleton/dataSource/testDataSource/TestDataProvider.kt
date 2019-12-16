package com.acculabs.cleanskeleton.dataSource.testDataSource

import android.content.Context
import android.content.res.AssetManager
import com.acculabs.cleanskeleton.dataSource.ITodoDataSource
import com.acculabs.cleanskeleton.di.AppComponent
import com.acculabs.cleanskeleton.di.AppModule
import com.acculabs.cleanskeleton.di.DaggerAppComponent
import com.acculabs.cleanskeleton.dto.TodoDto
import com.acculabs.cleanskeleton.dto.TodoStatus
import com.acculabs.cleanskeleton.dto.TodoType
import javax.inject.Inject

class TestDataProvider : ITodoDataSource {

    var testHeapDataProvider: TestHeapDataProvider = TestHeapDataProvider()

    private val todoList: ArrayList<TodoDto> = ArrayList()

//    init {
//        todoList.addAll(testHeapDataProvider.getTodoTestData())
//    }

   fun init(){
       DaggerAppComponent.builder().appModule(AppModule()).build()
       val data = testHeapDataProvider.getTodoTestData()
       if(data!=null){
           todoList.addAll(data)
       }
    }

    override fun getAllTodos(): List<TodoDto> {
        return todoList
    }

    override fun getTodos(status: TodoStatus, type: TodoType): List<TodoDto> {
        return emptyList()
    }

    override fun insert(todoDto: TodoDto): Boolean {
        return true
    }

    override fun update(todoDto: TodoDto): Boolean {
        return true
    }

    override fun delete(todoId: String): Boolean {
        return true
    }

    override fun updateTitle(todoId: String, title: String): Boolean {
        return true
    }

    override fun updateStatus(todoId: String, status: TodoStatus): Boolean {
        return true
    }

    override fun updateContent(todoId: String, content: String): Boolean {
        return true
    }
}