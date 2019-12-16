package com.acculabs.cleanskeleton.dto

import com.google.gson.annotations.SerializedName
import java.util.*

enum class TodoStatus(val status: Int) {
    ACTIVE(0),
    COMPLETED(1);

    companion object {
        fun from(status: Int): TodoStatus? = TodoStatus.values().firstOrNull { it.status == status }
    }
}

enum class TodoType(val type: Int) {
    NORMAL(0),
    HIGH_PRIORITY(1),
    WITH_ATTACHMENT(2);

    companion object {
        fun from(type: Int): TodoType? = TodoType.values().firstOrNull { it.type == type }
    }
}

data class TodoDto(
    var id:String,
    var title: String,
    var content: String,
    var status: TodoStatus,
    var type: TodoType
){
    class Builder {
        private  var id: String = UUID.randomUUID().toString()
        private var title: String = ""
        private var content: String = ""
        private var status: TodoStatus = TodoStatus.ACTIVE
        private var type:TodoType = TodoType.NORMAL

        fun name(title: String) = apply { this.title = title }
        fun content(content: String) = apply { this.content = content }
        fun status(status: TodoStatus) = apply { this.status = status }
        fun type(type: TodoType) = apply { this.type = type }

        fun build() = TodoDto(id,title, content, status, type
        )
    }
}

data class TodoList(
    @SerializedName("todos")
    var todos:List<TodoDto>
)
