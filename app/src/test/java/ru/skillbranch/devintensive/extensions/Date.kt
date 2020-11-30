package ru.skillbranch.devintensive.extensions


import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

class DateTest {

    @Test
    fun test_format(){
        println(Date().format()) //14:00:00 27.06.19
        println(Date().format("HH:mm")) //14:00

    }
}