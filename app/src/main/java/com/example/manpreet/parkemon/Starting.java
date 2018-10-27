package com.example.manpreet.parkemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Starting extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              opensign_up();
          }

        });

        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignup2();
            }
        });


    }
    public void opensign_up(){
        Intent intent = new Intent(this,sign_up.class);
        startActivity(intent);

    }
    public void openSignup2(){
        Intent intent=new Intent(this,Signup2.class);
        startActivity(intent);
    }
}
