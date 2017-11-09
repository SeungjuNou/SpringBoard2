package com.cafe24.khteam1.common.util;

import java.util.UUID;
 
public class CommonUtils {
     
    public static String getRandomString(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

