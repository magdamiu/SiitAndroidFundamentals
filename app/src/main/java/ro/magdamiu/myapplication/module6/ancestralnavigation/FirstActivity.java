package ro.magdamiu.myapplication.module6.ancestralnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ro.magdamiu.myapplication.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void goToSecondActivityOnClick(View view) {
        startActivity(new Intent(FirstActivity.this, SecondActivity.class));
    }
}
