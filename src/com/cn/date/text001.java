package com.cn.date;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 可视图形化日历
* */
public class text001 {
    public text001(Date nowTime) throws ParseException, UnsupportedEncodingException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM");
        String sdf1 = sdf.format(nowTime);
        //获取当月的一号是星期几
        int xingQiJi;
        String xingQi = sdf1+" 01";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MM dd");
            Date guiding = sdf2.parse(xingQi);
            textDate01 td01 = new textDate01();
             xingQiJi = td01.xDate01(guiding);
            //获取当月长度
        int yveshichang;
        String [] nianyve = sdf1.split(" ");
        String nian = nianyve[0];
        String yve = nianyve[1];
             if(yve.equals("02")){
                 //判断平闰年
                 int year = Integer.parseInt(nian);
                 if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                     yveshichang = 29;
                 }else{
                     yveshichang = 28;
                 }
             }else{
                 String []yveif = {"01","03","05","07","08","10","12"};
                 int i = 0;//条件判断值
                 for(int j = 0;j<yveif.length;j++){
                     if(yve.equals(yveif[j])){
                         i++;
                         break;
                     }
                 }
                 if(i ==  1){
                     yveshichang = 31;
                 }else{
                     yveshichang = 30;
                 }
             }
        System.out.println(nian+"年"+yve+"月");
             //循环输出界面图
        for(int riqi = 1;riqi<=7;riqi++){
            System.out.print(" 星期"+riqi);//1个空格
            System.out.print(" ");
        }
        System.out.println();
        int a;
        for( a = 1;a<xingQiJi;a++){
            System.out.print("      ");//6个空格
        }
        for(int b = 1;b<=yveshichang;b++){
            if(b<10){
                System.out.print("   0"+b+" ");//三个空格
            }else{
                System.out.print("   "+b+" ");//三个空格
            }

            if((a-1+b)%7==0){
                System.out.println();
            }
        }
    }
}
