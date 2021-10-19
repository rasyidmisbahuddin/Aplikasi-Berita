package com.example.tugas4_ariramadhan_6b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    Button btnhapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        final EditText et = (EditText) findViewById(R.id.username);
        final EditText et_city = (EditText) findViewById(R.id.password);
        Button btn = (Button) findViewById(R.id.btnhapus);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       // Set the first EditText empty
                                       et.setText("");

                                       // Clear the second EditText
                                       et_city.getText().clear();
                                   }
                               });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("tekno") && passwordKey.equals("tekno")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login berhasil",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, actteknologi.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                }
                else if(usernameKey.equals("politik") && passwordKey.equals("politik")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Berhasil",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, actpolitik.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                }
                else if(usernameKey.equals("kesehatan") && passwordKey.equals("kesehatan")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Berhasil",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, actkesehatan.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                }

                    else {
                    //jika login gagal
                    Toast.makeText(getApplicationContext(), "Password yang anda masukan salah",
                            Toast.LENGTH_SHORT).show();
                    }
                }

        }   );
    }
}
