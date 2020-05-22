package org.techtown.Git_SilverNara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StretchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);

        Button oh;

        oh=(Button)findViewById(R.id.oh);

        oh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (StretchingActivity.this,Stretching2Activity.class);
                startActivity(intent);

            }
        });
    }

    //허리통증
    public void backache(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=W6_nE9BXuTs"));
        startActivity(intent);
    }

    //등산전 스트레칭
    public void hikingstretch(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3sS5ArzXgWg&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=11"));
        startActivity(intent);
    }
    //골프치기전 스트레칭
    public void golfstretch(View v){

        Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=Ebb167KLvKY&list=PLSw2aEElHQkHsuFfhlqGYraZl2efgt6ug&index=6"));
        startActivity(intent);
    }

}
