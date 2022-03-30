package britz.luigi.projetofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.ktx.Firebase

class Home : AppCompatActivity() {

    private lateinit var btnAgendarConsulta: Button
    private lateinit var btnConsultar: Button
    private lateinit var btnContato: Button
    private lateinit var btnSobreNos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        btnAgendarConsulta = findViewById(R.id.btnAgendarConsulta)
        btnConsultar = findViewById(R.id.btnConsultar)
        btnContato = findViewById(R.id.btnContato)
        btnSobreNos = findViewById(R.id.btnSobreNos)

        IrParaAgendamento()
        IrParaConsulta()
        IrParaContato()
        IrParaSobre()



    }

    fun IrParaAgendamento() {
        btnAgendarConsulta.setOnClickListener {
            startActivity(Intent(this, Agendamento::class.java))
        }
    }

    fun IrParaConsulta() {

        btnConsultar.setOnClickListener {
            val consulta = Intent(this, Consulta::class.java)
            startActivity(consulta)
        }


    }

    fun IrParaContato() {

        btnContato.setOnClickListener {
            val contato = Intent(this, Contato::class.java)
            startActivity(contato)
        }

    }

    fun IrParaSobre() {

        btnSobreNos.setOnClickListener {
            val sobre = Intent(this, Sobre::class.java)
            startActivity(sobre)


        }

    }
}