package academy.learnprogramming.classstructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorted() {
        System.out.println("companyName " + name);
        Collections.sort(employees);
        System.out.println("sorted:" + employees);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("name can't be null or an empty String");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String name){
        if (name == null) {
            System.out.println("can't add null employee");
        } else {
            employees.add(name);
        }
    }

}
