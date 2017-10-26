package br.usjt.rodrigobuenodepaiva81513674intermediaria;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Autor: 81513674-RodrigoBuenoDePaiva
 */
public class CalcularTabuadaActivity extends Activity {
    ArrayList<String> lista;

    /**
     * Autor: 81513674-RodrigoBuenoDePaiva
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_tabuada);

        ListView lista = (ListView) findViewById(R.id.listaTabuada);
        botaoCalcular();
    }

    /**
     * Autor: 81513674-RodrigoBuenoDePaiva
     */
    private void botaoCalcular(){
        int numero = Integer.parseInt(((EditText)findViewById(R.id.edit_text_numero)).getText().toString());
        int maximo = Integer.parseInt(((EditText)findViewById(R.id.edit_text_maximo)).getText().toString());

        for(int i = 1; i <= maximo; i++ ){
            lista.add(numero + " X " + i + " = " + (numero*i));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listaTabuada = (ListView) findViewById(R.id.listaTabuada);
        listaTabuada.setAdapter(adapter);
    }
}
