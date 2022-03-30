package britz.luigi.projetofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.view.WindowId
import android.widget.*
import androidx.appcompat.app.AlertDialog
import britz.luigi.projetofinal.model.Usuario
import java.text.FieldPosition

class Agendamento : AppCompatActivity() {

    private lateinit var etNome: EditText
    private lateinit var etCpf: EditText
    private lateinit var etEmail: EditText
    private lateinit var etTelefone: EditText
    private lateinit var rgEspecialidades: RadioGroup
    private lateinit var rbClinicoGeral: RadioButton
    private lateinit var rbOtorrino: RadioButton
    private lateinit var rbOftalmo: RadioButton
    private lateinit var rbGineco: RadioButton
    private lateinit var rbDermato: RadioButton
    private lateinit var rbUrologia: RadioButton
    private lateinit var btnAgendar: Button
    private lateinit var btnLimpar: Button
    private lateinit var etData: EditText
    private lateinit var spHorario: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agendamento)
        initialize()
        register()
        clear()

    }

    fun initialize() {
        etNome = findViewById(R.id.etNome)
        etCpf = findViewById(R.id.etCpf)
        etEmail = findViewById(R.id.etEmail)
        etTelefone = findViewById(R.id.etTelefone)
        rgEspecialidades = findViewById(R.id.rgEspecialidades)
        rbClinicoGeral = findViewById(R.id.rbClinicoGeral)
        rbOtorrino = findViewById(R.id.rbOtorrino)
        rbOftalmo = findViewById(R.id.rbOftalmo)
        rbGineco = findViewById(R.id.rbGineco)
        rbDermato = findViewById(R.id.rbDermato)
        rbUrologia = findViewById(R.id.rbUrologista)
        btnAgendar = findViewById(R.id.btnAgendar)
        btnLimpar = findViewById(R.id.btnLimpar)
        etData = findViewById(R.id.etData)
        spHorario = findViewById(R.id.spHorario)


    }

    fun register() {
        btnAgendar.setOnClickListener {
            var usuario = Usuario()
            usuario.nome = etNome.text.toString()
            usuario.cpf = etCpf.text.toString().toInt()
            usuario.email = etEmail.text.toString()
            usuario.telefone = etTelefone.text.toString().toInt()
            usuario.data = etData.text.toString()

            var id: Int = rgEspecialidades.checkedRadioButtonId
            if (id == R.id.rbClinicoGeral) {

                usuario.especialidades = rbClinicoGeral.text.toString()
            } else if (id == R.id.rbOtorrino) {
                usuario.especialidades = rbOtorrino.text.toString()
            } else if (id == R.id.rbOftalmo) {
                usuario.especialidades = rbOftalmo.text.toString()
            } else if (id == R.id.rbGineco) {
                usuario.especialidades = rbGineco.text.toString()
            } else if (id == R.id.rbDermato) {
                usuario.especialidades = rbDermato.text.toString()
            } else
                usuario.especialidades = rbUrologia.text.toString()
            }
            spHorario.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    when (position) {
                        1 -> Toast.makeText(
                            applicationContext,
                            "09:00",
                            Toast.LENGTH_LONG
                        ).show()
                        2 -> Toast.makeText(
                            applicationContext,
                            "09:30",
                            Toast.LENGTH_LONG
                        ).show()
                        3 -> Toast.makeText(
                            applicationContext,
                            "10:00",
                            Toast.LENGTH_LONG
                        ).show()
                        4 -> Toast.makeText(
                            applicationContext,
                            "10:30",
                            Toast.LENGTH_LONG
                        ).show()
                        5 -> Toast.makeText(
                            applicationContext,
                            "11:00",
                            Toast.LENGTH_LONG
                        ).show()
                        6 -> Toast.makeText(
                            applicationContext,
                            "11:30",
                            Toast.LENGTH_LONG
                        ).show()
                        7 -> Toast.makeText(
                            applicationContext,
                            "13:30",
                            Toast.LENGTH_LONG
                        ).show()
                        8 -> Toast.makeText(
                            applicationContext,
                            "14:00",
                            Toast.LENGTH_LONG
                        ).show()
                        9 -> Toast.makeText(
                            applicationContext,
                            "14:30",
                            Toast.LENGTH_LONG
                        ).show()
                        10 -> Toast.makeText(
                            applicationContext,
                            "15:00",
                            Toast.LENGTH_LONG
                        ).show()
                        11 -> Toast.makeText(
                            applicationContext,
                            "15:30",
                            Toast.LENGTH_LONG
                        ).show()
                        12 -> Toast.makeText(
                            applicationContext,
                            "16:00",
                            Toast.LENGTH_LONG
                        ).show()

                        else ->
                            Toast.makeText(
                                applicationContext,
                                "Nenhum Horário foi selecionado..",
                                Toast.LENGTH_LONG
                            ).show()
                    }

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }


            }
            usuario.horario = spHorario.selectedItem.toString()

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Agenda")
            builder.setMessage("" + usuario)
            builder.setNeutralButton("Ok") { _, _ ->
                Toast.makeText(
                    this,
                    "Consulta Agendada com" +
                            "Sucesso", Toast.LENGTH_LONG
                ).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
        fun clear() {
            btnLimpar.setOnClickListener {
                etNome.setText("")
                etCpf.setText("")
                etEmail.setText("")
                etTelefone.setText("")
                etData.setText("")
                rbClinicoGeral.setChecked(false)
                rbOtorrino.setChecked(false)
                rbOftalmo.setChecked(false)
                rbGineco.setChecked(false)
                rbDermato.setChecked(false)
                rbUrologia.setChecked(false)


            }
        }




}