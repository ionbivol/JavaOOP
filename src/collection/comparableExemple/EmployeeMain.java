package collection.comparableExemple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Ana",30,400));
        employees.add(new Employee(1,"Maria",28,500));
        employees.add(new Employee(1,"Alexandru",22,100));


        Collections.sort(employees, new EmployeeByAgeComparator());

        for(Employee e : employees){
            System.out.println(e);
        }



    }
}