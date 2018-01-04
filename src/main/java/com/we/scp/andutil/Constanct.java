package com.we.scp.andutil;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by scp on 2017/9/14.
 */

public class Constanct {

    private Constanct() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 空间大小常量
     */
    public static class Size {

        public static final int BYTE = 1;
        public static final int KB = 1024;
        public static final int MB = 1024 * KB;
        public static final int GB = 1024 * MB;
        public static final int TB = 1024 * GB;

        @IntDef({BYTE, KB, MB, GB})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Unit {
        }
    }


    /**
     * 常用时间常量
     */
    public static class Time {
        public static final long MILLISECOND = 1;
        public static final long SECOND = 1000;
        public static final long MINUTE = 60 * SECOND;
        public static final long HOUR = 60 * MINUTE;
        public static final long DAY = 24 * HOUR;
        /**
         * 按七天计算
         */
        public static final long WEEK = 7 * DAY;
        /**
         * 按30天计算
         */
        public static final long MONTH = 30 * DAY;

        /**
         * 按365天计算
         */
        public static final long YEAR = 365 * DAY;

        @IntDef({MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK, MONTH, YEAR})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Unit {
        }
    }

    /**
     * 正则相关常量
     */
    public static class Regex {


        /**
         * 正则：手机号（简单）
         */
        public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";

        /**
         * 正则：手机号（精确）
         * <p>移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188</p>
         * <p>联通：130、131、132、145、155、156、171、175、176、185、186</p>
         * <p>电信：133、153、173、177、180、181、189</p>
         * <p>全球星：1349</p>
         * <p>虚拟运营商：170</p>
         */
        public static final String REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,1,3,5-8])|(18[0-9])|(147))\\d{8}$";

        /**
         * 正则：电话号码
         */
        public static final String REGEX_TEL = "^0\\d{2,3}[- ]?\\d{7,8}";
        /**
         * 正则：身份证号码15位
         */
        public static final String REGEX_ID_CARD15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";
        /**
         * 正则：身份证号码18位
         */
        public static final String REGEX_ID_CARD18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$";
        /**
         * 正则：邮箱
         */
        public static final String REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        /**
         * 正则：URL
         */
        public static final String REGEX_URL = "[a-zA-z]+://[^\\s]*";
        /**
         * 正则：汉字
         */
        public static final String REGEX_ZH = "^[\\u4e00-\\u9fa5]+$";
        /**
         * 正则：用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
         */
        public static final String REGEX_USERNAME = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$";
        /**
         * 正则：yyyy-MM-dd格式的日期校验，已考虑平闰年
         */
        public static final String REGEX_DATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";
        /**
         * 正则：IP地址
         */
        public static final String REGEX_IP = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

        ///////////////////////////////////////////////////////////////////////////
        // 以下摘自http://tool.oschina.net/regex
        ///////////////////////////////////////////////////////////////////////////

        /**
         * 正则：双字节字符(包括汉字在内)
         */
        public static final String REGEX_DOUBLE_BYTE_CHAR = "[^\\x00-\\xff]";
        /**
         * 正则：空白行
         */
        public static final String REGEX_BLANK_LINE = "\\n\\s*\\r";
        /**
         * 正则：QQ号
         */
        public static final String REGEX_TENCENT_NUM = "[1-9][0-9]{4,}";
        /**
         * 正则：中国邮政编码
         */
        public static final String REGEX_ZIP_CODE = "[1-9]\\d{5}(?!\\d)";
        /**
         * 正则：正整数
         */
        public static final String REGEX_POSITIVE_INTEGER = "^[1-9]\\d*$";
        /**
         * 正则：负整数
         */
        public static final String REGEX_NEGATIVE_INTEGER = "^-[1-9]\\d*$";
        /**
         * 正则：整数
         */
        public static final String REGEX_INTEGER = "^-?[1-9]\\d*$";
        /**
         * 正则：非负整数(正整数 + 0)
         */
        public static final String REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";
        /**
         * 正则：非正整数（负整数 + 0）
         */
        public static final String REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";
        /**
         * 正则：正浮点数
         */
        public static final String REGEX_POSITIVE_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";
        /**
         * 正则：负浮点数
         */
        public static final String REGEX_NEGATIVE_FLOAT = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$";
    }

}
