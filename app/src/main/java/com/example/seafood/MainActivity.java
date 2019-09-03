package com.example.seafood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seafood.R;

public class MainActivity extends AppCompatActivity {
    Button btn_beli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_beli = findViewById(R.id.beli);

        btn_beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent (MainActivity.this, Beli.class);
                startActivity(intent1);
            }
        });
    }
}
