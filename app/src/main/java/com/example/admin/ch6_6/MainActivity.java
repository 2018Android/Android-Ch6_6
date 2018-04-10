package com.example.admin.ch6_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ImageView img_output;
    private RadioGroup radioGroup;
    private RadioButton rdb_dog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //取得View物件
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rdb_dog = (RadioButton) findViewById(R.id.rdb_dog);
        img_output = (ImageView) findViewById(R.id.img_result);
        // 註冊傾聽者物件
        radioGroup.setOnCheckedChangeListener(listener);
    }
    //  建立傾聽者物件
    private  RadioGroup.OnCheckedChangeListener listener = new  RadioGroup.OnCheckedChangeListener(){
      public void onCheckedChanged(RadioGroup group, int checkedId){
          //判斷選擇哪一個RadioButton物件
          if (checkedId == rdb_dog.getId()){
              img_output.setImageResource(R.drawable.dog);
          }else img_output.setImageResource(R.drawable.elephant);
          
      }
    };
}
