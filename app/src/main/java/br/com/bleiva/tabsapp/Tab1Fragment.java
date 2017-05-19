package br.com.bleiva.tabsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Desenvolvedor on 24/04/2017.
 */

public class Tab1Fragment extends Fragment {

    private Button btnTeste;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
        btnTeste = (Button) view.findViewById(R.id.btnTab1);
        btnTeste.setOnClickListener((v) -> {
            Toast.makeText(getActivity(), "Testando o click do botão 1", Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
