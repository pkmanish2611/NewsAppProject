package com.example.samachar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class lang extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);
        radioGroup = findViewById(R.id.radioGroup);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){


             @Override
             public void onClick(View v) {
                 openActivitymain();
             }
        });
    }

    private void openActivitymain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(radioId);

        Toast.makeText(this, "selected Language Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

}
