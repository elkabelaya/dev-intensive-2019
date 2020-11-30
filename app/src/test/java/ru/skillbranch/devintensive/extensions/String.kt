package ru.skillbranch.devintensive.extensions


import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.utils.Utils
import java.util.*
class StringTest {

    @Test
    fun test_truncate(){
        assertEquals("BendeR Bending Rodriguez — дословно «Сгибальщик Сгибающий Родригес»".truncate(),"BendeR Bending R...")
        assertEquals("Bender Bending Rodriguez — дословно «Сгибальщик Сгибающий Родригес»".truncate(15), "Bender Bending...")
         assertEquals("A     ".truncate(3),"A")

    }
}