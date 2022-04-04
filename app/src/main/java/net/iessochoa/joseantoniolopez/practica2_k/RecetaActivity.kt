package net.iessochoa.joseantoniolopez.practica2_k

import android.content.Intent
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

        tvDescripcion.setOnClickListener(){llamaActivityDatos("Descripción Receta",tvDescripcion.text.toString())}
        tvIngredientes.setOnClickListener(){llamaActivityDatos("Ingredientes Receta",tvIngredientes.text.toString())}
        tvReceta.setOnClickListener(){llamaActivityDatos("Receta",tvReceta.text.toString())}


    }
    private fun llamaActivityDatos(tipo:String,dato:String){
        val i= Intent(this@RecetaActivity, DatosRecetaActivity::class.java)
        i.putExtra(DatosRecetaActivity.EXTRA_TIPO,tipo)
        i.putExtra(DatosRecetaActivity.EXTRA_DATO,dato)
        startActivity(i)
    }


}