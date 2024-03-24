package org.example;

import java.io.*;

public class Person implements Externalizable {

    private String fisrtName;
    private String lastName;
    private int age;
    private int budget;
    ////при (private transient int budget) бюджет был бы не сериализован. И будет значение 0
    public Person(String fisrtName, String lastName, int age, int budget) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
        this.budget = budget;
    }

    private static final long serialVersionUID=4070423994649499055L;

    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getBudget() {
        return budget;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Person {name: "+ getFisrtName() +
                ", surname: "+getLastName() +
                ", age: "+getAge() +
                ", budget: "+getBudget()+"}";
    }

    public Person() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getFisrtName());
        out.writeObject(this.getLastName());
        out.writeObject(this.getAge());
        out.writeObject(this.getBudget());

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.fisrtName=(String) in.readObject();
        this.lastName=(String) in.readObject();
        this.age=(Integer) in.readObject();
        this.budget=(Integer) in.readObject();

    }
}
