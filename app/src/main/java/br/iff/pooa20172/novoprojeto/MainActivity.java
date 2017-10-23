package br.iff.pooa20172.novoprojeto;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btOk;
    private EditText etNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = (EditText) findViewById(R.id.etNome);
        btOk = (Button) findViewById(R.id.btOk);

        btOk.setOnClickListener(new View.OnClickListener(ialog.Builder(MainActivity.this)){
            @Override
            public void onClick(View v){
                AlertDialog.Builder dig = new AlertDialog()
            }
        });
    }
}
