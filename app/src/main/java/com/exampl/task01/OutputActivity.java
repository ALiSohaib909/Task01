package com.exampl.task01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class OutputActivity extends AppCompatActivity {
    public static final String Name = "com.example.task01.Name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

       EditText name = findViewById(R.id.txtname);
      EditText phone = findViewById(R.id.txtPhone);
       EditText address = findViewById(R.id.txtAddress);
Switch Show = findViewById(R.id.btnShow);
Show.setChecked(true);
        Intent i = getIntent();
        String name1 = i.getStringExtra(InputActivity.Name);
        String phone1 = i.getStringExtra("phone");
        String address1 = i.getStringExtra("address");


 //       Intent ii = getIntent();

        name.setText(name1);
        phone.setText(phone1);
        address.setText(address1);

        Button btnNext2 = findViewById(R.id.btnNext2);
        btnNext2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent i = new Intent(OutputActivity.this, CityActivity.class);
                                           Intent ff = new Intent(OutputActivity.this, FinalActivity.class);
//                                            String nameff = name.getText().toString();
//                                            String phoneff = phone.getText().toString();
//                                            String addressff = address.getText().toString();

                                            i.putExtra(Name, name1);
                                            i.putExtra("phone", phone1);
                                            i.putExtra("address", address1);
                                            startActivity(i);


                                        }


                //     startActivity(i);

    });
}
}