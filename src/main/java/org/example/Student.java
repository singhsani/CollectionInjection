package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private List<String> address;

    public String getName() {
        return name;
    }

    public List<String> getAddress() {
        return address;
    }

    public Set<String> getPhone() {
        return phone;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                ", course=" + course +
                '}';
    }

    private Set<String> phone;
    private Map<String,String> course;
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setPhone(Set<String> phone) {
        this.phone = phone;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }


}
