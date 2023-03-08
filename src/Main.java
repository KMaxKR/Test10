import persons.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("",0);

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("K. Max", 18));
        personSet.add(new Person("Sakito Monogataki", 26));
        personSet.add(new Person("Aiko Sakura", 19));
        personSet.add(new Person("Akasuki Akane", 20));


        for(Person set : personSet){
            if (set.hashCode() < 20){
                System.out.println("That person are less than 20  ...  " + set);
            } else if (set.equals(20)) {
                System.out.println("You are old enough ... " + set);
            } else {
                System.out.println("That person are more than 20  ...  " + set);
            }
        }

    }
}