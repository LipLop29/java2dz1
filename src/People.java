public class People {
    private String surname;
    private int age;

    private Baby baby;
    private Names names;

    public People(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
