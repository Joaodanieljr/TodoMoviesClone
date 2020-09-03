package com.joaodanieljr.todomoviesclone.functions

enum class BuscarGenero (val value: Int) {

    Action(28),
    Adventure(12),
    Animation(16),
    Comedy(35),
    Crime(80),
    Documentary(99),
    Drama(18),
    Family(10751),
    Fantasy(14),
    History(36),
    Horror(27),
    Music(10402),
    Mystery(9648),
    Romance(10749),
    Science_Fiction(878),
    TV_Movie(10770),
    Thriller(53),
    War(10752),
    Western(37);

    //Buscar Genero
    companion object {
            operator fun invoke(value: Int) = values().find {
                it.value == value
            }.toString().replace("_", " ")
        }



}