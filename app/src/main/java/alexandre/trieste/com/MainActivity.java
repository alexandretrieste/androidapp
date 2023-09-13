package alexandre.trieste.com;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNome, editTextSobrenome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextTextNome);
        editTextSobrenome = findViewById(R.id.editTextTextSobrenome);
    }

    public void limparCampos(View view) {
        editTextNome.setText(null);
        editTextSobrenome.setText(null);
        editTextNome.requestFocus();
        Toast.makeText(this, R.string.message_campos_limpos, Toast.LENGTH_SHORT).show();
    }

    public void mostraNomeCompleto(View view) {
        String nome = editTextNome.getText().toString();
        String sobrenome = editTextSobrenome.getText().toString();

        if (nome == null || nome.trim().isEmpty()) {
            Toast.makeText(this, R.string.erro_nome, Toast.LENGTH_SHORT).show();
            editTextNome.requestFocus();
            return;
        }

        if (sobrenome == null || sobrenome.trim().isEmpty()) {
            Toast.makeText(this, R.string.erro_sobrenome, Toast.LENGTH_SHORT).show();
            editTextSobrenome.requestFocus();
            return;
        }

        Toast.makeText(this, nome.trim() + " "+ sobrenome.trim(), Toast.LENGTH_LONG).show();
    }

}