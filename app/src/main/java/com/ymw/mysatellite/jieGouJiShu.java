package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class jieGouJiShu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jie_gou_ji_shu);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("中心具有卫星结构和分离机构独立自主的研发能力，包括从设计到总装。中心具有ANSYS、Solidworks、Pro-E等各种分析软件，能独立进行各种分析，包括有限元分析、虚拟装配、运动学分析和动力学分析等。中心配有两台大型振动台，可用于整星或部件的振动试验。具有良好合作关系的机械加工单位和后续力学环境试验单位。\n" +
                "\n" +
                "\n" +
                "2010年9月22日，在酒泉卫星发射中心火箭升空13分钟后，两个分离机构顺利将两颗皮星一号A卫星（ZDPS-1A 01星和02星）弹出。\n");
    }
}
