package ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Iliana", 23, "0884110231"),
                new Person("Svetoslava", 25, "0884111271")
        };
        for(Person p : people){
            p.sayHi();
            p.givePhoneNumber();
            System.out.println();

        }
        people[0].addFriend(people[1]);
        people[1].addFriend(people[0]);
        people[0].listFriends();
        people[1].sayHi(people[0]);
    }


}
