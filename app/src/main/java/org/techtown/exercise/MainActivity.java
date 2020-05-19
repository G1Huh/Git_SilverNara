package org.techtown.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stretch;

        stretch=(Button)findViewById(R.id.stretch);

        stretch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });

        Button muscle;

        muscle=(Button)findViewById(R.id.muscle);

        muscle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (MainActivity.this,Main4Activity.class);
                startActivity(intent);

            }
        });

        Button exercise;

        exercise=(Button)findViewById(R.id.exercise);

        exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (MainActivity.this,Main5Activity.class);
                startActivity(intent);

            }
        });
    }



}




