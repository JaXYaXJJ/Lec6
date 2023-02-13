package hackeru.zakalinskyevgeny.lec6;

public class Person {
    //props:
    private String firstName;
    private String lastName;

    //constructor:
    public Person(String firstName, String lastName){}

    //getter + setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //override
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

//.java
//data class Person2(var firstName: String, var lastName: String)
