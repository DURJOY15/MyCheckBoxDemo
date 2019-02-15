package com.example.mycheckboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {


    private CheckBox milkcheckBox,sugarcheckbox,watercheckbox;
    private Button showButton;
    private TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkcheckBox=(CheckBox) findViewById(R.id.milkcheckboxID);
        sugarcheckbox=(CheckBox) findViewById(R.id.sugarcheckboxID);
        watercheckbox=(CheckBox) findViewById(R.id.watercheckboxID);



        showButton=(Button) findViewById(R.id.buttonID);
        resultview=(TextView) findViewById(R.id.resultviewID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();


                if(milkcheckBox.isChecked()){
                    String value=milkcheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered\n");
                }
                if(sugarcheckbox.isChecked()){
                    String value=sugarcheckbox.getText().toString();
                    stringBuilder.append(value +" is ordered\n");
                }
                if(watercheckbox.isChecked()){
                    String value=watercheckbox.getText().toString();
                    stringBuilder.append(value +"is ordered\n");
                }
                resultview.setText(stringBuilder);

            }
        });






    }
}
