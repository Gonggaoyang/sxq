package com.cn.date;
import java.text.SimpleDateFormat;
import java.util.*;
/*
* 利用传入的Date参数判断当日是星期几
* */
public class textDate01 {
    public textDate01(){}
    public int  xDate01(Date nowTime){
        //星期数组
        String [] s1 = {"星期一","星期二","星期三","星期四","星期五","星期六"};
        //获取
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String xingqi = sdf.format(nowTime);
        //遍历查找
        for(int i = 0;i<s1.length;i++){
            if(s1[i].equals(xingqi)){
                return i+1;
            }
        }
        return 7;
    }
}