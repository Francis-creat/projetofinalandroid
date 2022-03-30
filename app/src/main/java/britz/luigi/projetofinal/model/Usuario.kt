package britz.luigi.projetofinal.model

import android.widget.RadioGroup

class Usuario {
    var nome : String?= null
    var cpf : Int?= null
    var email : String?= null
    var telefone : Int?= null
    var especialidades : String?= null
    var data : String?= null
    var horario : String?= null
    override fun toString(): String {
        return "Usuario(nome=$nome, " +
                "cpf=$cpf, " +
                "email=$email, " +
                "telefone=$telefone, " +
                "especialidades=$especialidades, " +
                "data=$data, " +
                "horario=$horario)"
    }


}