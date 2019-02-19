package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class diMianCeShi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di_mian_ce_shi);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("地面测试系统是皮纳卫星功能和性能测试的专用系统，包括电性能测试设备和环境模拟设备。微小卫星研究中心具有3套地面站设备、2台综合测试设备、2台数据采集设备、1套太阳能电池模拟设备，以及2台温度控制箱、1台快速温湿度循环变化箱、1台单轴转台、1台双轴转台、1台三轴转台、1套0.5米真空环境模拟设备、1套1.5米真空环境模拟设备、1台200kg推力振动台、1套温湿振动三综合测试系统。\n");
    }
}
