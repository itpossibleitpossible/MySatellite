package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class guanYuWeiXiao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_yu_wei_xiao);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("   在微小卫星知识里：\n" +
                "    你可以了解有关测控技术、姿态轨道控制技术、综合电子技术、结构技术、热控技术、地面测试技术的内容。");
    }
}
