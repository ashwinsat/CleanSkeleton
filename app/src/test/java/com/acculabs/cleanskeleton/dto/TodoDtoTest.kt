package com.acculabs.cleanskeleton.dto

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class TodoDtoTest {

    private val testTitle = "TestTitle"
    private val testContent = "TestContent"
    private val testCandidate: TodoDto = TodoDto("id",testTitle, testContent,TodoStatus.ACTIVE,TodoType.NORMAL)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    // Test values are getting assigned
    @Test
    fun testSetter() {
        assertEquals(testCandidate.title, testTitle)
        assertEquals(testCandidate.content, testContent)
    }
}