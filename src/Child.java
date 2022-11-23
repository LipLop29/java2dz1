public class Child extends Human{

    public Child(String surname, int age) {
        super(surname, age);
    }

    @Override
    public String life(int age, String surname) {
        return super.life(age, surname);
    }
}
