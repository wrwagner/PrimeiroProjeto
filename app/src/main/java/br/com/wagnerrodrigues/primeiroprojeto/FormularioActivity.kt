package br.com.wagnerrodrigues.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.wagnerrodrigues.primeiroprojeto.extensions.meuclear
import br.com.wagnerrodrigues.primeiroprojeto.extensions.value
import br.com.wagnerrodrigues.primeiroprojeto.utils.ConstantesExtras
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        buttonLimpar.setOnClickListener {
            inputPeso.meuclear()
            inputAltura.meuclear()
        }

        buttonCalcular.setOnClickListener {
            chamarTelaResultado()
        }

    }

    private fun chamarTelaResultado() {
        val telaresultadoIntent = Intent(this, ResultadoActivity::class.java)
        telaresultadoIntent.putExtra(ConstantesExtras.KEY_PESO, inputPeso.value())
        telaresultadoIntent.putExtra(ConstantesExtras.KEY_ALTURA, inputAltura.value())
        startActivity(telaresultadoIntent)
    }
}
