package com.example.movie;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.movie.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);


       ArrayList <String> items = new ArrayList<>();
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(),
                R.layout.lv_pokemon_row,
                R.id.txtPoke,
                items

        );

        binding.lvPokemon.setAdapter(adapter);

        // refresh();



    }

    private void refresh() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() ->{
            PokeApi api = new PokeApi();
            ArrayList <Pokemon> pokemons = api.getPokemon();


            //adapter.clear();
            //adapter.addAll(pokemons);

        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}