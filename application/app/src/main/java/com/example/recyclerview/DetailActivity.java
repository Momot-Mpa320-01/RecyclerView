package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle arguments = getIntent().getExtras();
        String id = arguments.get("ID").toString();    // Hello World
        detail = findViewById(R.id.detail);
        String str = "";
        for (int i=0;i<Integer.valueOf(id);i++){
            str+="Детальная информация";
            str +="\n";
        }
        detail.setText("Информация об элементе: "+id +"\n"+str);

    }
}