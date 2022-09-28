package com.example.movie;

import android.util.Log;

import java.io.IOException;

public class PokeApi {

   public void getPokemon() {
        String url = "https://pokeapi.co/api/v2/pokemon/";

        try{
            HttpUtils.get(url);

        }catch (Exception ex){
                System.out.println(ex.getMessage());
        }
    }

}
