package com.example.javanopolis;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loja1(View view){
        Toast.makeText(this.getApplicationContext(), "Compre uma geladeira e pague o dobro!!!", Toast.LENGTH_SHORT).show();
    }
    public void loja2(View view){
        Toast.makeText(this.getApplicationContext(), "Compre duas Televisões e ganhe um pano para limpa-las!!!", Toast.LENGTH_SHORT).show();
    }

    public void loja3(View view){
        Toast.makeText(this.getApplicationContext(), "Gift Card de lol pela metade do preço!!!", Toast.LENGTH_SHORT).show();
    }

    public void loja4(View view){
        Toast.makeText(this.getApplicationContext(), "compre um tênis e ganhe uma meia", Toast.LENGTH_SHORT).show();
    }
}
