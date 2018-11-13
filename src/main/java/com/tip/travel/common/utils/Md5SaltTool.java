package com.tip.travel.common.utils;

import com.tip.travel.common.exception.UnauthenticatedException;

import java.security.MessageDigest;

public class Md5SaltTool {


    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n += 256;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static boolean validatePassword(String inputPwd, String realPwd, String salt) {
        return MD5Encode(inputPwd, salt).equals(realPwd);
    }

    private static String MD5Encode(String origin, String salt) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(salt.getBytes());
            resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
        } catch (Exception exception) {
            throw new UnauthenticatedException("密码验证失败");
        }
        return resultString.toUpperCase();
    }

    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
            resultSb.append(byteToHexString(b[i]));

        return resultSb.toString();
    }



}