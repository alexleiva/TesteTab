package br.com.bleiva.tabsapp.repo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

import br.com.bleiva.tabsapp.BR;

/**
 * Created by Desenvolvedor on 26/04/2017.
 */

@Parcel(Parcel.Serialization.BEAN)
public class Usuario extends BaseObservable {
    public String nome;
    public String endereco;

    @ParcelConstructor
    public Usuario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Bindable
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notifyPropertyChanged(BR.nome);
    }

    @Bindable
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        notifyPropertyChanged(BR.endereco);
    }
}
