package ifpb.edu.br.convite.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import ifpb.edu.br.finalconvite.R;
import ifpb.edu.br.convite.asyntask.LoginAsyncTask;
import ifpb.edu.br.convite.entidades.Administrador;

public class LoginActivity extends Activity implements OnClickListener{

    private EditText editTextLogin;
    private EditText editTextSenha;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Administrador administrador = new Administrador();
        administrador.setEmail(editTextLogin.getText().toString());
        administrador.setSenha(editTextSenha.getText().toString());

        LoginAsyncTask loginAsyncTask = new LoginAsyncTask(this);
        loginAsyncTask.execute(administrador);

    }
}
