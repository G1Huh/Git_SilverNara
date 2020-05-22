package org.techtown.Git_SilverNara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MuscleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle);
    }


    //근력-허리통증
    public void backache2(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Qrn9a9Kepyc&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=10"));
        startActivity(intent);

    }

    public void shoulderache(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kxrCD3w5F24&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=8"));
        startActivity(intent);
    }
    public void knee(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=n2wcLTxhUAU&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=2"));
        startActivity(intent);
    }
}


