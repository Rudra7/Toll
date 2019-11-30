package com.mind.loginregisterapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class paymentActivity extends AppCompatActivity {

    private ListView routeList;
    private ArrayList<String>routes;
    private HashMap<String,Integer> price;
    private TextView payText,displayText;
    private Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        routeList=findViewById(R.id.routeList);
        payText=findViewById(R.id.payText);
        displayText=findViewById(R.id.displayText);
        proceed=findViewById(R.id.ProceedButton);
        price=new HashMap<String, Integer>();
        routes=new ArrayList<String>();
        routes.add("Route 1");
        price.put("Route 1",50);
        routes.add("Route 2");
        price.put("Route 2",75);
        routes.add("Route 3");
        price.put("Route 3",90);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,routes);
        routeList.setAdapter(adapter);
        routeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                payText.setText(""+price.get(routes.get(i)));
                displayText.setVisibility(View.VISIBLE);
                proceed.setVisibility(View.VISIBLE);
                proceed.setEnabled(true);
            }
        });
    }
}
