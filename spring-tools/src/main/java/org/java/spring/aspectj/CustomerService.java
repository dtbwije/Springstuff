package org.java.spring.aspectj;

public class CustomerService {

    private String name;
    private String url;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printURL() {
        System.out.println(url);
    }

    public void printName() {
        System.out.println(name);
    }

    public Integer printAge() {
        System.out.println(age);
        return age;
    }
}
