package br.com.bleiva.tabsapp;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import br.com.bleiva.tabsapp.databinding.UsuarioRowBinding;
import br.com.bleiva.tabsapp.repo.Usuario;

/**
 * Created by Desenvolvedor on 27/04/2017.
 */

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder> {
    private final UsuarioClickListener clickListener;
    private List<Usuario> users;

    public UsuarioAdapter(List<Usuario> users, UsuarioClickListener clickListener) {
        this.users = users;
        this.clickListener = clickListener;
    }

    @Override
    public UsuarioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        UsuarioRowBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.usuario_row, parent, false);
        UsuarioViewHolder vh = new UsuarioViewHolder(binding);

        vh.itemView.setOnClickListener((view -> {
            if (clickListener != null) {
                int pos = vh.getLayoutPosition();
                Usuario usuario = users.get(pos);
                clickListener.OnUsuarioClick(usuario);
            }
        }));

        return vh;
    }

    @Override
    public void onBindViewHolder(UsuarioViewHolder holder, int position) {
        Usuario usuario = users.get(position);
        holder.bind(usuario);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        private final UsuarioRowBinding binding;

        public UsuarioViewHolder(UsuarioRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Usuario usuario) {
            binding.setUsuario(usuario);
            binding.executePendingBindings();
        }
    }
}
