package id.sch.smktelkom_mlg.tugas01.xirpl4033.tugasppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    EditText etNama;
    EditText etTahun;
    RadioButton rbBM, rbM;
    Button bOk;
    CheckBox cbMenggambar, cbMembaca, cbNontonfilm;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etTahun = (EditText) findViewById(R.id.editTextTahun);
        rbBM = (RadioButton) findViewById(R.id.radioButtonBM);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);

        cbMembaca = (CheckBox) findViewById(R.id.checkBoxBC);
        cbMenggambar = (CheckBox) findViewById(R.id.checkBoxGB);
        cbNontonfilm = (CheckBox) findViewById(R.id.checkBoxNF);

        bOk = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        cbMenggambar.setOnCheckedChangeListener(this);
        cbMembaca.setOnCheckedChangeListener(this);
        cbNontonfilm.setOnCheckedChangeListener(this);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });

    }

    private void doProcess() {
        if (isValid()) {

            String nama;
            int tahun = Integer.parseInt(etTahun.getText().toString());
            String status;
            String hobi = null;

            nama = etNama.getText().toString();
            int usia = 2016 - tahun;

            if (cbMenggambar.isChecked()) {
                hobi = cbMenggambar.getText().toString();
            }
            if (cbMembaca.isChecked()) {
                hobi = cbMembaca.getText().toString();
            }
            if (cbNontonfilm.isChecked()) {
                hobi = cbNontonfilm.getText().toString();
            }
            if (rbBM.isChecked()) {
                status = rbBM.getText().toString();
            } else {
                status = rbM.getText().toString();
            }
            tvHasil.setText("Biodata Anda : \n" + "Nama : " + nama + "\nUsia : " + usia + "\nStatus : " + status + "\nHobi : " + hobi + ".");
        }
    }


    public boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String tahun = etTahun.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (tahun.isEmpty()) {
            etTahun.setError("Tahun Kelahiran belum diisi");
            valid = false;
        } else if (tahun.length() != 4) {
            etTahun.setError("Format Tahun Salah");
        } else {
            etTahun.setError(null);
        }
        return valid;
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}