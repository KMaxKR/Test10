package persons;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;
    }



    @Override
    public String toString() {
        return "name " + name + ' ' +
                ", age = " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o.equals(this.age)){
            return true;
        }

        // doesn't work like this
//        Person x = (Person) o;
//        if (this.age == x.age){return true;}
//        if (this.name != x.name){return true;}
        return false;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
