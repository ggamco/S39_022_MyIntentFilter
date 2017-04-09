package com.gmbdesign.main;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.enlace);
        textView.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent();
                //seteo la accion
                intent.setAction("android.intent.action.VIEW");
                //preparo el data
                Uri uri = Uri.parse("http://www.as.com");
                //seteo el data
                intent.setData(uri);
                startActivity(intent);
                return false;
            }
        });
    }
}
