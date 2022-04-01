package net.iessochoa.joseantoniolopez.practica2_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        val btAceptar: Button = findViewById(R.id.btAceptar)
        btAceptar.setOnClickListener() { accionAceptar() }

        val btCancelar: Button = findViewById(R.id.btCancelar)
        btCancelar.setOnClickListener() { finish() }

    }


    private fun accionAceptar() {
        val etNombre: EditText = findViewById(R.id.etNombre)
        val etApellido: EditText = findViewById(R.id.etApellido)
        val tvTitulo:TextView=findViewById(R.id.tvTitulo)
        if(etNombre.text.toString().isEmpty() || etApellido.text.toString().isEmpty())
            Toast.makeText(this@AgendaActivity,"Es necesario introducir el Nombre y el Apellido",Toast.LENGTH_LONG).show()
        else
            tvTitulo.text=etNombre.text.toString()+ " "+etApellido.text.toString()


    }

}