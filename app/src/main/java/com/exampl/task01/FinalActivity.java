package com.exampl.task01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class FinalActivity extends AppCompatActivity {
    public static final String Name = "com.example.task01.Name";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        EditText name = findViewById(R.id.txtNamef);
        EditText phone = findViewById(R.id.txtPhonef);
        EditText address = findViewById(R.id.txtAddressf);
        EditText c = findViewById(R.id.txtCityf);
        CheckBox cc = findViewById(R.id.checkBox);
      //  Button b  = findViewById(R.id.btnB);
        EditText d = findViewById(R.id.txtDatef);
        EditText t = findViewById(R.id.txtTimef);

        //       cc.setEnabled(false);

        Intent i = getIntent();
        String name1 = i.getStringExtra(FinalActivity.Name);
        String phone1 = i.getStringExtra("phone");
        String address1 = i.getStringExtra("address");
        String sp = i.getStringExtra("p");
        String dd = i.getStringExtra("date");
        String tt= i.getStringExtra("time");

        name.setText(name1);
        phone.setText(phone1);
        address.setText(address1);
        c.setText(sp);
        t.setText(tt);
        d.setText(dd);
cc.setEnabled(true);


    cc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            OpenDialog();
        }
    } );
                //   if(cc.isChecked()==true){
//                public Dialog onCeaateDialog(Bundle savedInstanceState){


      //          final AlertDialog.Builder a = new AlertDialog.Builder(FinalActivity.this);
//                View d = getLayoutInflater().inflate(R.layout.dialog1, null);
//                Button yes = findViewById(R.id.btnYes);
//                Button no = findViewById(R.id.btnNo);
//                a.setView(d);
//
//                final AlertDialog alertDialog = a.create();
//             //   alertDialog.setCanceledOnTouchOutside(false);
//
//                yes.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        System.exit(0);
//                    }
//                });
//
//                no.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        alertDialog.dismiss();
//                    }
//                });
//
//            } });
//c.toString();
// c1 = i.getStringExtra("spinner");

//spinner.toString();
//= i.("R.array.SelectCity");


    //    Intent a = getIntent();
      //  Spinner spinner = a.getExtras("spinner2");



}
public void OpenDialog(){

        NewD newD = new NewD();
        newD.show(getSupportFragmentManager(),"newD");
}

}