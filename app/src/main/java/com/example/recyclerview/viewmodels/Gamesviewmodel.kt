package com.example.recyclerview.viewmodels

import androidx.lifecycle.ViewModel
import com.example.recyclerview.R
import com.example.recyclerview.models.Game

class Gamesviewmodel:ViewModel() {

    init{
        //constructor
    }

    fun getGameList() : ArrayList<Game>{
        val game: Game = Game("Halo 3", 1200, "Xbox 360", R.drawable.halo)
        var gameList: ArrayList<Game> = ArrayList<Game>() //lista vacia de juegos
        gameList.add(game)
        //Agregamos nuestros juegos
        gameList.add(Game("Halo 2", 1000, "Xbox", R.drawable.halo2))
        gameList.add(Game("Halo CE", 800, "Xbox", R.drawable.haloce))
        gameList.add(Game("Halo 3: ODST", 1200, "Xbox 360", R.drawable.halo3odst))
        gameList.add(Game("Halo 4", 1300, "Xbox 306", R.drawable.halo4))
        gameList.add(Game("Halo 5", 1400, "Xbox One", R.drawable.halo5))
        gameList.add(Game("Halo Infinite", 1600, "Xbox Series", R.drawable.haloinfinite))
        gameList.add(Game("Halo Wars", 1000, "Xbox 360", R.drawable.halowars))
        gameList.add(Game("Halo Wars 2", 1400, "Xbox One", R.drawable.halowars2))
        gameList.add(Game("Halo Reach", 800, "Xbox 360", R.drawable.haloreach))
        ////
        return gameList //regresamos la lista de juegos
    }
}