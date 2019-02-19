package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableRow;
import android.widget.TextView;

public class guanYuWoDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_yu_wo_de);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("    在我的微小卫星里：\n" +
                "    点击在轨卫星概况后，你可以看到在轨卫星的各种参数。\n" +
                "    点击状态观察后，你可以通过手势任意放大缩小，转换观察角度，以此来观察卫星。\n" +
                "    点击姿态控制后，你可以通过输入参数，改变实验室中卫星的姿态。");
    }
}
