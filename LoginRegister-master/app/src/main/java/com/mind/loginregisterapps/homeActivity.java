package com.mind.loginregisterapps;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class homeActivity extends AppCompatActivity {

    private TextView toPayView;
    private EditText toPayText;
    private Button paymentButton,proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toPayView=findViewById(R.id.ToPayView);
        toPayText=findViewById(R.id.ToPayText);
        paymentButton=findViewById(R.id.PaymentButton);
        proceedButton=findViewById(R.id.ProceedButton);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPurple)));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.logout){
            // do something
            Intent intent   = new Intent(homeActivity.this,MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (!shouldAllowBack()) {
            doSomething();
        } else {
            super.onBackPressed();
        }
    }

    private void doSomething() {
    }

    private boolean shouldAllowBack() {
        return false;
    }

    public void myfunc(View view)
    {
        toPayText.setVisibility(View.VISIBLE);
        toPayView.setVisibility(View.VISIBLE);
        paymentButton.setEnabled(true);
        proceedButton.setEnabled(false);
    }
}
