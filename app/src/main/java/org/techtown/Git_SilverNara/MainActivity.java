package org.techtown.Git_SilverNara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_exercise;

        button_exercise=(Button)findViewById(R.id.button_exercise);

        button_exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (MainActivity.this,ExerciseActivity.class);
                startActivity(intent);

            }
        });


        Button button_welfare;

        button_welfare=(Button)findViewById(R.id.button_welfare);

        button_welfare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (MainActivity.this,WelfareActivity.class);
                startActivity(intent);

            }
        });

    }
}
