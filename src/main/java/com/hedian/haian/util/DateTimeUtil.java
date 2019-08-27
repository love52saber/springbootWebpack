package com.hedian.haian.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Utils - 日期/时间转换
 *
 * @author XFaMi Team
 * @version 1.0
 */
public final class DateTimeUtil {

    /**
     *  G    Era    标志符            Text    公元
     y    年                    Year    1996; 96
     M    年中的月份                Month    July; Jul; 07
     w    年中的周数                Number    27
     W    月份中的周数            Number    2
     D    年中的天数                Number    189
     d    月份中的天数            Number    10
     F    月份中的星期            Number    2
     E    星期中的天数            Text    Tuesday; Tue
     a    am/pm 标记            Text    PM
     H    一天中的小时数（0-23）    Number    0
     k    一天中的小时数（1-24）    Number    24
     K    am/pm 中的小时数（0-11）    Number    0
     h    am/pm 中的小时数（1-12）    Number    12
     m    小时中的分钟数            Number    30
     s    分钟中的秒数            Number    55
     S    毫秒数                Number    978
     z    时区    General time zone    Pacific Standard Time; PST; GMT-08:00
     Z    时区    RFC 822 time zone    -0800
     */


    /**
     * 中国时区
     */
    public final static String TIME_ZONE_CN = "GMT+8";

    /**
     * 把时间格式化成如：2002-08-03 8:26:30.400 am 格式的字符串
     */
    public final static String FMT_yyyyMMddHHmmssSa_12 = "yyyy-MM-dd KK:mm:ss.S a";

    /**
     * 把时间格式化成如：2002-08-03 8:26:16 am 格式的字符串
     */
    public final static String FMT_yyyyMMddHHmmssa_12 = "yyyy-MM-dd KK:mm:ss a";

    /**
     * 把时间格式化成如：2002-08-03 8:26 am 格式的字符串
     */
    public final static String FMT_yyyyMMddHHmma_12 = "yyyy-MM-dd KK:mm a";

    /**
     * 把时间格式化成如：2002-08-03 8 am 格式的字符串
     */
    public final static String FMT_yyyyMMddHHa_12 = "yyyy-MM-dd KK a";

    /**
     * 把时间格式化成如：2002-08-03 08:26:30.400 am  格式的字符串
     */
    public final static String FMT_yyyyMMddHHmmssSa = "yyyy-MM-dd HH:mm:ss.S a";

    /**
     * 把时间格式化成如：2002-08-03 08:26:30.400 格式的字符串
     */
    public final static String FMT_yyyyMMddHHmmssS = "yyyy-MM-dd HH:mm:ss.S";

    /**
     * 把时间格式化成如：2002-08-03 08:26:16 格式的字符串
     */
    public final static String FMT_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";

    /**
     * 把时间格式化成如：2002-08-03 08:26 格式的字符串
     */
    public final static String FMT_yyyyMMddHHmm = "yyyy-MM-dd HH:mm";

    /**
     * 把时间格式化成如：2002-08-03 08 格式的字符串
     */
    public final static String FMT_yyyyMMddHH = "yyyy-MM-dd HH";

    /**
     * 把时间格式化成如：2002-07-05 am 格式的字符串
     */
    public final static String FMT_yyyyMMdda = "yyyy-MM-dd a";

    /**
     * 把时间格式化成如：2002-07-05 格式的字符串
     */
    public final static String FMT_yyyyMMdd = "yyyy-MM-dd";

    /**
     * 把时间格式化成如：2002-07 格式的字符串
     */
    public final static String FMT_yyyyMM = "yyyy-MM";

    /**
     * 把时间格式化成如：20020803082630400格式的(17位)字符串
     */
    public final static String FMT_yyyyMMddHHmmssS_17 = "yyyyMMddHHmmssS";

    /**
     * 把时间格式化成如：20020803082630格式的(14位)字符串
     */
    public final static String FMT_yyyyMMddHHmmss_14 = "yyyyMMddHHmmss";

    /**
     * 把时间格式化成如：20020806 格式的(8位)字符串
     */
    public final static String FMT_yyyyMMdd_8= "yyyyMMdd";

    /**
     * 把时间格式化成如：200208 格式的(6位)字符串
     */
    public final static String FMT_yyyyMM_6= "yyyyMM";

    /**
     * 把时间格式化成如：12:08 PM(下午) 格式的字符串
     */
    public final static String FMT_HHmmA_12 = "KK:mm a";

    /**
     * 把时间格式化成如：0:55 AM上午，CST 格式的字符串
     */
    public final static String FMT_HHmmAz_12 = "KK:mm a,z";

    /**
     * 把时间格式化成如：0:56 AM上午，中国标准时间 格式的字符串
     */
    public final static String FMT_HHmmAzzzz_12 = "KK:mm a,zzzz";

    /**
     * 把时间格式化成如：12:08:23 am 格式的字符串
     */
    public final static String FMT_HHmmssA_12 = "KK:mm:ss a";

    /**
     * 把时间格式化成如：0:55:33 AM上午，CST 格式的字符串
     */
    public final static String FMT_HHmmssAz_12 = "KK:mm:ss a,z";

    /**
     * 把时间格式化成如：0:56:23 AM上午，中国标准时间 格式的字符串
     */
    public final static String FMT_HHmmssAzzzz_12 = "KK:mm:ss a,zzzz";

    /**
     * 把时间格式化成如：22:04:45 格式的字符串
     */
    public final static String FMT_HHmmss = "HH:mm:ss";

    /**
     * 把时间格式化成如：22:04:45.824 格式的字符串
     */
    public final static String FMT_HHmmssS = "HH:mm:ss.S";

    /**
     * 把时间格式化成如：22:04 格式的字符串
     */
    public final static String FMT_HHmm = "HH:mm";

    /**
     * 把时间格式化成如：22:04，CST 格式的字符串
     */
    public final static String FMT_HHmmz = "HH:mm,z";

    /**
     * 把时间格式化成如：22:04，中国标准时间 格式的字符串
     */
    public final static String FMT_HHmmzzzz = "HH:mm,zzzz";

    /**
     * 把时间格式化成如：Sun,Nov 14,'2004 格式的字符串
     */
    public final static String FMT_WWMMDDYY_EN = "EEE,MMM d,''yyyy";

    /**
     * 把时间格式化成如：星期日，2004年十一月14号 格式的字符串
     */
    public final static String FMT_WWMMDDYY_CN = "EEE,yyyy年MMMd号";

    /**
     * 把时间格式化成如：Sun,Nov 14,'2004 格式的字符串
     */
    public final static String FMT_MMDDYY_EN = "MMM d,''yyyy";

    /**
     * 把时间格式化成如：星期日，2004年十一月14号 格式的字符串
     */
    public final static String FMT_MMDDYY_CN = "yyyy年MMMd号";

    /**
     * 把时间格式化成如：星期几 格式的字符串，即可获得该日这个时间是星期几
     */
    public final static String FMT_WW = "EEE";

    /**
     * 常用的格式化时间的格式组，用于本类中格式化字符串成时间型
     */
    private final static String[] formatStr = { FMT_yyyyMMddHHmmssS, FMT_yyyyMMddHHmmss, FMT_yyyyMMddHHmm,
            FMT_yyyyMMddHH, FMT_yyyyMMdd, FMT_HHmmss, FMT_HHmmssS, FMT_HHmm, FMT_HHmmz, FMT_HHmmzzzz,
            FMT_yyyyMMddHHmmssSa_12, FMT_yyyyMMddHHmmssa_12, FMT_yyyyMMddHHmma_12, FMT_yyyyMMddHHa_12,
            FMT_yyyyMMdda, FMT_HHmmA_12, FMT_HHmmAz_12, FMT_HHmmAzzzz_12, FMT_HHmmssA_12, FMT_HHmmssAz_12,
            FMT_HHmmssAzzzz_12, FMT_yyyyMMddHHmmssSa };


    /**
     * 私有化构造器，使得不能产生该类对象，类中所有的方法均为静态方法
     */
    private DateTimeUtil() {
    }

    /**
     * 根据给出的Date值和格式串采用操作系统的默认所在的国家风格来格式化时间，并返回相应的字符串
     *
     * @param date
     *            日期对象
     * @param formatStr
     *            日期格式
     * @return 如果为null，返回字符串""
     */
    public static String formatDateTimetoString(Date date, String formatStr) {
        String reStr = "";
        if (date == null || formatStr == null || formatStr.trim().length() < 1) {
            return reStr;
        }
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern(formatStr);
        reStr = sdf.format(date);
        return reStr == null ? "" : reStr;
    }

    /**
     * 获取系统时间
     *
     * @param fmtstr
     *            日期格式
     * @return 系统时间
     */
    public static Date getSystemDate(String fmtstr) {
        try {
            return parseToDate(formatDateTimetoString(getSystemDate(), fmtstr));
        } catch (Exception e) {
            e.printStackTrace();
            return getSystemDate();
        }

    }

    /**
     * 根据给出的Date值和格式串采用给定的国家所在的国家风格来格式化时间，并返回相应的字符串
     *
     * @param date
     *            日期对象
     * @param formatStr
     *            日期格式
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回字符串""
     */
    public static String formatDateTimetoString(Date date, String formatStr, Locale locale) {
        String reStr = "";
        if (date == null || formatStr == null || locale == null || formatStr.trim().length() < 1) {
            return reStr;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr, locale);
        reStr = sdf.format(date);
        return reStr == null ? "" : reStr;
    }

    /**
     * 根据给出的Date值字符串和格式串采用操作系统的默认所在的国家风格来格式化时间，并返回相应的字符串
     *
     * @param dateStr
     *            日期字符串
     * @param formatStr
     *            日期格式
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatDateTimetoString(String dateStr, String formatStr) throws Exception {
        String dStr = "";
        if (dateStr != null && dateStr.trim().length() > 0 && formatStr != null && formatStr.trim().length() > 0) {
            dStr = formatDateTimetoString(parseToDate(dateStr), formatStr);
        }
        return dStr;
    }

    /**
     * 根据给出的Date值字符串和格式串采用指定国家的风格来格式化时间，并返回相应的字符串
     *
     * @param dateStr
     *            日期字符串
     * @param formatStr
     *            日期格式
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatDateTimetoString(String dateStr, String formatStr, Locale locale) throws Exception {
        String dStr = "";
        if (dateStr != null && dateStr.trim().length() > 0 && formatStr != null && formatStr.trim().length() > 0
                && locale != null) {
            dStr = formatDateTimetoString(parseToDate(dateStr, locale), formatStr, locale);
        }
        return dStr;
    }

    /**
     * 按指定的格式和操作系统默认国家的风格把给定的日期字符串格式化为一个Date型日期
     *
     * @param dateTimeStr
     *            日期毫秒字符串
     * @param formatStr
     *            日期格式
     * @return java.util.Date类型对象
     * @throws Exception
     *             可能抛出的异常
     */
    public static Date parseToDate(String dateTimeStr, String formatStr) throws Exception {
        if (dateTimeStr == null || formatStr == null || dateTimeStr.trim().length() < 1
                || formatStr.trim().length() < 1) {
            throw new IllegalArgumentException("参数dateTimeStr、formatStr不能是null或空格串！");
        }

        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        try {
            return sdf.parse(dateTimeStr);
        } catch (ParseException e) {
            throw new Exception(e);
        }
    }

    /**
     * 按指定的格式和指定国家的风格把给定的日期字符串格式化为一个Date型日期
     *
     * @param dateTimeStr
     *            日期字符串
     * @param formatStr
     *            日期格式
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return java.util.Date类型对象
     * @throws Exception
     *             可能抛出的异常
     */
    public static Date parseToDate(String dateTimeStr, String formatStr, Locale locale) throws Exception {
        if (dateTimeStr != null && formatStr != null && locale != null && dateTimeStr.trim().length() > 0
                && formatStr.trim().length() > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr, locale);
            try {
                return sdf.parse(dateTimeStr);
            } catch (ParseException e) {
                throw new Exception(e);
            }
        } else {
            throw new IllegalArgumentException("参数dateTimeStr、formatStr、locale不能是null或空格串！");
        }

    }

    /**
     * 按操作系统默认国家的风格把给定的日期字符串格式化为一个Date型日期
     *
     * @param dateTimeStr
     *            日期字符串
     * @return java.util.Date类型对象
     * @throws Exception
     *             可能抛出的异常
     */
    public static Date parseToDate(String dateTimeStr) throws Exception {
        if (dateTimeStr == null || dateTimeStr.trim().length() < 1) {
            throw new IllegalArgumentException("参数dateTimeSt不能是null或空格串！");
        }
        int formatStrLength = formatStr.length;
        int i = 0;

        for (i = 0; i < formatStrLength; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr[i]);
            try {
                return sdf.parse(dateTimeStr);
            } catch (ParseException e) {
            }
        }
        throw new Exception("日期格式不正确！");
    }

    /**
     * 根据给出的年月和日返回一个日期型的对象
     *
     * @param year
     *            年
     * @param month
     *            月 ，1到12
     * @param day
     *            日 ，1到31
     * @return java.util.Date类型对象
     * @throws Exception
     *             可能抛出的异常
     */
    public static Date parseToDate(int year, int month, int day) throws Exception {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("参数不正确！");
        }
        String yearStr = String.valueOf(year);
        String monthStr = String.valueOf(month);
        String dayStr = String.valueOf(day);

        return parseToDate(yearStr + "-" + monthStr + "-" + dayStr);

    }

    /**
     * 根据给出的年月日、时分秒、返回一个对应的Date型对象
     *
     * @param year
     *            年
     * @param month
     *            月 ，1到12
     * @param day
     *            日 ，1到31
     * @param h
     *            小时，从0到23
     * @param m
     *            分，从0到60
     * @param s
     *            秒，从0到60
     * @return java.util.Date类型对象
     * @throws Exception
     *             可能抛出的异常
     */
    public static Date parseToDate(int year, int month, int day, int h, int m, int s) throws Exception {
        if (month < 1 || month > 12 || day < 1 || day > 31 || h < 0 || h > 23 || m < 0 || m > 60 || s < 0 || s > 60) {
            throw new IllegalArgumentException("参数不正确！");
        }
        String yearStr = String.valueOf(year);
        String monthStr = String.valueOf(month);
        String dayStr = String.valueOf(day);
        String hStr = String.valueOf(h);
        String mStr = String.valueOf(m);
        String sStr = String.valueOf(s);

        return parseToDate(yearStr + "-" + monthStr + "-" + dayStr + " " + hStr + ":" + mStr + ":" + sStr);

    }

    /**
     * 按指定国家的风格把给定的日期字符串格式化为一个Date型日期
     *
     * @param dateTimeStr
     *            日期字符串
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return java.util.Date类型对象
     * @throws Exception
     *             可能抛出的异常
     */
    public static Date parseToDate(String dateTimeStr, Locale locale) throws Exception {
        if (dateTimeStr == null || dateTimeStr.trim().length() < 1 || locale == null) {
            throw new IllegalArgumentException("参数dateTimeSt、locale不能是null或空格串！");
        }
        int formatStrLength = formatStr.length;
        int i = 0;
        SimpleDateFormat sdf = null;
        for (i = 0; i < formatStrLength; i++) {
            sdf = new SimpleDateFormat(formatStr[i], locale);
            try {
                return sdf.parse(dateTimeStr);
            } catch (ParseException e) {
            }
        }
        throw new Exception("日期格式不正确！");
    }

    /**
     * 将给定的日期时间字符串按操作系统默认的国家风格格式化成"yyyy-MM-dd HH:mm:ss"格式的日期时间串
     *
     * @param dateTimeStr
     *            日期字符串
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatDateTimetoString(String dateTimeStr) throws Exception {
        return formatDateTimetoString(dateTimeStr, FMT_yyyyMMddHHmmss);
    }

    /**
     * 将给定的日期时间字符串按指定国家的风格格式化成"yyyy-MM-dd HH:mm:ss"格式的日期时间串
     *
     * @param dateTimeStr
     *            日期字符串
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatDateTimetoString(String dateTimeStr, Locale locale) throws Exception {
        return formatDateTimetoString(dateTimeStr, FMT_yyyyMMddHHmmss, locale);
    }

    /**
     * 将给定的日期时间按操作系统默认的国家内格格式化成"yyyy-MM-dd HH:mm:ss"格式的日期时间串
     *
     * @param dateTime
     *            日期对象
     * @return 如果为null，返回""
     */
    public static String formatDateTimetoString(Date dateTime) {
        return formatDateTimetoString(dateTime, FMT_yyyyMMddHHmmss);
    }

    /**
     * 将给定的日期时间按指定国家的风格格式化成"yyyy-MM-dd HH:mm:ss"格式的日期时间串
     *
     * @param dateTime
     *            日期对象
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     */
    public static String formatDateTimetoString(Date dateTime, Locale locale) {
        return formatDateTimetoString(dateTime, FMT_yyyyMMddHHmmss, locale);
    }

    /**
     * 将给定的日期字符串按操作系统默认的国家风格格式化成"yyyy-MM-dd"格式的日期串
     *
     * @param dateStr
     *            日期字符串
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatDatetoString(String dateStr) throws Exception {
        return formatDateTimetoString(dateStr, FMT_yyyyMMdd);
    }

    /**
     * 将给定的日期字符串按指定国家的风格格式化成"yyyy-MM-dd"格式的日期串
     *
     * @param dateStr
     *            日期字符串
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatDatetoString(String dateStr, Locale locale) throws Exception {
        return formatDateTimetoString(dateStr, FMT_yyyyMMdd, locale);
    }

    /**
     * 将给定的日期按指定操作系统默认国家的风格格式化成"yyyy-MM-dd"格式的日期串
     *
     * @param d
     *            日期对象
     * @return 如果为null，返回""
     */
    public static String formatDatetoString(Date d) {
        return formatDateTimetoString(d, FMT_yyyyMMdd);
    }

    /**
     * 将给定的日期按指定国家的风格格式化成"yyyy-MM-dd"格式的日期串
     *
     * @param d
     *            日期对象
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     */
    public static String formatDatetoString(Date d, Locale locale) {
        return formatDateTimetoString(d, FMT_yyyyMMdd, locale);
    }

    /**
     * 将给定的日期时间字符串按操作系统默认的国家风格格式化成"HH:mm:ss"格式的时间串
     *
     * @param dateTimeStr
     *            日期字符串
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatTimetoString(String dateTimeStr) throws Exception {
        return formatDateTimetoString(dateTimeStr, FMT_HHmmss);
    }

    /**
     * 将给定的日期时间字符串按指定国家的风格格式化成"HH:mm:ss"格式的时间串
     *
     * @param dateTimeStr
     *            日期字符串
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     * @throws Exception
     *             可能抛出的异常
     */
    public static String formatTimetoString(String dateTimeStr, Locale locale) throws Exception {
        return formatDateTimetoString(dateTimeStr, FMT_HHmmss, locale);
    }

    /**
     * 将给定的日期时间按指定操作系统默认国家的风格格式化成"HH:mm:ss"格式的时间串
     *
     * @param dateTimeStr
     *            日期字符串
     * @return 如果为null，返回""
     */
    public static String formatTimetoString(Date dateTimeStr) {
        return formatDateTimetoString(dateTimeStr, FMT_HHmmss);
    }

    /**
     * 将给定的日期时间按指定国家的风格格式化成"HH:mm:ss"格式的时间串
     *
     * @param dateTimeStr
     *            日期字符串
     * @param locale
     *            日期格式符号要被使用的语言环境
     * @return 如果为null，返回""
     */
    public static String formatTimetoString(Date dateTimeStr, Locale locale) {
        return formatDateTimetoString(dateTimeStr, FMT_HHmmss, locale);
    }

    /**
     * 返回一个时间的年份整数
     *
     * @param d
     *            日期对象
     * @return 年份
     */
    public static int getYearOfDate(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 返回一个时间的月份整数
     *
     * @param d
     *            日期对象
     * @return 月份
     */
    public static int getMonthOfYear(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取指定日期的1号0点0分0秒
     *
     * @param d
     *            指定日期
     * @return 指定日期的0点0分0秒
     */
    public static Date getDateByFirstDayOfMonth(Date d) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 返回一个时间的天份整数，是这个月的第几天
     *
     * @param d
     *            日期对象
     * @return 天份
     */
    public static int getDayOfMonth(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 返回一个时间的天份整数，是这个年份的第几天
     *
     * @param d
     *            日期对象
     * @return 天份
     */
    public static int getDayOfYear(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * 返回一个时间的天份整数，是这个周的第几天
     *
     * @param d
     *            日期对象
     * @return 天份
     */
    public static int getDayOfWeek(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 返回一个时间的周的整数，是这个月的第几周
     *
     * @param d
     *            日期对象
     * @return 周
     */
    public static int getWeekOfMonth(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    /**
     * 返回一个时间的周的整数，是这个年份的第几周
     *
     * @param d
     *            日期对象
     * @return 周
     */
    public static int getWeekOfYear(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * 返回该时间所对应的在一天中的小时数的整数，如当前(Date now)是下午3点，返回为15
     *
     * @param d
     *            日期对象
     * @return 小时
     */
    public static int getHoursOfDay(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        return hours;
    }

    /**
     * 返回该时间所对应的在一天中的小时数的整数(采用12小时制)，如当前(Date now)是下午3点，返回为3
     *
     * @param d
     *            日期对象
     * @return 小时
     */
    public static int getHoursOfDay12(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int hours = calendar.get(Calendar.HOUR);
        return hours;
    }

    /**
     * 返回该时间所对应的分钟数中的整数，如now是15点14分，则返回14
     *
     * @param d
     *            日期对象
     * @return 分钟
     */
    public static int getMinutesOfHour(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int minutes = calendar.get(Calendar.MINUTE);

        return minutes;
    }

    /**
     * 返回该时间所对应的秒数中的整数，如now是15点14分34秒，则返回34
     *
     * @param d
     *            日期对象
     * @return 秒
     */
    public static int getSecondsOfMinute(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int seconds = calendar.get(Calendar.SECOND);

        return seconds;
    }

    /**
     * 返回该时间所对应的毫秒数中的整数，如now是15点14分34秒470毫秒，则返回470
     *
     * @param d
     *            日期对象
     * @return 毫秒
     */
    public static int getMillisecondsOfSecond(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        return millisecond;
    }

    /**
     * 返回该时间相对于1970年1月1日开始计算的对应的毫秒数
     *
     * @param d
     *            日期对象
     * @return 毫秒数
     */
    public static long getTime(Date d) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        return d.getTime();
    }

    /**
     * 比较两个时间的先后顺序。 如果时间d1在d2之前，返回1，如果时间d1在d2之后，返回-1，如果二者相等，返回0
     *
     * @param d1
     *            日期对象
     * @param d2
     *            日期对象
     * @return 如果时间d1在d2之前，返回1，如果时间d1在d2之后，返回-1，如果二者相等，返回0
     */
    public static int compareTwoDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalArgumentException("参数d1或d2不能是null对象！");
        }

        long dI1 = d1.getTime();
        long dI2 = d2.getTime();

        if (dI1 > dI2) {
            return -1;
        } else if (dI1 < dI2) {
            return 1;
        } else {
            return 0;
        }

    }

    /**
     * 返回两个日期之间的毫秒数的差距
     *
     * @param d1
     *            日期对象
     * @param d2
     *            日期对象
     * @return 二者至1970年1.1后的毫秒数的差值
     */
    public static long getMillisecondsOfTwoDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalArgumentException("参数d1或d2不能是null对象！");
        }
        long dI1 = d1.getTime();
        long dI2 = d2.getTime();
        return (dI1 - dI2);
    }

    /**
     * 获得两个日期之间相差的秒数
     *
     * @param d1
     *            日期对象
     * @param d2
     *            日期对象
     * @return 两日期之间相差的秒数
     */
    public static double getSecondsOfTwoDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalArgumentException("参数d1或d2不能是null对象！");
        }
        long i = getMillisecondsOfTwoDate(d1, d2);

        return (double) i / 1000;
    }

    /**
     * 获得两个日期之间相差的分钟数
     *
     * @param d1
     *            日期对象
     * @param d2
     *            日期对象
     * @return 两日期之间相差的分钟数
     */
    public static double getMinutesOfTwoDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalArgumentException("参数d1或d2不能是null对象！");
        }
        long millions = getMillisecondsOfTwoDate(d1, d2);
        return (double) millions / 60 / 1000;
    }

    /**
     * 获得两个日期之间相差的小时数
     *
     * @param d1
     *            日期对象
     * @param d2
     *            日期对象
     * @return 两日期之间相差的小时数
     */
    public static double getHoursOfTwoDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalArgumentException("参数d1或d2不能是null对象！");
        }
        long millions = getMillisecondsOfTwoDate(d1, d2);
        return (double) millions / 60 / 60 / 1000;
    }

    /**
     * 获得两个日期之间相差的天数
     *
     * @param d1
     *            日期对象
     * @param d2
     *            日期对象
     * @return 两日期之间相差的天数
     */
    public static double getDaysOfTwoDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            throw new IllegalArgumentException("参数d1或d2不能是null对象！");
        }
        long millions = getMillisecondsOfTwoDate(d1, d2);
        return (double) millions / 24 / 60 / 60 / 1000;
    }

    /**
     * 把给定的时间加上指定的时间值，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param times
     *            时间值
     * @param type
     *            类型，Calendar.MILLISECOND，毫秒<BR>
     *            Calendar.SECOND，秒<BR>
     *            Calendar.MINUTE，分钟<BR>
     *            Calendar.HOUR，小时<BR>
     *            Calendar.DATE，日<BR>
     * @return 如果d为null，返回null
     */
    public static Date addTime(Date d, double times, int type) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        long qv = 1;
        switch (type) {
            case Calendar.MILLISECOND:
                qv = 1;
                break;
            case Calendar.SECOND:
                qv = 1000;
                break;
            case Calendar.MINUTE:
                qv = 1000 * 60;
                break;
            case Calendar.HOUR:
                qv = 1000 * 60 * 60;
                break;
            case Calendar.DATE:
                qv = 1000 * 60 * 60 * 24;
                break;
            default:
                throw new RuntimeException("时间类型不正确!type＝" + type);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        long milliseconds = (long) Math.round(Math.abs(times) * qv);
        if (times > 0) {
            for (; milliseconds > 0; milliseconds -= 2147483647) {
                if (milliseconds > 2147483647) {
                    calendar.add(Calendar.MILLISECOND, 2147483647);
                } else {
                    calendar.add(Calendar.MILLISECOND, (int) milliseconds);
                }
            }
        } else {
            for (; milliseconds > 0; milliseconds -= 2147483647) {
                if (milliseconds > 2147483647) {
                    calendar.add(Calendar.MILLISECOND, -2147483647);
                } else {
                    calendar.add(Calendar.MILLISECOND, -(int) milliseconds);
                }
            }
        }
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的年份，可以为负，返回新的被加上了年份的日期对象，不影响参数日期对象值
     *
     * @param d
     *            需要设定的日期对象
     * @param years
     *            年份
     * @return 新日期对象
     */
    public static Date addYears(Date d, int years) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.YEAR, years);
        return calendar.getTime();
    }

    /**
     * 新增周
     * @param d
     * @param week
     * @return
     */
    public static Date addWeek(Date d, int week) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.WEEK_OF_YEAR, week);
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的月份，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param months
     *            月份
     * @return 新日期对象
     */
    public static Date addMonths(Date d, int months) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.MONTH, months);
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的天数，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param days
     *            天数
     * @return 新日期对象
     */
    public static Date addDays(Date d, int days) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR, days * 24);
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的小时，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param hours
     *            小时
     * @return 新日期对象
     */
    public static Date addHours(Date d, int hours) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR, hours);
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的分钟，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param minutes
     *            分钟
     * @return 新日期对象
     */
    public static Date addMinutes(Date d, int minutes) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的秒数，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param seconds
     *            秒
     * @return 新日期对象
     */
    public static Date addSeconds(Date d, int seconds) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.SECOND, seconds);
        return calendar.getTime();
    }

    /**
     * 把给定的时间加上指定的毫秒数，可以为负
     *
     * @param d
     *            需要设定的日期对象
     * @param milliseconds
     *            毫秒
     * @return 新日期对象
     */
    public static Date addMilliseconds(Date d, int milliseconds) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.MILLISECOND, milliseconds);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的年份是新的给定的年份
     *
     * @param d
     *            需要设定的日期对象
     * @param year
     *            新的年份
     * @return 新日期对象
     */
    public static Date setYearOfDate(Date d, int year) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的月份是新的给定的月份
     *
     * @param d
     *            需要设定的日期对象
     * @param month
     *            新的月份
     * @return 新日期对象
     */
    public static Date setMonthOfDate(Date d, int month) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的天是新的给定的天
     *
     * @param d
     *            需要设定的日期对象
     * @param day
     *            新的天
     * @return 新日期对象
     */
    public static Date setDayOfDate(Date d, int day) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的小时是新的给定的小时
     *
     * @param d
     *            需要设定的日期对象
     * @param hour
     *            新的小时数
     * @return 新日期对象
     */
    public static Date setHourOfDate(Date d, int hour) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的分钟是新的给定的分钟数
     *
     * @param d
     *            需要设定的日期对象
     * @param minute
     *            新的分钟数
     * @return 新日期对象
     */
    public static Date setMinuteOfDate(Date d, int minute) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.MINUTE, minute);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的秒数是新的给定的分钟数
     *
     * @param d
     *            需要设定的日期对象
     * @param second
     *            新的秒数
     * @return 新日期对象
     */
    public static Date setSecondOfDate(Date d, int second) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.SECOND, second);
        return calendar.getTime();
    }

    /**
     * 设置一个日期对象的毫秒数是新的给定的分钟数
     *
     * @param d
     *            需要设定的日期对象
     * @param millisecond
     *            新的毫秒数
     * @return 新日期对象
     */
    public static Date setMillisecondOfDate(Date d, int millisecond) {
        if (d == null) {
            throw new IllegalArgumentException("参数d不能是null对象！");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的月份的天数量
     *
     * @param d
     *            日期对象
     * @return 天数
     */
    public static int getDaysOfMonth(Date d) {
        int year = getYearOfDate(d);
        int month = getMonthOfYear(d);
        return getDaysOfMonth(year, month);
    }

    /**
     * 返回指定日期的月份的天数量
     *
     * @param year
     *            年
     * @param month
     *            月
     * @return 天数
     */
    public static int getDaysOfMonth(int year, int month) {
        int days = 0;
        if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            days = 30;
        }
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
                || (month == 12)) {
            days = 31;
        }
        return days;
    }

    /**
     * 返回系统时间，以日期对象形式返回
     *
     * @return 系统时间
     */
    public static Date getSystemDate() {
        return new Date(System.currentTimeMillis());
    }

    /**
     * 返回系统时间，以毫秒形式返回
     *
     * @return 毫秒数
     */
    public static long getSystemTime() {
        return System.currentTimeMillis();
    }

    /**
     * 返回24小时前的时间
     *
     * @param date
     *            指定日期
     * @return 新日期对象
     */
    public static Date getLastDay(Date date) {
        long day = date.getTime();
        long lastDay = day - 24 * 60 * 60 * 1000;
        return new Date(lastDay);
    }

    /**
     * 返回24小时后的时间
     *
     * @param date
     *            指定日期
     * @return 新日期对象
     */
    public static Date getTomorrow(Date date) {
        long day = date.getTime();
        long tomorrow = day + 24 * 60 * 60 * 1000;
        return new Date(tomorrow);
    }

    /**
     * 取得30天前的这个时间
     *
     * @return 新日期对象
     */
    public static Date getDayLastMonth() {
        long day = new Date().getTime();
        long dayLastMonth = day - 24 * 60 * 60 * 1000 * 20;
        return new Date(dayLastMonth);
    }

    /**
     * 取得30天后的这个时间
     *
     * @return 新日期对象
     */
    public static Date getDayNextMonth() {
        long day = new Date().getTime();
        long dayNextMonth = day + 20 * 24 * 60 * 60 * 1000;
        return new Date(dayNextMonth);
    }

    /**
     * 计算两个时间见得月份差，可为负数
     *
     * @param sDate
     *            开始时间
     * @param eDate
     *            结束时间
     * @return 月份差
     */
    public static int getMonthCount(Date sDate, Date eDate) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        if(c2.getTimeInMillis() < c1.getTimeInMillis()) return 0;
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 假设 d1 = 2015-9-30   d2 = 2015-12-16
        int yearInterval = year2 - year1;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if(month2 < month1 || month1 == month2 && day2 < day1) yearInterval --;
        // 获取月数差值
        int monthInterval = (month2 + 12) - month1 ;
        if(day2 > day1) monthInterval ++;
        monthInterval %= 12;
        return yearInterval * 12 + monthInterval;
    }

    /**
     *     * 获取两个日期相差的月数(不考虑天数)
     *     * @param d2  较大的日期
     *     * @param d1  较小的日期
     *     * @return 如果d1>d2返回 月数差 否则返回0
     *    
     */
    public static int getMonthPureDiff(Date startDate, Date endDate){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        //将String日期转
        c1.setTime(startDate);
        c2.setTime(endDate);
        //判断两
        if (c2.getTimeInMillis() < c1.getTimeInMillis()) return 0;
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        // 获取年的差值 假设 d1 = 2015-9-30   d2 = 2015-12-16
        int yearInterval = year2 - year1;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if (month2 < month1) yearInterval--;
//        if (month2 < month1) yearInterval--;
        // 获取月数差值
        int monthInterval = ( month1 > month2) ? ((month2 + 12) - month1) : (month2 - month1);
//        monthInterval %= 12;
        return yearInterval * 12 + monthInterval + 1;
    }

    /**
     * 计算两个时间见得年份差，可为负数
     *
     * @param sDate
     *            开始时间
     * @param eDate
     *            结束时间
     * @return 年份差
     */
    public static int getYearCount(Date sDate, Date eDate) {
        String sDateStr = DateTimeUtil.formatDateTimetoString(sDate, "yyyy");
        String eDateStr = DateTimeUtil.formatDateTimetoString(eDate, "yyyy");
        return Integer.parseInt(eDateStr) - Integer.parseInt(sDateStr);
    }

    /**
     * 取得下个月的这天，比如2月1日可取得3月1日，此方法有很大局限性，不能用于月末的天数
     *
     * @param date
     *            指定日期
     * @return 新日期对象
     */
    public static Date getDayNextMonth(Date date) {
        String yearStr = DateTimeUtil.formatDateTimetoString(date, "yyyy");
        String monthStr = DateTimeUtil.formatDateTimetoString(date, "MM");
        String dayStr = DateTimeUtil.formatDateTimetoString(date, "dd");
        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        if (month == 12) {
            month = 1;
            year = year + 1;
            yearStr = String.valueOf(year);
            monthStr = String.valueOf(month);
        }

        String dateStr = yearStr + "-" + monthStr + "-" + dayStr;
        try {
            date = DateTimeUtil.parseToDate(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return date;
    }

    /**
     * 获取当月开始时0点0分0秒
     *
     * @return 日期对象
     */
    public static Date getCurrentMouthStart() {
        Date d = getSystemDate();
        d = setDayOfDate(d, 1);
        d = setHourOfDate(d, 0);
        d = setMinuteOfDate(d, 0);
        d = setSecondOfDate(d, 0);
        return d;
    }

    /**
     * 返回下月的这天
     *
     * @param date
     *            指定日期
     * @return 日期对象
     */
    public static Date getDateNextMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, +1);
        return cal.getTime();
    }

    /**
     * 默认方法，计算指定时间与当前时间之间的相差的天数
     *
     * @param date
     *            指定日期
     * @return 所差天数
     */
    public static Integer daysDifference(Date date) {
        long l1 = get24HourMill(date);
        long l2 = get24HourMill(new Date());
        return (int) ((l2 - l1) / 86400 / 1000);
    }

    /**
     * 获取指定日期的 0点0分0秒
     *
     * @param d
     *            指定日期
     * @return 指定日期的0点0分0秒
     */
    private static long get24HourMill(Date d) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取指定日期的 0点0分0秒
     *
     * @param d
     *            指定日期
     * @return 指定日期的0点0分0秒
     */
    public static Date getZeroDate(Date d) {
        if (d == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取指定日期的 23点59分59秒
     *
     * @param
     * @return 指定日期的0点0分0秒
     */
    public static Date getLastDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 不确定表示方式的时间差函数
     *
     * @param startDate
     *            指定时间
     * @param endDate
     *            结束时间
     * @return 时间差指定格式字符串
     */
    private static String otherDiff(Date startDate, Date endDate) {
        String[] type = new String[] { "年", "个月", "星期", "天", "小时", "分钟", "秒", "秒" };
        Object[] obj = timeDifference(startDate, endDate);
        String value = "1秒前";
        for (int i = 0; i < obj.length; i++) {
            if (!"0".equals(obj[i].toString())) {
                value = obj[i].toString() + type[i] + "前";
                break;
            }
        }
        return value;
    }

    /**
     * 动态表示方式的时间差函数
     *
     * @param startDate
     *            指定时间
     * @param endDate
     *            结束时间
     * @return 时间差指定格式字符串
     */
    public static String dynDiff(Date startDate, Date endDate) {

        String startDay = DateFormatUtils.format(startDate, "dd");
        String endtDay = DateFormatUtils.format(endDate, "dd");
        String value = "";
        if (startDay.equals(endtDay)) {
            value = DateFormatUtils.format(startDate, " HH:mm");
        } else {
            value = otherDiff(startDate, endDate);
        }
        return value;
    }

    /**
     * 资源表示方式的时间差函数
     *
     * @param startDate
     *            指定时间
     * @param endDate
     *            结束时间
     * @return 时间差指定格式字符串
     */
    public static String resDiff(Date startDate, Date endDate) {
        Object[] obj = timeDifference(startDate, endDate);
        String value = "";
        if (Long.parseLong(obj[3].toString()) > 7) {
            value = DateFormatUtils.format(startDate, "yyyy-MM-dd HH:mm");
        } else {
            value = otherDiff(startDate, endDate);
        }
        return value;
    }

    /**
     * 时间差
     *
     * @param startTime
     *            开始时间
     * @param endTime
     *            结束时间
     * @return 返回时间差数组：(年，月，周，天，时，分，秒，毫秒)
     */
    private static Object[] timeDifference(Date startTime, Date endTime) {
        if (startTime == null || endTime == null) {
            return new Object[] { 0, 0, 0, 0, 0, 0, 0 };
        } else {
            Calendar start = Calendar.getInstance();
            Calendar end = Calendar.getInstance();
            start.setTime(startTime);
            end.setTime(endTime);

            long startMs = start.getTimeInMillis();
            long endMs = end.getTimeInMillis();
            long l_differ = endMs - startMs;// 毫秒数
            long ll_differ = l_differ / 1000;// 秒

            long second_differ = l_differ / 1000;// 秒

            long year_differ = second_differ / (60 * 60 * 24 * 365);// 得到年数
            long month_differ = second_differ / (60 * 60 * 24 * 30);// 得到月数
            long week_differ = second_differ / (60 * 60 * 24 * 7);// 得到周数

            long day_differ = second_differ / (60 * 60 * 24);// 得到天数
            second_differ = second_differ - day_differ * 60 * 60 * 24;// 天
            long hour_differ = second_differ / (60 * 60);// 时
            second_differ = second_differ - hour_differ * 60 * 60;
            long minute_differ = second_differ / 60;// 分
            second_differ = second_differ - minute_differ * 60;

            return new Object[] { year_differ, month_differ, week_differ, day_differ, hour_differ, minute_differ,
                    second_differ, ll_differ };
        }
    }

    /**
     * 流逝时间
     * @return 时间
     * @throws Exception
     */
    public static String getPastDate(Date date) throws Exception {
        String timeStr;
        Date currDate = getSystemDate();
        // 今天以前
        if (date.before(getZeroDate(currDate))) {
            timeStr = DateTimeUtil.formatDatetoString(date);
        } else {
            // 时
            double hours = DateTimeUtil.getHoursOfTwoDate(currDate, date);
            if (hours < 24 && hours >= 1) {
                timeStr = String.valueOf((int) hours) + "小时前";
            } else {
                // 分
                double minutes = DateTimeUtil.getMinutesOfTwoDate(currDate, date);
                if (minutes < 60 && minutes >= 1) {
                    timeStr = String.valueOf((int) minutes) + "分钟前";
                } else {
                    // 秒
                    double seconds = DateTimeUtil.getSecondsOfTwoDate(currDate, date);
                    if (seconds < 60 && seconds >= 1) {
                        // timeStr = String.valueOf(seconds)+"秒前";
                        timeStr = "刚刚";
                    } else {
                        timeStr = "-";
                    }
                }
            }
        }
        return timeStr;
    }


//每一个线程
     private static final ThreadLocal<SimpleDateFormat> threadLocal = new   ThreadLocal<SimpleDateFormat>();

    /**
     *1 周数据类型
     * 当前：2019-04-08 16:57:11
     * 过去七天：2019-04-01 16:57:11
     * 1 周 2 月 3 季度 4 自定义
     *  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
     * @return
     */
      static String timeFormat="yyyy-MM-dd";
    public static String  []getTimeStartAndEnd(String queryType,String year,Date startTime,Date endTime){
        SimpleDateFormat sdf = null;
        sdf = threadLocal.get();
        if (sdf == null){
             sdf = new SimpleDateFormat(timeFormat);
         }
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String[] timeArr=new String[2];
        if(StringUtils.isEmpty(year)){
            year = String.valueOf(c.get(Calendar.YEAR));
        }
        //按照周统计
        if("1".equals(queryType)){
            getRangeTime(year,queryType,c,timeArr,sdf);
        }else if("2".equals(queryType)){ // 按月
            getRangeTime(year,queryType,c,timeArr,sdf);
        }if("3".equals(queryType)){ // 按照季度
            getThisQuarter(year,timeArr,sdf);
        }if("4".equals(queryType)){ //自己定义时间
            if(null==endTime){
                endTime=c.getTime();
            }
            if(null==startTime){
                startTime=c.getTime();
            }
            String beginTimeStr=sdf.format(startTime);
            String endTimeStr =sdf.format(endTime);
            String newBeginTimeStr=(year+beginTimeStr.substring(beginTimeStr.indexOf("-"),beginTimeStr.length()));
            String newEndTimeStr=(year+endTimeStr.substring(endTimeStr.indexOf("-"),endTimeStr.length()));
            timeArr[0]=newBeginTimeStr;
            timeArr[1]=newEndTimeStr;
        }
        // System.out.println(" begin："+timeArr[0] + ">>>> end >>>"+timeArr[1]);
        return timeArr;
    }

    /**
     * 获取周 月时间的范围进行数据查询
     * @param year
     * @param queryType
     * @param c
     * @param timeArr
     */
    private  static void getRangeTime(String year,String queryType,  Calendar c,String timeArr[],SimpleDateFormat format){
        String endTimeStr=format.format(c.getTime());
        String newEndTimeStr=(year+endTimeStr.substring(endTimeStr.indexOf("-"),endTimeStr.length()));
        //推迟一周
        if("1".equals(queryType)){
            c.add(Calendar.DATE, - 7);
        }else if("2".equals(queryType)){
            c.add(Calendar.MONTH, -1);
        }
        Date begin = c.getTime();
        String beginTimeStr = format.format(begin);
        String newBeginTimeStr=(year+beginTimeStr.substring(beginTimeStr.indexOf("-"),beginTimeStr.length()));
        timeArr[0]=newBeginTimeStr;
        timeArr[1]=newEndTimeStr;
        //System.out.println(" begin："+timeArr[0] + ">>>> end >>>"+timeArr[1]);
    }


    /**
     * 获取当前季度的时间范围
     * @return current quarter
     * 2019-04-01 00:00:00 endTimeStr>> 2019-06-30 23:59:59
     */
    public static void getThisQuarter(String year,String timeArr[],SimpleDateFormat format) {
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.set(Calendar.MONTH, ((int) startCalendar.get(Calendar.MONTH) / 3) * 3);
        startCalendar.set(Calendar.DAY_OF_MONTH, 1);
        setMinTime(startCalendar);

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(Calendar.MONTH, ((int) startCalendar.get(Calendar.MONTH) / 3) * 3 + 2);
        endCalendar.set(Calendar.DAY_OF_MONTH, endCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        setMaxTime(endCalendar);
        String beginTimeStr = format.format(startCalendar.getTime());
        String endTimeStr = format.format(endCalendar.getTime());

        String newBeginTimeStr=(year+beginTimeStr.substring(beginTimeStr.indexOf("-"),beginTimeStr.length()));
        String newEndTimeStr=(year+endTimeStr.substring(endTimeStr.indexOf("-"),endTimeStr.length()));
        timeArr[0]=newBeginTimeStr;
        timeArr[1]=newEndTimeStr;
        //System.out.println(" begin："+timeArr[0] + ">>>> end >>>"+timeArr[1]);
    }

    private static void setMinTime(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }

    private static void setMaxTime(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
    }


    public static Map<Integer,String> getTimeInterval(Date date) {
        SimpleDateFormat sdf = null;
        sdf = threadLocal.get();
        if (sdf == null){
            sdf = new SimpleDateFormat(timeFormat);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // System.out.println("要计算日期为:" + sdf.format(cal.getTime())); // 输出要计算日期
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        String imptimeBegin = sdf.format(cal.getTime());
        // System.out.println("所在周星期一的日期：" + imptimeBegin);
        cal.add(Calendar.DATE, 6);
        String imptimeEnd = sdf.format(cal.getTime());
        // System.out.println("所在周星期日的日期：" + imptimeEnd);
        LinkedHashMap<Integer, String>  map = new LinkedHashMap<>();
        map.put(0,imptimeBegin);
        map.put(1,imptimeEnd);
         return map;
    }


    /**
     * 根据本周第几天获取具体日期
     * eg dayIndex=1表示本周第一天的日期,注意是周一
     * @param dayIndex >0表示正序天数，<0表示倒序天数
     * @return
     */
    public static Date getDateByIndexOfWeek(int dayIndex) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.DAY_OF_WEEK,dayIndex+1);
        return instance.getTime();
    }

    /**
     * 根据本月第几天获取具体日期
     * eg dayIndex=1表示本周第一天的日期
     * @param dayIndex >0表示正序天数，<0表示倒序天数
     * @return
     */
    public static Date getDateByIndexOfMonth(int monthDayIndex) {
        Calendar instance = Calendar.getInstance();
        if (monthDayIndex <= 0) {
            instance.add(Calendar.MONTH,1);
            monthDayIndex +=1;
        }
        instance.set(Calendar.DAY_OF_MONTH,monthDayIndex);
        return instance.getTime();
    }

    /**
     * 根据本季度第几天获取具体日期
     * eg seasonDayIndex=1表示本季度第一天的日期
     * @param seasonDayIndex >0表示正序天数，<0表示倒序天数
     * @return
     */
    public static Date getDateByIndexOfSeason(int seasonDayIndex) {
        int quarter = DateTimeUtil.getQuarterOfYear(new Date());
        Calendar calendar = Calendar.getInstance();

        if (seasonDayIndex > 0) {
            int month = getFirstMonthOfSeason(quarter);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, seasonDayIndex);
        } else {
            int month = getLastMonthOfSeason(quarter);
            calendar.set(Calendar.MONTH, month+1);
            calendar.set(Calendar.DAY_OF_MONTH, seasonDayIndex+1);
        }
        return calendar.getTime();
    }

    /**
     * 根据本季度第几天获取具体日期
     * eg seasonDayIndex=1表示本季度第一天的日期
     * @param seasonDayIndex >0表示正序天数，<0表示倒序天数
     * @return
     */
    public static Date getDateByIndexOfHalfYear(int halfYearDayIndex) {
        int halfYear = getHalfYearOfDate(new Date());
        Calendar calendar = Calendar.getInstance();
        if (halfYearDayIndex > 0) {
            int month = getFirstMonthOfHalfYear(halfYear);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, halfYearDayIndex);
        } else if (halfYearDayIndex <= 0 && halfYear == 1) {
            int month = getFirstMonthOfHalfYear(halfYear + 1);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, halfYearDayIndex);
        } else {
            int month = getFirstMonthOfHalfYear(halfYear + 1);
            calendar.add(Calendar.YEAR,1);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, halfYearDayIndex+1);
        }
        return calendar.getTime();
    }

    /**
     * 根据本季度第几天获取具体日期
     * eg seasonDayIndex=1表示本季度第一天的日期
     * @param seasonDayIndex >0表示正序天数，<0表示倒序天数
     * @return
     */
    public static Date getDateByIndexOfYear(int yearDayIndex) {
        Calendar calendar = Calendar.getInstance();
        if (yearDayIndex > 0) {
            calendar.set(Calendar.DAY_OF_YEAR, yearDayIndex);
        } else {
            calendar.set(Calendar.YEAR, 1);
            calendar.set(Calendar.DAY_OF_YEAR, yearDayIndex+1);
        }
        return calendar.getTime();
    }

    /**
     * 获取半年的最后一个月
     * @param halfYear
     * @return
     */
    private static int getLastMonthOfHalfYear(int halfIndex) {
        return halfIndex == 1 ? 5 : 11;
    }

    /**
     * 获取日期是哪一个半年
     * 1表示第一个半年,2表示第二个半年
     * @param date
     * @return
     */
    private static int getHalfYearOfDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.MONTH) < 6 ? 1 : 2;
    }

    /**
     * 获取半年的第一个月份
     * @param halfIndex
     * @return
     */
    private static int getFirstMonthOfHalfYear(int halfIndex) {
        return halfIndex % 2 == 1 ? 0 : 6;
    }

    /**
     * 获取本季度最后一个月
     * @param quarter
     * @return
     */
    private static int getFirstMonthOfSeason(int quarter) {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1) {
            month = 0;
        } else if (quarter == 2) {
            month = 3;
        } else if (quarter == 3) {
            month = 6;
        } else if (quarter == 4) {
            month = 9;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return month;
    }

    /**
     * 获取本季度最后一个月
     * @param quarter
     * @return
     */
    private static int getLastMonthOfSeason(int quarter) {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1) {
            month = 2;
        } else if (quarter == 2) {
            month = 5;
        } else if (quarter == 3) {
            month = 8;
        } else if (quarter == 4) {
            month = 11;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return month;
    }

    /**
     * 查询某月第几天的日期
     * @param month
     * @param index
     */
    private static Date getDayByMonthAndIndexOfDay(Integer month, int index) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH), index);
        return calendar.getTime();
    }

    /**
     * 得到某年某周的第一天
     *
     * @param year
     * @param week
     * @return
     */
    public static Date getFirstDayOfWeek(int year, int week) {
        week = week - 1;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);

        Calendar cal = (Calendar) calendar.clone();
        cal.add(Calendar.DATE, week * 7);

        return getFirstDayOfWeek(cal.getTime());
    }

    /**
     * 得到某年某周的最后一天
     *
     * @param year
     * @param week
     * @return
     */
    public static Date getLastDayOfWeek(int year, int week) {
        week = week - 1;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);
        Calendar cal = (Calendar) calendar.clone();
        cal.add(Calendar.DATE, week * 7);

        return getLastDayOfWeek(cal.getTime());
    }

    /**
     * 取得当前日期所在周的第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK,
                calendar.getFirstDayOfWeek()); // Sunday
        return calendar.getTime();
    }

    /**
     * 取得当前日期所在周的最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK,
                calendar.getFirstDayOfWeek() + 6); // Saturday
        return calendar.getTime();
    }

    /**
     * 取得当前日期所在周的前一周最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfLastWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfWeek(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.WEEK_OF_YEAR) - 1);
    }

    /**
     * 返回指定日期的月的第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH), 1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }

    /**
     * 返回指定年月的月的第一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date getFirstDayOfMonth(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (year == null) {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null) {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的月的最后一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH), 1);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 返回指定年月的月的最后一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date getLastDayOfMonth(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (year == null) {
            year = calendar.get(Calendar.YEAR);
        }
        if (month == null) {
            month = calendar.get(Calendar.MONTH);
        }
        calendar.set(year, month, 1);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的上个月的最后一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date getLastDayOfLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) - 1, 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.getTime();
    }

    /**
     * 返回指定日期的季的第一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static Date getFirstDayOfQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getFirstDayOfQuarter(calendar.get(Calendar.YEAR),
                getQuarterOfYear(date));
    }

    /**
     * 返回指定年季的季的第一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static Date getFirstDayOfQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1) {
            month = 1 - 1;
        } else if (quarter == 2) {
            month = 4 - 1;
        } else if (quarter == 3) {
            month = 7 - 1;
        } else if (quarter == 4) {
            month = 10 - 1;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return getFirstDayOfMonth(year, month);
    }

    /**
     * 返回指定日期的季的最后一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static Date getLastDayOfQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfQuarter(calendar.get(Calendar.YEAR),
                getQuarterOfYear(date));
    }

    /**
     * 返回指定年季的季的最后一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static Date getLastDayOfQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1) {
            month = 3 - 1;
        } else if (quarter == 2) {
            month = 6 - 1;
        } else if (quarter == 3) {
            month = 9 - 1;
        } else if (quarter == 4) {
            month = 12 - 1;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return getLastDayOfMonth(year, month);
    }

    /**
     * 返回指定日期的上一季的最后一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static Date getLastDayOfLastQuarter(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getLastDayOfLastQuarter(calendar.get(Calendar.YEAR),
                getQuarterOfYear(date));
    }

    /**
     * 返回指定年季的上一季的最后一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static Date getLastDayOfLastQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        Integer month = new Integer(0);
        if (quarter == 1) {
            month = 12 - 1;
        } else if (quarter == 2) {
            month = 3 - 1;
        } else if (quarter == 3) {
            month = 6 - 1;
        } else if (quarter == 4) {
            month = 9 - 1;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return getLastDayOfMonth(year, month);
    }

    /**
     * 返回指定日期的季度
     *
     * @param date
     * @return
     */
    public static int getQuarterOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) / 3 + 1;
    }

    /**
     * 获取今天间隔时间
     * timeInterval为2则获取0 2 4 。。。
     * @param timeInterval
     * @return
     */
    public static List<Date> getDateListOfTodayPerInterval(int timeInterval) {
        List<Date> taskTimeList = new ArrayList<>();
        for (int i = 0; i * timeInterval < 24; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(Calendar.HOUR_OF_DAY,i*timeInterval);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND,0);
            taskTimeList.add(calendar.getTime());
        }
        return  taskTimeList;
    }

    /**
     * 集合两个日期
     * @param taskDay
     * @param time
     */
    public static Date combineTwoDate(Date toAddDayDate, Date toAddTimeDate) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(toAddDayDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(toAddTimeDate);
        int hourOfDay = calendar2.get(Calendar.HOUR_OF_DAY);
        int minute = calendar2.get(Calendar.MINUTE);
        int second = calendar2.get(Calendar.SECOND);
        calendar1.set(Calendar.HOUR_OF_DAY,hourOfDay);
        calendar1.set(Calendar.MINUTE,minute);
        calendar1.set(Calendar.SECOND,second);
        return calendar1.getTime();

    }


    public static  Map<String, String> getBeginAndEndDate(Date date) {
        Map<String, String> map = new HashMap<String, String>();
        // 获得当前年、月
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String yearString = String.valueOf(cal.get(Calendar.YEAR));
        // String.valueOf(date.get(Calendar.MONTH));是获得上个月份
        String monthString = String.valueOf(cal.get(Calendar.MONTH) + 1);

        // 当前月开始的日期
        String beginString = yearString + "-" + monthString + "-01";// 当前月第一天的日期字符串
        int year = Integer.parseInt(yearString);
        int month = Integer.parseInt(monthString);
        // 调用查找当前月有多少天的方法
        int days = getDays(year, month);
        String endString = yearString + "-" + monthString + "-" + days;// 当前月最后一天的日期字符串

        // 调用字符串转换成日期格式的方法
        map.put("0", beginString);
        map.put("1", endString);
        return map;
    }

      public static int getDays(int year, int month) {
        int days = 0;
        if (month != 2) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;

            }
        } else {
            // 闰年
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days = 29;
            }
            else{
                days = 28;
            }

        }
        return days;
    }

}