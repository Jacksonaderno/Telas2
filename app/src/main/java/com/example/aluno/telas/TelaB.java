package com.example.aluno.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TelaB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b);
        Button btnB = (Button) findViewById(R.id.btnB);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Script", this.getClass().getName() + ".onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Script", this.getClass().getName() + ".onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Script", this.getClass().getName() + ".onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Script", this.getClass().getName() + ".onDestroy");
    }
}