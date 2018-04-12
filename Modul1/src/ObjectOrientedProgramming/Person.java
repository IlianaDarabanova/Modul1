package ObjectOrientedProgramming;

import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private String phone;
    private ArrayList<Person> friends = new ArrayList<>();
    public Person(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void sayHi(){
        System.out.print("hey, I am "+name+". I'm "+age+" years old.");
    }

    public void sayHi(Person person){
        System.out.println("Hey, "+person.name+" I'm "+name + " ");
    }

    public void givePhoneNumber(){
        System.out.println(" My phone number is "+phone);
    }

    public void addFriend(Person newFriend){
        friends.add(newFriend);
    }

    public void listFriends(){
        System.out.print("My friends are: ");
        for(Person friend : friends){
            System.out.print(friend.name+" ");
        }
    }
}
