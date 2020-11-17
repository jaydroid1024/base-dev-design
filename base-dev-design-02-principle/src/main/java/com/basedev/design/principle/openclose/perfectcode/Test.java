package com.basedev.design.principle.openclose.perfectcode;


/**
 * Created by geely
 */
public class Test {

    private static ICourse iCourse;
    private static JavaDiscountCourse javaDiscountCourse;

    public static void main(String[] args) {
        iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaDiscountCourse.getId() + " 课程名称:" + javaDiscountCourse.getName() + " 课程原价:" + javaDiscountCourse.getPrice() + " 课程折后价格:" + javaDiscountCourse.getDiscountPrice() + "元");
    }

}
