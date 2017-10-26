package br.usjt.rodrigobuenodepaiva81513674intermediaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Autor: 81513674-RodrigoBuenoDePaiva
 */
public class MainActivity extends Activity {
    public final static String EXTRA_NUMERO = "br.usjt.rodrigobuenodepaiva81513674intermediaria.EXTRA_NUMERO";
    public final static String EXTRA_MAXIMO = "br.usjt.rodrigobuenodepaiva81513674intermediaria.EXTRA_MAXIMO";

    /**
     * Autor: 81513674-RodrigoBuenoDePaiva
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoCalcular();
    }

    /**
     * Autor: 81513674-RodrigoBuenoDePaiva
     */
    private void botaoCalcular(){
        findViewById(R.id.botao_main_calcular).setOnClickListener(
            new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(MainActivity.this, CalcularTabuadaActivity.class);

                    intent.putExtra(EXTRA_NUMERO,((EditText) findViewById(R.id.edit_text_numero)).getText().toString());
                    intent.putExtra(EXTRA_MAXIMO,((EditText) findViewById(R.id.edit_text_maximo)).getText().toString());

                    startActivity(intent);
                }
            }
        );
    }
}
