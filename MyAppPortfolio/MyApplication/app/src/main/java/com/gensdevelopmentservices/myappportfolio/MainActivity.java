package com.gensdevelopmentservices.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void movieMessage (View view){
        makeAToast("Popular Movies");
    }
    public void stockMessage (View view){
        makeAToast("stock Hawk");
    }
    public void biggerMessage (View view){
        makeAToast("Build it Bigger");
    }
    public void materialMessage (View view){
        makeAToast("Make Your App Material");
    }
    public void ubiquitousMessage (View view){
        makeAToast("Go Ubiquitous");
    }
    public void capstoneMessage (View view){
        makeAToast("Capstone");
    }

    private void makeAToast(String btnMessage){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + btnMessage + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
