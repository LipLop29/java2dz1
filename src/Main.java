public class Main {
    public static void main(String[] args) {

        Human human = new Human("Russo",23);
        Child child1 = new Child("Werty",8);
        Child child = new Child("Assay",4);

        human.life();
        child.life(4,"Assay");
        child1.life(8,"Werty");
        System.out.println(child.getAge() + " " + child.getSurname() + " " + Names.Dobbi);
        System.out.println(child1.getAge() + " " + child1.getSurname() + " " + Names.Kira);
        System.out.println(human.getAge() + " " + human.getSurname() + " " + Names.Hannah);
    }
}


