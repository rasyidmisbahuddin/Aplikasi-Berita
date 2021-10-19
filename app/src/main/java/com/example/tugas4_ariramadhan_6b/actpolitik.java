package com.example.tugas4_ariramadhan_6b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class actpolitik extends AppCompatActivity {

    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actpolitik);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(actpolitik.this, MainActivity.class); //MainActivity adalah aktivity awal ,praktikum1Activity activity yang akan di tuju
            startActivity(i);
        }});
    }
}
