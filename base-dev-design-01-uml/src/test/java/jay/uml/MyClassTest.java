package jay.uml;


import org.junit.Test;

class MyClassTest {
    @Test
    public void test_getAgt() {
        MyClass a = new MyClass();
        int age = a.getAge();
        System.out.println("age: " + age);
    }


}