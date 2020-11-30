package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.User
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance(){
        val user = User("1")
        val user2 = User("2","John", "Wick")
        val user3 = User("3", "John", "Silverhand", null, lastVisit = Date(), isOnline = false)
    }

    @Test
    fun test_factory(){
        val user = User.Factory.makeUser("John Wick")
        val user2 = user.copy(id="2", lastName = "Cena", lastVisit = Date())
    }

    @Test
    fun test_decomposition(){
        val user = User.Factory.makeUser("John Wick")
        fun getUserInfo()= user
        val (id, firstName, lastName) = getUserInfo()
    }

    @Test
    fun test_copy(){
        val user = User.Factory.makeUser("John Wick")
        val user2 = user.copy()
        if(user.equals(user2)){

        }
    }
}
