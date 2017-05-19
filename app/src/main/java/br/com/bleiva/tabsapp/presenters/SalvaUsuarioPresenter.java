package br.com.bleiva.tabsapp.presenters;

import android.view.View;
import android.widget.Toast;

import br.com.bleiva.tabsapp.repo.Usuario;

/**
 * Created by Desenvolvedor on 19/05/2017.
 */

public class SalvaUsuarioPresenter {
    public void salvaUsuario(View view, Usuario user) {
        Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
    }
}
