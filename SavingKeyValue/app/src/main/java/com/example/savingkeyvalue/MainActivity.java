package com.example.savingkeyvalue;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText text1, text2, text3;
    Button button;

    public static final String preference = "Preference";
    public static final String wordTR = "TRKey";
    public static final String wordEN = "ENKey";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText)findViewById(R.id.editText);
        text2 = (EditText)findViewById(R.id.editText2);

        button = (Button)findViewById(R.id.button);

        sharedpreferences = getSharedPreferences(preference, Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String word1 = text1.getText().toString();
                String word2 = text2.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(wordTR, word1);
                editor.putString(wordEN, word2);
                editor.commit();

                Toast.makeText(MainActivity.this,"Data saved!",Toast.LENGTH_LONG).show();

            }

        });

    }
}

