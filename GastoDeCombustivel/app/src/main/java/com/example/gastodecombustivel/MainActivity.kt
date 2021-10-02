package com.example.gastodecombustivel

import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.text.InputFilter
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operator fun Unit.div(editable: Editable?) {


        }
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

    }

    fun clic(view: View) {



      //  val dist = findViewById<EditText>(R.id.edit_distanci)
        val pre = findViewById<EditText>(R.id.edit_Preco)
        val auto = findViewById<EditText>(R.id.edit_autonomia)
        val res = findViewById<TextView>(R.id.textView7)
        val builder = AlertDialog.Builder(this)
        val dist = edit_distanci.text
        //função mostrar mensagen
        fun msg() {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            builder.setTitle("ATENÇÃO")
            builder.setMessage("Voçê tem que preencher os campos")
            builder.show()
        } //verifica se os EditText estao vazios
        when {

            dist.isEmpty() -> {
                msg()
            }
            pre.text.isEmpty() -> {
                msg()
            }
            auto.text.isEmpty() -> {
                msg()
            }
            else -> {
                val y = dist.toString().toFloat()
                val x = pre.text.toString().toFloat()
                val z = auto.text.toString().toFloat()
                val soma = y * x / z
                res.text = "R$ ${"%.2f".format(soma)}"
            }


        }


    }

}




























































