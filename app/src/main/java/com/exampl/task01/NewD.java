package com.exampl.task01;

import android.app.ApplicationExitInfo;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;


public class NewD extends AppCompatDialogFragment {


//private Button y,n;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

      View view  = inflater.inflate(R.layout.dialog1, null);
        builder.setTitle("Task 01")
      .setView(view)
                .setCancelable(false)
      .setPositiveButton("No", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              dismiss();

          }
      })
         .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
      //  dismiss();

        finishAffinity();


        System.exit(1);

    }
});


//        Button no = findViewById(R.id.btnNo);
//        builder.setView(d);

//        yes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.exit(0);
//            }
//        });
//
//        no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Dialog.dismiss();
//            }
//        });
//Button yes =
        return builder.create();


    }

   public void finishAffinity() {
       finishAffinity();
   }

//    private void finish() {
//        finish();
//    }

}
