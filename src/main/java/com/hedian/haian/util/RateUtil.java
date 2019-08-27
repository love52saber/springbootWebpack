package com.hedian.haian.util;

import java.math.BigDecimal;

/**
 * @Auther: GengYue
 * @Date: 2019/6/6 14:58
 * @Description: 百分比计算工具
 */
public class RateUtil {

    /**
     * 输出百分比
     * @param denominator 分母
     * @param  numerator 分子
     * @param  scale  精确范围
     * @return  java.lang.String
     * @author gy
     * @since 2019/6/6
     */

    public static String convertRate(long numerator, long denominator, int scale) {
        BigDecimal a = new BigDecimal(numerator);
        BigDecimal b=new BigDecimal(denominator);
        String percent = b == null ? "-" : b.compareTo(new BigDecimal(0)) == 0 ? "-": a == null ? "0.00%" : a.multiply(new BigDecimal(100)).divide(b,scale,BigDecimal.ROUND_HALF_UP) + "%";
        return percent;
    }


}
