package com.ymw.mysatellite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ceKongJiShu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce_kong_ji_shu);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("测控应答机在航天器测控任务中扮演着非常重要的作用，负责接收地面发送的遥控信号、发射遥测信号以及配合地面测控设备完成轨道测量等。中心在测控应答机与微小卫星整合、基于侧音测距的微型USB测控应答机工程样机开发、基于FPGA的小型数字化应答机及伪码测距和高精度载波双向测距等关键技术方面开展了研究。研究中心经过多年积累，研究中取得的主要成果包括：\n" +
                "\n" +
                "1.微小型低功耗测控应答机\n" +
                "\n" +
                "与传统的大卫星应答机相比，皮卫星对测控应答机提出了更高的要求，它要求应答机有更低的功耗、更小的体积和较轻的质量，同时功能却不能减少。项目组使用集成的频率综合器代替传统应答机中的倍频器和滤波器以提高电路的集成度。在理论分析基础上建立数学仿真模型，并以此为基础进行应答机的设计和优化。先后攻克了数字锁相环小信噪比下的数学模型及性能优化、锁相环串联情况下的噪声折叠和相位模糊等问题，研制出满足皮卫星应用要求的测控应答机。研制出微小型测控应答机实物如图所示。\n" +
                "\n" +
                "￼\n" +
                "\n" +
                "该应答机主要技术指标如下：\n" +
                "\n" +
                "(a)测控体制：USB体制；\n" +
                "\n" +
                "(b)重量：52克；\n" +
                "\n" +
                "(c)上行/下行载波相干转发比：221/240；\n" +
                "\n" +
                "(d)接收灵敏度：-96dBm；\n" +
                "\n" +
                "(e)发射功率：100mW；\n" +
                "\n" +
                "(f)总功耗：1.8W。\n" +
                "\n" +
                "\n" +
                "2.软件化多模式测控应答机\n" +
                "\n" +
                "随着大规模集成电路的发展和数字信号处理能力的增强，测控应答机的数字化为其功能、性能及灵活性的提升提供了有力的保障。为了满足新的航天应用，基于软件无线电的设计思想，项目组提出并研究实现了新型的模块化、低功耗及微小型化的高灵敏度数字化测控应答机。中心目前研制的数字化应答机具有模块化、低功耗、微小型化的特点，且能支持USB体制、伪码体制、扩频体制及高速数传等多种模式。下图为利用DSP和FPGA为主实现的数字测控应答机照片。\n" +
                "\n" +
                "￼\n" +
                "\n" +
                "小型数字化测控应答机\n" +
                "\n" +
                "该应答机主要功能及技术指标如下：\n" +
                "\n" +
                "(a)测控体制：支持USB体制、伪码体制、扩频体制及高速数传等；\n" +
                "\n" +
                "(b)总重量：65克；\n" +
                "\n" +
                "(c)伪码速率：1~10Mcps；\n" +
                "\n" +
                "(d)上行/下行载波相干转发比：221/240；\n" +
                "\n" +
                "(e)接收机灵敏度：-155dBm；\n" +
                "\n" +
                "(f)发射功率：100mW；\n" +
                "\n" +
                "(g)总功耗：2.2W。\n" +
                "\n" +
                "\n" +
                "3.高精度伪码测距系统\n" +
                "\n" +
                "在数字化测控应答机研制的基础上，项目组建立了厘米级的高精度伪码测距系统，由两套频点互反的主从S波段测控应答机构成，从端支持伪码再生和转发两种测距模式，主端完成多普勒频率补偿、初相对准及双向距离解算，伪码测距系统的框图如图所示。\n" +
                "\n" +
                "￼\n" +
                "\n" +
                "小型数字化测控应答机\n" +
                "\n" +
                "4.双程转发载波测距系统\n" +
                "\n" +
                "中心在星间高精度测距方面开展了多年研究工作，针对我国卫星编队星间高精度测距所面临的实际问题，提出了一种双程转发载波测距系统。双程转发载波测距是通过射频载波的相位测量来完成的，而载波测距中的整周模糊问题则通过伪码测距的结果来解算。目前项目组在伪码测距方面能达到cm级的测量精度，S波段载波测距的精度达到了0.1mm量级，通过进一步研究预期测距精度可以达到10um量级。\n");

    }
}
