
public class Cat extends Pet {

    private String breed;

    public Cat(String theName, int theAge, String theBreed) {
        super(theName, theAge);
        this.breed = theBreed;
    }
    public String speak() {
        return "Miaow! I am " + this.getName() + ", a " + this.getAge() + " year old " + this.breed;
}
}
