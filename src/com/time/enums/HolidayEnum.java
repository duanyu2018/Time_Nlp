package com.time.enums;

/**
 * 中国农历节假日枚举
 */
public enum HolidayEnum {
    new_year_holiday("1_1"),
    lantern_festival_holiday("1_15"),
    dragon_boat_festival_holiday("5_5"),
    qixi_holiday("7_7"),
    mid_autumn_festival_holiday("8_15"),
    chung_yeung_festival_holiday("9_9"),
    laba_holiday("12_8"),
    ;
    private String holiday_date;

    private HolidayEnum(String holiday_date){this.holiday_date = holiday_date;}

    public String getHoliday_date() {
        return holiday_date;
    }

    public void setHoliday_date(String holiday_date) {
        this.holiday_date = holiday_date;
    }
}
