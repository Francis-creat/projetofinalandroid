package britz.luigi.projetofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class Consulta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.consulta)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuHome->
                startActivity(Intent(baseContext, Home::class.java))
        }
        when(item.itemId){
            R.id.menuAgendamento->
                startActivity(Intent(baseContext, Agendamento::class.java))
        }
        when(item.itemId){
            R.id.menuConsulta->
                startActivity(Intent(baseContext, Consulta::class.java))
        }
        return super.onOptionsItemSelected(item)




    }

}
