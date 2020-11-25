package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    private String[] maintitle={"Title1","Title2","Title3","Title4"};

    private String[] subtitle={"subtitle1","subtitle1","subtitle1","subtitle1"};

    private Integer[] imgid={R.drawable.fb,R.drawable.google,R.drawable.twi,R.drawable.youtube};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this,maintitle,subtitle,imgid);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                   showLongToast("place your first option code");
                }
                else if(position==1){
                    showLongToast("place your second option code");
                }
                else if(position==2){
                    showLongToast("place your third option code");
                }
                else if (position==3){
                    showLongToast("place your fourth option code");
                }
            }
            public void showLongToast(String massage){
                Toast.makeText(MainActivity.this,massage,Toast.LENGTH_SHORT).show();

            }
        });

    }
}