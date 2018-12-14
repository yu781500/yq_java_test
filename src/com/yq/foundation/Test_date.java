package com.yq.foundation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test_date {
    public static void main(String[] args) throws ParseException, InterruptedException {
        Date date = new Date();
        System.out.println(date);
        /*
            dd : 这个月的几号           DD: 这一年的第几天
            mm : 代表此刻的分钟数       MM: 月份
            hh : 12小时制               HH: 24小时制

            Java里面  MM表示月 mm表示分钟 HH表示 24小时制 hh表示12小时制
            Oracle里面         mm表示月   mi表示分钟      hh24表示小时
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        Date parse = sdf.parse("2017-12-20 00:00:00");


        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("透你娘");
        }
        System.out.println(System.currentTimeMillis());

    }
}
