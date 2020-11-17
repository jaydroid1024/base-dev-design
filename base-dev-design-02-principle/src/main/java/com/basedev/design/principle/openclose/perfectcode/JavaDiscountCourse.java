package com.basedev.design.principle.openclose.perfectcode;


/**
 * Created by geely
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}
