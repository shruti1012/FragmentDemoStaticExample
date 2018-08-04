package com.fragmentdemostaticexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("MainActivity","onCreate");
        setContentView(R.layout.activity_main);
        //Use AddFragment if you want to check fragment lifecycle after oncreate of Activity attached(addFragment on click of button)
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
        // Fragment life Cycle when it attached oncReate method of Activity then use addFragmet under ocreate of activity and comment in activity_main.xml button tag
//        addFragment();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy");
    }

    public void addFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentDemo fragmentDemo = new FragmentDemo();
        fragmentTransaction.add(R.id.fragment,fragmentDemo);
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View v) {
        Log.e("MainActivity","onClick");
        addFragment();
    }
}
