package com.exampl.task01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
public static final String Name = "com.example.task01.Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        EditText name = (EditText) findViewById(R.id.txtname);
        EditText phone = findViewById(R.id.txtPhone);
       EditText address = findViewById(R.id.txtAddress);

        Button btnNext2 = findViewById(R.id.btnNext2);

btnNext2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String n = name.getText().toString();
        String p = phone.getText().toString();
        String a = address.getText().toString();

        Intent i = new Intent(InputActivity.this, OutputActivity.class);
        Intent ii = new Intent(InputActivity.this, FinalActivity.class);
        i.putExtra(Name, n);
        i.putExtra("phone", p);
        i.putExtra("address", a);

        startActivity(i);


    }
});
     //   Button btnNext2 =
    }
}