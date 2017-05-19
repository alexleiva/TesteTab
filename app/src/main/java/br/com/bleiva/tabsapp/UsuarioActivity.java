package br.com.bleiva.tabsapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import org.parceler.Parcels;

import br.com.bleiva.tabsapp.databinding.UsuarioCadastroBinding;
import br.com.bleiva.tabsapp.presenters.SalvaUsuarioPresenter;
import br.com.bleiva.tabsapp.repo.Usuario;

public class UsuarioActivity extends AppCompatActivity {

    public static final String EXTRA_BOOK = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        Usuario usuario = null;

        Parcelable p = getIntent().getParcelableExtra(EXTRA_BOOK);
        usuario = (Usuario) Parcels.unwrap(p);

        UsuarioCadastroBinding usuarioCadastroBinding = DataBindingUtil.setContentView(this, R.layout.activity_usuario);
        usuarioCadastroBinding.setUsuario(usuario);
        usuarioCadastroBinding.setPresenter(new SalvaUsuarioPresenter());

    }

}
