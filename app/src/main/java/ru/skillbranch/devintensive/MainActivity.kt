package ru.skillbranch.devintensive

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import ru.skillbranch.devintensive.models.Bender

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var androidImage: ImageView
    lateinit var textTxt:TextView
    lateinit var messageEt:EditText
    lateinit var androidObject:Bender
    lateinit var sendBtn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        androidImage = iv_andoid
        textTxt = iv_text
        sendBtn = iv_send
        messageEt = et_message
        androidObject = Bender()

        val status = savedInstanceState?.getString("STATUS") ?: Bender.Status.NORMAL.name
        val question = savedInstanceState?.getString("QUESTION") ?: Bender.Question.NAME.name

        textTxt.setText(androidObject.askQuestion())
        sendBtn.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
        Log.d("tag","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("tag","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("tag","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("tag","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("tag","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("tag","onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("STATUS",androidObject.status.name)
        outState.putString("QUESTION",androidObject.question.name)
    }

    override fun onClick(v:View){
        if(v?.id == R.id.iv_send){
            val(phrase,color)= androidObject.listenAnswer(messageEt.text.toString().toLowerCase())
            messageEt.setText("")
            val(r,g,b) = color
            androidImage.setColorFilter(Color.rgb(r,g,b),PorterDuff.Mode.MULTIPLY)
            textTxt.text = phrase
        }
    }
}
