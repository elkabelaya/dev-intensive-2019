package ru.skillbranch.devintensive.models

class Bender(var status:Status = Status.NORMAL, var question:Question = Question.NAME) {

    fun askQuestion():String = when (question){
        Question.NAME -> Question.NAME.question
        Question.PROFESSION -> Question.PROFESSION.question
        Question.MATERIAL -> Question.MATERIAL.question
        Question.BDAY -> Question.BDAY.question
        Question.SERIAL -> Question.SERIAL.question
        Question.IDLE -> Question.IDLE.question
    }



    fun listenAnswer(answer:String): Pair<String, Triple<Int,Int,Int>>{
        if(question.answers.contains(answer)){
            question = question.nextQuestion()
            return "Отлично - это правильный ответ\n${question.question}" to status.color
        } else {
            status = status.nextStatus()
            return "Это не правильный ответ\n" +
                    "${question.question}" to status.color
        }
    }

    enum class Status (val color:Triple<Int, Int, Int>) {
        NORMAL(Triple(255,255,255)),
        WARNING(Triple(255,120,0)),
        DANGER(Triple(255,60,60)),
        CRITICAL(Triple(255,255,0));
        fun nextStatus():Status{
            return if(this.ordinal< values().lastIndex){
                values()[this.ordinal +1]
            } else {
                values()[0]
            }
        }
    }

    enum class Question(val question:String, val answers:List<String>) {
        NAME("Как меня зовут?", listOf("","")),
        PROFESSION("Назови мою профессию?", listOf("","")),
        MATERIAL("Из чего я сделан?", listOf("","")),
        BDAY("Когда меня создали?", listOf("","")),
        SERIAL("Мой серийный номер?", listOf("","")),
        IDLE("На этом все, вопросов больше нет", listOf("",""));

        fun nextQuestion():Question{
            return if(this.ordinal< Question.values().lastIndex){
                Question.values()[this.ordinal +1]
            } else {
                Question.values()[0]
            }
        }
    }
}