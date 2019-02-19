package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class reKongJiShu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_kong_ji_shu);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("中心具有从事热控设计、热控施工和热试验等相关工作的专业队伍。配备了卫星热控专用的设计软件——SindaFluint，可进行整星或部件的热设计。建立了内径分别为0.5m和1.5m的两套真空环境模拟设备，可自主完成皮纳卫星的热平衡试验和热真空试验。\n" +
                "\n" +
                "\n" +
                "中心在2008 -2009年研制了一颗热控星和一颗初样星，其中热控星专门用于验证热设计的合理性。经过在热控星和初样星上充分地热试验，包括各种拉偏试验，证明了热设计是符合要求并具有较大的设计余量，此外也证明了热控施工的一致性较好。此后，对三颗正样星进行了热试验，其结果和初样星、热控星符合性较好。自2010年9月22日两颗皮卫星成功发射以来，截止2011年9月22日，两颗皮卫星已在轨成功运行一周年。从卫星下传的温度数据来看，在这一年内，皮卫星温度变化范围极小，和地面试验结果一致性较好。\n");
    }
}
