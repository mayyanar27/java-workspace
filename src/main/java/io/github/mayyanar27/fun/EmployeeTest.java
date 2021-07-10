package io.github.mayyanar27.fun;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 06-07-2021
 * Time: 16:24
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "a", 100.0));
        employees.add(new Employee(2, "a", 200.0));
        employees.add(new Employee(3, "a", 150.0));
        employees.sort((o1, o2) -> {
            if (o1.getSalary() == o2.getSalary()) {
                return 0;
            } else if (o1.getSalary() > o2.getSalary()) {
                return -1;
            }
            return 1;
        });
        System.out.println(employees);
    }

}
