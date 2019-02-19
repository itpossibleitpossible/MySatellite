package com.ymw.mysatellite;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListAdapter adapter = new BaseExpandableListAdapter() {

            int[] logos1 = new int[]{
                    R.drawable.p0,
                    R.drawable.p1,
                    R.drawable.p2
            };


            private String[] theParent = new String[]{"我的微小卫星","微小卫星知识","帮助"};
            private String[][] theChild = new String[][]{
                    {"在轨卫星状况","状态观察","姿态控制"},
                    {"测控技术简介","姿态轨道控制技术简介","综合电子技术简介","结构技术简介","热控技术简介","地面测试技术简介"},
                    {"关于我的微小卫星","关于微小卫星知识"}
            };

            @Override
            public int getGroupCount() {
                return theParent.length;
            }

            @Override
            public int getChildrenCount(int groupPosition) {
                return theChild[groupPosition].length;
            }

            @Override
            public Object getGroup(int groupPosition) {
                return theParent[groupPosition];
            }

            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return theChild[groupPosition][childPosition];
            }

            @Override
            public long getGroupId(int groupPosition) {
                return groupPosition;
            }

            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return childPosition;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            private TextView getTextView(){
                AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT , 100);
                TextView textView = new TextView(MainActivity.this);
                textView.setLayoutParams(lp);
                textView.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
                textView.setPadding(36,0,0,0);
                textView.setTextSize(20);
                return textView;

            }

            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
                LinearLayout ll = new LinearLayout(MainActivity.this);
                ll.setOrientation(LinearLayout.HORIZONTAL);
                ImageView logo = new ImageView(MainActivity.this);
                logo.setImageResource(logos1[groupPosition]);
                ll.addView(logo);
                TextView textView = getTextView();
                textView.setText(getGroup(groupPosition).toString());
                ll.addView(textView);
                return ll;

            }

            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
                TextView textView = getTextView();
                textView.setText(getChild(groupPosition, childPosition).toString());
                return textView;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }
        };
        ExpandableListView expandableListView = (ExpandableListView)findViewById(R.id.list);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                int x =  groupPosition;
                String x1 = String.valueOf(x);
                int y = childPosition;
                String y1 = String.valueOf(y);
                String z = x1 + y1;


                if (z.equals("00")){
                    Intent intent = new Intent(MainActivity.this,zaiGuiWeiXing.class);
                    startActivity(intent);
                }

                if (z.equals("01")){
                    Intent intent = new Intent(MainActivity.this,zhuangTaiGuanCha.class);
                    startActivity(intent);
                }

                if (z.equals("02")){
                    Intent intent = new Intent(MainActivity.this,ziTaiKongZhi.class);
                    startActivity(intent);
                }

                if (z.equals("10")){
                    Intent intent = new Intent(MainActivity.this,ceKongJiShu.class);
                    startActivity(intent);
                }

                if (z.equals("11")){
                    Intent intent = new Intent(MainActivity.this,ziTaiGuiDao.class);
                    startActivity(intent);
                }

                if (z.equals("12")){
                    Intent intent = new Intent(MainActivity.this,zongHeDianZi.class);
                    startActivity(intent);
                }

                if (z.equals("13")){
                    Intent intent = new Intent(MainActivity.this,jieGouJiShu.class);
                    startActivity(intent);
                }

                if (z.equals("14")){
                    Intent intent = new Intent(MainActivity.this,reKongJiShu.class);
                    startActivity(intent);
                }

                if (z.equals("15")){
                    Intent intent = new Intent(MainActivity.this,diMianCeShi.class);
                    startActivity(intent);
                }

                if (z.equals("20")){
                    Intent intent = new Intent(MainActivity.this,guanYuWoDe.class);
                    startActivity(intent);
                }

                if (z.equals("21")){
                    Intent intent = new Intent(MainActivity.this,guanYuWeiXiao.class);
                    startActivity(intent);
                }

                return true;

            }
        });

    }
}


