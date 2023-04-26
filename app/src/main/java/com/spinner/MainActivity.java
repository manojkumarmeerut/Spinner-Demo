package com.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MySpinnerAdapter languageAdapter;
    Spinner spinner;
    List<String> languageList=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.sp_language);

        languageList=new ArrayList<>();

        for(int i=0;i<5;i++){
            languageList.add("Manoj"+(i+1));
        }


        languageAdapter = new MySpinnerAdapter(MainActivity.this, languageList);
        spinner.setAdapter(languageAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position>0) {
                  if(position==4){
                      throw new RuntimeException("Test Crash");
                  }
                }else {
                    Toast.makeText(MainActivity.this, "Select Batch Type", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
