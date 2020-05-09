package com.example.user.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;//나중에 지울것

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share_btnClick(View view) {
        Toast.makeText(getApplicationContext(),"공유버튼테스트",Toast.LENGTH_LONG).show();

    }

    public void camera_btnClick(View view) {
        Toast.makeText(getApplicationContext(),"카메라버튼테스트",Toast.LENGTH_LONG).show();

    }
}
