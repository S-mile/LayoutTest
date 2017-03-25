package com.example.admin.layouttraning;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button nextButton;
    private Button preButton;
    private Button nextnextButton;
    private Button prepreButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goPrePage();
    }

    private void goNextPage() {
        setContentView(R.layout.main);
        View.OnClickListener myListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.nextnext:
                        goNextNextPage();
                        break;
                    case R.id.pre:
                        goPrePage();
                        break;
                    default:
                        break;
                }
            }
        };
        preButton = (Button) findViewById(R.id.pre);
        nextnextButton = (Button) findViewById(R.id.nextnext);
        preButton.setOnClickListener(myListener);
        nextnextButton.setOnClickListener(myListener);
    }

    private void goPrePage() {
        setContentView(R.layout.activity_main);
        nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                goNextPage();
            }
        });
    }
    private void goNextNextPage() {
        setContentView(R.layout.tablelayout);
        prepreButton = (Button) findViewById(R.id.prepre);
        prepreButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                goNextPage();
            }
        });
    }

}