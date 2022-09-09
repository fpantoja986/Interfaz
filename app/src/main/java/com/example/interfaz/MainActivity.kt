package com.example.interfaz
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var txtSpec: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtSpec= TextToSpeech(this,this)

        findViewById<Button>(R.id.btnPlay).setOnClickListener(){

        }

    }



    override fun onInit(status: Int) {
        if(status == TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.teVTexto).text="Listo!"
        }else{
            findViewById<TextView>(R.id.teVTexto).text="No disponible!"
        }
    }

}