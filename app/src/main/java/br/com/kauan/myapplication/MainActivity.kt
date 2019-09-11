package br.com.kauan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("info","Executou o onCreate!")
    }

    fun sorteia(view:View){
        var nrSorteado: Int
        var texto:TextView = findViewById(R.id.tv_valor) as TextView


        // Valor gerado entre 0 e 9.
        nrSorteado = Random.nextInt(10)

        texto.setText("Valor= $nrSorteado")



    }
}
