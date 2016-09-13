package id.sch.smktelkom_mlg.tugas01.xirpl4033.tugasppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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


    }
}
