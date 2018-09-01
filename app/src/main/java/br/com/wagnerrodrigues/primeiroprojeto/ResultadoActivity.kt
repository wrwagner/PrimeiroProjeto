package br.com.wagnerrodrigues.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Toast
import br.com.wagnerrodrigues.primeiroprojeto.extensions.format
import br.com.wagnerrodrigues.primeiroprojeto.utils.ConstantesExtras
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val altura = intent.extras.getString(ConstantesExtras.KEY_ALTURA)
        val peso = intent.extras.getString(ConstantesExtras.KEY_PESO)

        calcularIMC(peso.toDouble(), altura.toDouble())
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun calcularIMC(peso: Double, altura: Double) {
        val imc = peso/(altura * altura)

//        if (imc < 17) {
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.magreza)
//        } else if (imc < 18.5){
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.abaixo)
//        } else if (imc < 24.9){
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.ideal)
//        } else if (imc < 29.9){
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.sobre)
//        } else if (imc < 34.9){
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.obesidade)
//        } else if (imc < 39.9){
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.abaixo)
//        } else {
//            tvIMC.setText(imc.toString())
//            setImage(R.drawable.obesidade)



            when (imc) {
            in 0..17 -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.magreza)
                tvIMCDescricao.text = getString(R.string.lbDescricao)
            }
            in 17.1..18.5 -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.abaixo)
                tvIMCDescricao.text = getString(R.string.lbDescricao1)
            }
            in 18.6..24.9 -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.ideal)
                tvIMCDescricao.text = getString(R.string.lbDescricaoPesoIdeal)
            }
            in 29.9..29.9 -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.sobre)
                tvIMCDescricao.text = getString(R.string.lbDescricaoAcimaDoPeso)
            }
            in 29.9..34.9 -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.obesidade)
                tvIMCDescricao.text = getString(R.string.lbDescricaoObesidade1)
            }
            in 34.9..39.9 -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.abaixo)
                tvIMCDescricao.text = getString(R.string.lbDescricaoObesidade2)
            }
            else -> {
                tvIMC.text = imc.format(2)
                setImage(R.drawable.obesidade)
                tvIMCDescricao.text = getString(R.string.lbDescricaoObesidade3)
            }
        }
    }

    fun setImage(resourceId: Int) {
        ivIMC.setImageDrawable(ContextCompat.getDrawable(this,resourceId))
    }
}
