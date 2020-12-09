package com.exampl.task01;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.Transliterator;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.time.Year;
import java.util.Calendar;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener , DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener{
    public static final String Name = "com.example.task01.Name";

    Button btnTime,btnDate;
    TextView txtDate, txtTime;
    Button btnNext4;
  //  private String currentDateString;
//    private Object Year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(CityActivity.this, R.array.SelectCity, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);





        btnDate = findViewById(R.id.btnDate);
        btnTime = findViewById(R.id.btnTime);
        txtDate = (TextView) findViewById(R.id.txtDate);
        txtTime = findViewById(R.id.txtTime);



        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment date = new DatePickerFragment();
                date.show(getSupportFragmentManager(), "date");
            }
        });
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment time = new TimePickerFragment();
                time.show(getSupportFragmentManager(),"time");
            }
        });

        Intent i = getIntent();
        String name1 = i.getStringExtra(OutputActivity.Name);
        String phone1 = i.getStringExtra("phone");
        String address1 = i.getStringExtra("address");


        btnNext4 = findViewById(R.id.btnNext4);
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CityActivity.this, FinalActivity.class);

                //    f.putExtra("Spinner", spinner.setOnItemClickListener();
                //         String nameff = name1.getText();
                //        String phoneff = phone1.getText().toString();
//                String addressff = address.getText().toString();
//spinner.
                String sp = spinner.getSelectedItem().toString();
                String d = txtDate.getText().toString();
                String t = txtTime.getText().toString();
                i.putExtra(Name, name1);
                i.putExtra("phone", phone1);
                i.putExtra("address", address1);
                i.putExtra("p",sp);
                i.putExtra("date",d);
                i.putExtra("time",t);

                startActivity(i);
            }
        });





//        editTextDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                handleDate();
//            }
//
//        });
//           btnTime.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                handleTime();
//            }
//        });


//    private void handleDate() {
//
//
//        Calendar calendar = Calendar.getInstance();
//
//        int  year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int dayOfMonth = calendar.get(Calendar.DATE);
//
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//
//            }
//        });

    }

//    private void handleTime() {
//        Calendar calendar = Calendar.getInstance();
//
//        int hour = calendar.get(Calendar.HOUR);
//        int minute = calendar.get(Calendar.MINUTE);
//    }
//
//    TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
//        @Override
//        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//
//        }
//    })
//        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//
//            }
//           })



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
Calendar c = Calendar.getInstance();
c.set(Calendar.YEAR, year);
c.set(Calendar.MONTH, month);
c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        txtDate.setText(currentDateString);

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
     //   Calendar c = Calendar.getInstance();

        txtTime.setText("Hour: "+hourOfDay + " Minute: "+ minute);
    }
}

