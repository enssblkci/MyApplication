package com.example.enss.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    Button tıklama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"sad",Toast.LENGTH_LONG).show();
        tıklama.findViewById(R.id.btnTıklama);
        tıklama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity();
            }
        });


    }
    
    private void startActivity(){

        Thread myThread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent intent = new Intent(MainActivity.this,SecondClass.class);
                    startActivity(intent);
                    }
                catch (Exception e){
                    e.printStackTrace();
                }
         //denemeaS
            }
        };
        myThread.start();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
