package ru.skillbranch.devintensive.utils


import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

class UtilsTest {

    @Test
    fun test_parseFullName(){
        assertEquals(Utils.parseFullName("qwerty asdfgh")?.first, "qwerty")
        assertEquals(Utils.parseFullName("qwerty asdfgh")?.second, "asdfgh")
        assertEquals(Utils.parseFullName(null), null)
        assertEquals(Utils.parseFullName(""), null)
        assertEquals(Utils.parseFullName(" "), null)
        assertEquals(Utils.parseFullName("John")?.first,"John" )
        assertEquals(Utils.parseFullName("John")?.second,null)
    }

    @Test
    fun test_toInitials() {
        assertEquals(Utils.toInitials("john", "doe"), "JD")
        assertEquals(Utils.toInitials("John", null), "J")
        assertEquals(Utils.toInitials(null, null), null)
        assertEquals(Utils.toInitials(" ", ""), null)
    }
}