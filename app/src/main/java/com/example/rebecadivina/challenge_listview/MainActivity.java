package com.example.rebecadivina.challenge_listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.example.rebecadivina.challenge_listview.Carro;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    ListView listView;
    ArrayAdapter arrayAdapter;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para criar as rows eu preciso do Adapter
        // O android ja da uma costumização do layout; android.R.layout.simple_list_item_1

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.arrayCarros));

        listView = findViewById(R.id.lista);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent = new Intent(this, carroActivity.class);
        Carro carro = null;
        switch(i) {
            case 0:
                carro = new Carro("Fiat","Uno",R.drawable.uno);
                break;
            case 1:
                carro = new Carro("Fiat","Palio",R.drawable.palio);
                break;
            case 2:
                carro = new Carro("Volkswagen","Gol",R.drawable.gol);
        }


        intent.putExtra("objCarro", carro);
        startActivity(intent);
        // Pega o nome do componente da lista; listView.getItemAtPosition(i).toString()
        //Toast.makeText(this,listView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
    }


}



