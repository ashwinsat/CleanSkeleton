package com.acculabs.cleanskeleton.dataSource.testDataSource

import com.acculabs.cleanskeleton.dto.TodoDto
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class TestDataProviderTest {

    private val candidate: TestDataProvider = TestDataProvider()
    private val mockTestHeapDataProvider = Mockito.mock(TestHeapDataProvider::class.java)

    @Before
    fun setUp() {
        candidate.testHeapDataProvider = mockTestHeapDataProvider
    }

    @After
    fun tearDown() {
    }

    @Test
    fun getAllTodosWhenThereIsData() {
        `when`(mockTestHeapDataProvider.getTodoTestData()).thenReturn(getTodoArrayWithFourItems())
        candidate.init() // TODO : Remove this
        assertEquals(4, candidate.getAllTodos().size)
    }

    @Test
    fun getAllTodosWhenThereIsNoData() {
        `when`(mockTestHeapDataProvider.getTodoTestData()).thenReturn(ArrayList())
        candidate.init() // TODO : Remove this
        assertEquals(0, candidate.getAllTodos().size)
    }

    @Test
    fun getAllTodosWhenThereIsNullData() {
        `when`(mockTestHeapDataProvider.getTodoTestData()).thenReturn(null)
        candidate.init() // TODO : Remove this
        assertEquals(0, candidate.getAllTodos().size)
    }

    private fun getTodoArrayWithFourItems(): ArrayList<TodoDto> {
        return TestHeapDataProvider().getTodoTestData()
    }

    @Test
    fun insert() {
    }

    @Test
    fun update() {
    }

    @Test
    fun delete() {
    }

    @Test
    fun updateTitle() {
    }

    @Test
    fun updateStatus() {
    }

    @Test
    fun updateContent() {
    }
}