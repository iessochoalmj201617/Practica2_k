package net.iessochoa.joseantoniolopez.practica2_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import net.iessochoa.joseantoniolopez.practica2_k.R

class RecetaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)
        val tvDescripcion:TextView=findViewById(R.id.tvDescripcion)
        val tvIngredientes:TextView=findViewById(R.id.tvIngredientes)
        val tvReceta:TextView=findViewById(R.id.tvReceta)


    }
    private fun llamaActivityDatos(tipo:String,dato:String){

    }


}