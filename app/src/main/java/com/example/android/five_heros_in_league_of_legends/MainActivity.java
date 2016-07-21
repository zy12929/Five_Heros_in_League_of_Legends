package com.example.android.five_heros_in_league_of_legends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goOne(View view){
        Intent newAct = new Intent();
        newAct.setClass(this, Main2Activity.class);

        // 呼叫新的 Activity Class
        startActivity(newAct);
    }

    public void goTwo(View view){
        Intent newAct = new Intent();
        newAct.setClass( this, Main3Activity.class );

        // 呼叫新的 Activity Class
        startActivity( newAct );
    }

    public void goThree(View view){
        Intent newAct = new Intent();
        newAct.setClass( this, Main4Activity.class );

        // 呼叫新的 Activity Class
        startActivity( newAct );
    }

    public void goFour(View view){
        Intent newAct = new Intent();
        newAct.setClass( this, Main5Activity.class );

        // 呼叫新的 Activity Class
        startActivity( newAct );
    }

    public void goFive(View view){
        Intent newAct = new Intent();
        newAct.setClass( this, Main6Activity.class );

        // 呼叫新的 Activity Class
        startActivity( newAct );
    }
}
