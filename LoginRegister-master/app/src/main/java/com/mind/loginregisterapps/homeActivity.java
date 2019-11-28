package com.mind.loginregisterapps;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
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
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.reciept){
            // do something
        }
        return super.onOptionsItemSelected(item);
    }
    public void myfunc(View view)
    {
        toPayText.setVisibility(View.VISIBLE);
        toPayView.setVisibility(View.VISIBLE);
        paymentButton.setEnabled(true);
        proceedButton.setEnabled(false);
    }
}
