package com.message_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event({R.id.denglu,
            R.id.zhuce,
            R.id.pass})
    private void initDemo(View v) {
        switch (v.getId()) {
            case R.id.denglu:
                Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zhuce:
                Intent it = new Intent(this,ZhuceActivity.class);
                startActivity(it);
                break;
            case R.id.pass:
                Toast.makeText(MainActivity.this, "点击成功", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
