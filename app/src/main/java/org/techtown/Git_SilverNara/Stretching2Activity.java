package org.techtown.Git_SilverNara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Stretching2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching2);


    }
    //막대기를 활용한 스트레칭(오십견)
    public void barstretch(View v){

        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mv6IxEepexA&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=12"));
        startActivity(intent);

    }


    //벽에 기대서 하는 스트레칭 (오십견)
    public void backstretch(View v){

        Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=KBPc_DhB7So&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=7"));
        startActivity(intent);

    }
}
