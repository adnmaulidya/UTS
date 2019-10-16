package com.example.utsku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.utsku.R;

public class Siswa extends AppCompatActivity {
    public static final String NIM_KEY = "nim";
    public static final String NAMA_KEY = "nama";
    public static final String ALAMAT_KEY = "alamat";
    public static final String HANDPHONE_KEY = "handphone";
    public static final String KETERANGAN_KEY = "keterangan";

    private EditText nimInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText handphoneInput;
    private EditText keteranganInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        nimInput = findViewById(R.id.input_nim);
        namaInput = findViewById(R.id.input_nama);
        alamatInput = findViewById(R.id.input_alamat);
        handphoneInput = findViewById(R.id.input_handphone);
        keteranganInput = findViewById(R.id.input_keterangan);
    }

    public void handleSubmit(View view) {
        String nim= nimInput.getText().toString();
        String nama = namaInput.getText().toString();
        String alamat = alamatInput.getText().toString();
        String handphone = handphoneInput.getText().toString();
        String keterangan = keteranganInput.getText().toString();
        Intent intent = new Intent(this, ProfilSiswa.class);

        intent.putExtra(NIM_KEY, nim);
        intent.putExtra(NAMA_KEY, nama);
        intent.putExtra(ALAMAT_KEY, alamat);
        intent.putExtra(HANDPHONE_KEY, handphone);
        intent.putExtra(KETERANGAN_KEY, keterangan);

        startActivity(intent);
    }
}