package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class zongHeDianZi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zong_he_dian_zi);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("星载综合电子系统基于资源共享思想，超越传统卫星分系统电子设备范畴，以高性能处理器为核心，数据网为纽带，将星上各单元电子作为一个整体进行优化管理和调度，提高资源利用率，大幅减少星上元器件数量，简化硬件复杂度，提高电系统可靠性。星载综合电子系统是卫星总体级的分系统，是卫星的信息中枢，对卫星的运行起支柱作用。\n" +
                "\n" +
                "\n" +
                "浙江大学微小卫星研究中心综合电子系统相关研究内容包括：基于多商用高性能处理器系统的可靠性设计技术，软、硬件重构技术，高可靠实时通用任务与数据处理软件设计技术，工业级器件航天应用，在轨故障诊断等。\n");
    }
}
