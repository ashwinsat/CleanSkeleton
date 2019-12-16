package com.acculabs.cleanskeleton.common

import com.acculabs.cleanskeleton.dto.TodoStatus
import com.acculabs.cleanskeleton.dto.TodoType
import com.google.gson.*
import java.lang.reflect.Type

class GsonParser private constructor() {
    companion object {
        var instance: GsonParser = GsonParser()
    }
    val gson: Gson
        get() {
            val gsonBuilder = GsonBuilder()
            gsonBuilder.registerTypeAdapter(TodoStatus::class.java, TodoStatusAdapter())
            gsonBuilder.registerTypeAdapter(TodoStatus::class.java, TodoTypeAdapter())
            return gsonBuilder.create()

        }
}

class TodoStatusAdapter: JsonDeserializer<TodoStatus?>, JsonSerializer<TodoStatus?> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): TodoStatus? {
        return json?.let {
            TodoStatus.from(json.asInt)
        }
    }

    override fun serialize(src: TodoStatus?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        var todoStatus: JsonElement? = null
        src?.let {
            todoStatus = JsonPrimitive(src.status)
        }
        return todoStatus
    }
}

class TodoTypeAdapter: JsonDeserializer<TodoType?>, JsonSerializer<TodoType?> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): TodoType? {
        return json?.let {
            TodoType.from(json.asInt)
        }
    }

    override fun serialize(src: TodoType?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        var todoType: JsonElement? = null
        src?.let {
            todoType = JsonPrimitive(src.type)
        }
        return todoType
    }
}
