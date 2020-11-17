package jay.uml;
import org.junit.Test;

class MyClassTest {
    @Test
    public void test_getAgt() {
        TestC a = new TestC();
        int age = a.getAge();
        System.out.println("age: " + age);
    }


}