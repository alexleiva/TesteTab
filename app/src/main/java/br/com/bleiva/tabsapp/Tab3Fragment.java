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

public class Tab3Fragment extends Fragment {

    private static final String TAG = "Tab3Fragment";
    private Button btnTest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab3_fragment, container, false);
        btnTest = (Button) view.findViewById(R.id.btnTab3);
        btnTest.setOnClickListener(view1 -> {
            Toast.makeText(getActivity(), "Clicando no botão 3", Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
