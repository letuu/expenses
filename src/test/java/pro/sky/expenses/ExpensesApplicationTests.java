package pro.sky.expenses;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class ExpensesApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testTest() {
        String s1 = null;
        String s2 = null;
        String s3 = "null";
        System.out.println(s3.equals(s2));                          //false
        System.out.println(s1 == s2);                               //true
        System.out.println(Objects.equals(s1, s2));                 //true
        System.out.println(Objects.equals(null, null));       //true

        //java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s1" is null
//        System.out.println(s1.equals(s3));              //Method invocation 'equals' will produce 'NullPointerException'

//        System.out.println(s1.equals(s2));              //java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s1" is null

    }

}
