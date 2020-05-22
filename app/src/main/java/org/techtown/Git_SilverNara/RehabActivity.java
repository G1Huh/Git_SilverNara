package org.techtown.Git_SilverNara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class RehabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehab);
    }

    //재활운동
    //족저근막염
    public void plantarfasciitis(View v){

        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sQ1IdjdZkxk&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=1"));
        startActivity(intent);

    }

    public void degenerativearthritis1(View v){

        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=y9_oZCSpIcQ&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=5"));
        startActivity(intent);

    }

    public void degenerativearthritis2(View v){

        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OFg3nAMOpJM&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=4"));
        startActivity(intent);

    }
}
