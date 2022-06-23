package com.e.inputdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ip;
Button ck;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         res=findViewById(R.id.res);
        ip=findViewById(R.id.ip);

        ck=findViewById(R.id.ck);

        ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data= ip.getText().toString();
                int a=Integer.parseInt(data);
                int i=1;
                res.setText("");
                while (i<=a)
                {
                    res.append(i+"\n");
                    i++;
                }
//                if(a%2==0)
//                {
//                    Toast.makeText(MainActivity.this, "Yeh tho even hain", Toast.LENGTH_SHORT).show();
//                    res.setText(ip.getText());
//                }
//                else
//                {
//                    Toast.makeText(MainActivity.this, "woh tho odd hain", Toast.LENGTH_SHORT).show();
//                    res.setText("it is odd number");
//                }
                // check whether it is prime or not
                // strong or not
                // armstrong or not
                // Adome number  or not
                // design login page
                // calculator app
//                Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
//                res.setText(data);
            }
        });




    }
}