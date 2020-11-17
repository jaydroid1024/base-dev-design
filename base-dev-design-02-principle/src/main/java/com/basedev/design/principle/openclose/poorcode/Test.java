package com.basedev.design.principle.openclose.poorcode;


/**
 * Created by geely
 */
public class Test {

    private static ICourse iCourse;
    private static JavaCourse javaCourse;

    public static void main(String[] args) {
        iCourse = new JavaCourse(96, "Java从零到企业级电商开发", 348d);
        javaCourse = (JavaCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");
    }

}
