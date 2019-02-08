package com.example.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();

        test();
    }

    private void test() {


        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();

        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"primer commit",Toast.LENGTH_LONG).show();

        
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
