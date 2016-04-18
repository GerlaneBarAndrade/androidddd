package ifpb.edu.br.convite.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import ifpb.edu.br.finalconvite.R;
import ifpb.edu.br.convite.asyntask.CadastroAsyncTask;
import ifpb.edu.br.convite.entidades.Pessoa;

public class CadastroActivity extends AppCompatActivity implements OnClickListener{

    private EditText nome;
    private EditText email;
    private EditText endereco;
    private EditText cpf;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.editTextNome);
        email = (EditText) findViewById(R.id.editTextEmail);
        endereco = (EditText) findViewById(R.id.editTextEndereco);
        cpf = (EditText) findViewById(R.id.editTextCpf);


        cadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome.getText().toString());
        pessoa.setEmail(email.getText().toString());
        pessoa.setEndereco(endereco.getText().toString());
        pessoa.setCpf(cpf.getText().toString());

        CadastroAsyncTask cadastroAsyncTask = new CadastroAsyncTask(this);
        cadastroAsyncTask.execute(pessoa);

    }
}
