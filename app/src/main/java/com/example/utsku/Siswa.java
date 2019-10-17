package com.example.utsku;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.utsku.R;

public class Siswa extends AppCompatActivity {
    private EditText nisInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText handphoneInput;
    private EditText keteranganInput;

    String nis, nama, alamat, handphone, keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        nisInput = findViewById(R.id.input_nis);
        namaInput = findViewById(R.id.input_nama);
        alamatInput = findViewById(R.id.input_alamat);
        handphoneInput = findViewById(R.id.input_handphone);
        keteranganInput = findViewById(R.id.input_keterangan);
    }

    public void handleSubmit(View view) {
        nis = nisInput.getText().toString();
        nama = namaInput.getText().toString();
        alamat = alamatInput.getText().toString();
        handphone = handphoneInput.getText().toString();
        keterangan = keteranganInput.getText().toString();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Profil Siswa");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("NIS         : " + nis +
                         "\nNama        : " + nama +
                         "\nAlamat      : " + alamat +
                         "\nHandphone : " + handphone +
                         "\nKeterangan : " + keterangan)
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        Siswa.this.finish();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}