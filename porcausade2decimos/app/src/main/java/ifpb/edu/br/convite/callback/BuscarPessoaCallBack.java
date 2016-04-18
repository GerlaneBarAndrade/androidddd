package ifpb.edu.br.convite.callback;

import java.util.List;

import ifpb.edu.br.convite.entidades.Pessoa;

public interface BuscarPessoaCallBack {

    void backBuscarNome(List<Pessoa> names);

    void errorBuscarNome(String error);

}

