package com.time.nlp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 节日配置对象
 * @author duanyu
 */
public class HolidayConfig {

    //保存节日,和日期映射数据,前两位表示日期，后一位表示是农历还是阳历 ，0-农历，1-阳历
    private static final Map<String,String> holidayMap = new HashMap<>();

    static {
        holidayMap.put("元旦","1_1_1");
        holidayMap.put("春节","1_1_0");
        holidayMap.put("元宵节","1_15_0");
        holidayMap.put("情人节","2_14_1");
        holidayMap.put("三八妇女节","3_8_1");
        holidayMap.put("38妇女节","3_8_1");
        holidayMap.put("植树节","3_12_1");
        holidayMap.put("白色情人节","3_14_1");
        holidayMap.put("愚人节","4_1_1");
        holidayMap.put("清明节","4_5_1");
        holidayMap.put("五四青年节","5_4_1");
        holidayMap.put("54青年节","5_4_1");
        holidayMap.put("五一劳动节","5_1_1");
        holidayMap.put("51劳动节","5_1_1");
        holidayMap.put("端午节","5_5_0");
        holidayMap.put("六一儿童节","6_1_1");
        holidayMap.put("61儿童节","6_1_1");
        holidayMap.put("建党节","7_1_1");
        holidayMap.put("七夕节","7_7_0");
        holidayMap.put("7夕节","7_7_0");
        holidayMap.put("81建军节","8_1_1");
        holidayMap.put("八一建军节","8_1_1");
        holidayMap.put("中秋节","8_15_0");
        holidayMap.put("重阳节","9_9_0");
        holidayMap.put("国庆节","10_1_1");
        holidayMap.put("万圣节","10_31_1");
        holidayMap.put("光棍节","11_11_1");
        holidayMap.put("腊八节","12_8_0");
        holidayMap.put("腊8节","12_8_0");
        holidayMap.put("小年","12_23_0");
        holidayMap.put("平安夜","12_24_1");
        holidayMap.put("圣诞节","12_25_1");
    }

    /**
     * 给一个节日名称，返回一个日期数组，【月,日,农历/阳历】 农历为0，阳历为1
     * @param holiday 节日名称
     * @return
     */
    public static int[] getHoliday(String holiday){
        if(null == holidayMap.get(holiday)){
            return null;
        }
        String[] strs = holidayMap.get(holiday).split("_");
        return   Arrays.asList(strs).stream().mapToInt(Integer::parseInt).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(HolidayConfig.getHoliday("中秋节")));
    }
}
