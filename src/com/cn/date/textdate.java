package com.cn.date;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class textdate {
    public static void main(String[] args) {
        System.out.println("请输入年月（空格隔开）");
        Scanner s1 = new Scanner(System.in);
        String nian = s1.next();
        String yue = s1.next();
        String s = nian+" "+yue;
        Date d1 = new Date();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM");
            Date d2 = sdf.parse(s);
            text001 t01 = new text001(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
