package com.example.utsku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.utsku.R;

public class ProfilSiswa extends AppCompatActivity {
    private TextView nimText;
    private TextView namaText;
    private TextView alamatText;
    private TextView handphoneText;
    private TextView keteranganText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_siswa);

        // TODO: bind here
        nimText = findViewById(R.id.text_nim);
        namaText = findViewById(R.id.text_nama);
        alamatText = findViewById(R.id.text_alamat);
        handphoneText = findViewById(R.id.text_handphone);
        keteranganText = findViewById(R.id.text_keterangan);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            nimText.setText(extras.getString("nim"));
            namaText.setText(extras.getString("nama"));
            alamatText.setText(extras.getString("alamat"));
            handphoneText.setText(extras.getString("handphone"));
            keteranganText.setText(extras.getString("keterangan"));
        }
    }
}