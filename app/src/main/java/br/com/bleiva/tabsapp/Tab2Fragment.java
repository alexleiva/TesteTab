package br.com.bleiva.tabsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.parceler.Parcels;

import java.util.ArrayList;

import br.com.bleiva.tabsapp.repo.Usuario;

/**
 * Created by Desenvolvedor on 24/04/2017.
 */

public class Tab2Fragment extends Fragment {

    private RecyclerView list;
    private UsuarioAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab2_fragment, container, false);

        list = (RecyclerView) view.findViewById(R.id.rvw_grade);
        list.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        list.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        Usuario user1 = new Usuario("Alex", "Nova Veneza");
        Usuario user2 = new Usuario("Luciano", "Içara");
        Usuario user3 = new Usuario("Flávio", "Criciúma");
        Usuario user4 = new Usuario("Eliane", "Nova Veneza");
        Usuario user5 = new Usuario("Charles", "Içara");
        Usuario user6 = new Usuario("Frederico", "Criciúma");
        Usuario user7 = new Usuario("Jr Reis", "Nova Veneza");

        ArrayList<Usuario> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);

        adapter = new UsuarioAdapter(users, usuarioClickListener);
        list.setAdapter(adapter);

        return view;
    }

    UsuarioClickListener usuarioClickListener = (usuario -> {
        Intent it = new Intent(getContext(), UsuarioActivity.class);
        Parcelable p = Parcels.wrap(usuario);
        it.putExtra(UsuarioActivity.EXTRA_BOOK, p);
        startActivity(it);
    });
}
