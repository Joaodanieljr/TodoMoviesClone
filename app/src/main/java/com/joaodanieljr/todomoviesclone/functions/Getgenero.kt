package com.joaodanieljr.todomoviesclone.functions

fun getGenero(generos: List<Int>):MutableList<String>{

    val list:MutableList<String> = mutableListOf()
    for ((i, item) in generos.withIndex()){
        if (i<2)list.add(i,BuscarGenero.invoke(item))
    }
    return list
}