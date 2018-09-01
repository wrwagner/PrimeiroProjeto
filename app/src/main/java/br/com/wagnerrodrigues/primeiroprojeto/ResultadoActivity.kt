package br.com.wagnerrodrigues.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.wagnerrodrigues.primeiroprojeto.utils.ConstantesExtras

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val altura = intent.extras.getString(ConstantesExtras.KEY_ALTURA)
        val peso = intent.extras.getString(ConstantesExtras.KEY_PESO)
        Toast.makeText(this,
                peso,
                Toast.LENGTH_SHORT).show()
    }
}
