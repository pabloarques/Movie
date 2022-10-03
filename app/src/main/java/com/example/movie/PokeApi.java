package com.example.movie;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class PokeApi {

    ArrayList<Pokemon> getPokemon() {
        String url = "https://pokeapi.co/api/v2/pokemon/";

        try {
            String result = HttpUtils.get(url);

            JSONObject jsonResult = new JSONObject(result);
            JSONArray results = jsonResult.getJSONArray("results");

            ArrayList<Pokemon> pokemons = new ArrayList<>();

            for (int i = 0; i < results.length(); i++) {
                JSONObject pokemonJson = results.getJSONObject(i);
                Pokemon pokemon = new Pokemon();

                pokemon.setNombre(pokemonJson.getString("nombre"));
                pokemon.setDetailsURL(pokemonJson.getString("url"));

            String resultDetails = HttpUtils.get(pokemon.getDetailsURL());
            JSONObject jsonDetails = new JSONObject(resultDetails);


            JSONObject sprites = jsonDetails.getJSONObject("sprites");
            String spriteDefault = sprites.getString(("front_default"));
            pokemon.setImage(spriteDefault);

            pokemon.setPeso(jsonDetails.getInt("peso"));

            pokemons.add(pokemon);
            }

            //Log.e("XXPOKEMON", result);
            return pokemons;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}

