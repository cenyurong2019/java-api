package com.tedu.cn;

public class Person {
    private  String name;
    private int age;
    private double height;
    private double weight;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, double height, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }
    //equals比较对象的内容


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.gender == p.gender? true : false;
        }
        return false;
        }

  public String toString (){
        return this.name+":"+this.age+":"+this.gender+":"+this.height+":"+this.weight+":"+this.height;
  }
}
