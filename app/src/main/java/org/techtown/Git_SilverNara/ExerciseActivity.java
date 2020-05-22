package org.techtown.Git_SilverNara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Button stretch;

        stretch=(Button)findViewById(R.id.stretch);

        stretch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (ExerciseActivity.this,StretchingActivity.class);
                startActivity(intent);

            }
        });

        Button muscle;

        muscle=(Button)findViewById(R.id.muscle);

        muscle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (ExerciseActivity.this,MuscleActivity.class);
                startActivity(intent);

            }
        });

        Button exercise;

        exercise=(Button)findViewById(R.id.exercise);

        exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (ExerciseActivity.this,RehabActivity.class);
                startActivity(intent);

            }
        });
    }



}




