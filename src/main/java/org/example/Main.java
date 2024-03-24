package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! I am "+Thread.currentThread().getName());
//        Person p = new Person("Kostya","Skorik",19,7000);
//        SaverRunnable sr = new SaverRunnable(p,"C:\\Skorik\\person.txt");
        LoaderRunnable lr = new LoaderRunnable("C:\\Skorik\\person.txt");
        Thread th = new Thread(lr);
        th.start();


        }

}
