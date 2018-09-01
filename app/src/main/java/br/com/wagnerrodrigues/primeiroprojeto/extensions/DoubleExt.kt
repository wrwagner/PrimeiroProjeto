package br.com.wagnerrodrigues.primeiroprojeto.extensions

fun Double.format(digitos: Int) = String.format("%.${digitos}f", this)