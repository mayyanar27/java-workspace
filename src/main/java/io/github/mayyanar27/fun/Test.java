package io.github.mayyanar27.fun;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 28-06-2021
 * Time: 11:53
 */
public class Test {
    static  int count=0;
    public static void main(String[] args) {
        System.out.println(9/2);
        String s = "ayyanar";
        System.out.println(s.substring(2, 5));
        System.out.println(s.charAt(4));
        if(count <3){
            count ++;
            main(null);
        }else{
            return;
        }
        System.out.println("ddddd");
        String ss= "Hello World!";
        //System.out.println(ss.substring(6, 12) + ss.substring(12, 6));
        System.out.println(Boolean.parseBoolean("FalS3"));
        LinkedList<Object> objects = new LinkedList<>();
        objects.add(5);
        objects.add(1);
        objects.add(10);
        System.out.println(objects);
        String [] aa= {"abc","2","10"};
        List<String> strings = Arrays.asList(aa);
        Collections.sort(strings);
        System.out.println(Arrays.toString(aa));
    }
}
