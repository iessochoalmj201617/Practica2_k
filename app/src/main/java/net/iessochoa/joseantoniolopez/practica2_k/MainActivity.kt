package net.iessochoa.joseantoniolopez.practica2_k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btAgenda:Button=findViewById(R.id.btnEjercicio1)
        btAgenda.setOnClickListener(){
            startActivity(Intent(this@MainActivity,AgendaActivity::class.java))
        }
    }
}