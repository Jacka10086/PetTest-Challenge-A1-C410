public class PetTest {

    public static void main(String[] args) {
        Cat c1 = new Cat("Pixel", 8, "Tabby");
        Dog d1 = new Dog("Rex", 10, "Terrier");
        
        System.out.println(c1.speak());
        System.out.println(d1.speak());
    }

}
