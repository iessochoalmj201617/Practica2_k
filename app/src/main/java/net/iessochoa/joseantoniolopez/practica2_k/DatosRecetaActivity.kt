package net.iessochoa.joseantoniolopez.practica2_k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DatosRecetaActivity : AppCompatActivity() {
    companion object {
        //Clave que permite recibir un texto que mostrará en pantalla
        val  EXTRA_DATO="practica2.DatosRecetaActivity.dato"
        val  EXTRA_TIPO="practica2.DatosRecetaActivity.tipo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_receta)


        val tvTipo:TextView=findViewById(R.id.tvTipoDato)
        tvTipo.text=intent.getStringExtra(EXTRA_TIPO)

        val tvDato:TextView=findViewById(R.id.tvDatos)
        tvDato.text=intent.getStringExtra(EXTRA_DATO)
    }

}