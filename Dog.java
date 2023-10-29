public class Dog extends Pet {

    private String dogBreed;

    public Dog(String theName, int theAge, String theBreed) {
        super(theName, theAge);
        this.dogBreed = theBreed;
    }

    public String speak() {
        return "Woof! I am " + this.getName() + ", a " + this.getAge() + " year old " + this.dogBreed;
    }

}
