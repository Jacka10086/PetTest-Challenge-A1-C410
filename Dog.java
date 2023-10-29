public class Dog extends Pet {

    private String breed;

    public Dog(String theName, int theAge, String theBreed) {
        super(theName, theAge);
        this.breed = theBreed;
    }

    public String speak() {
        return "Woof! I am " + this.getName() + ", a " + this.getAge() + " year old " + this.breed;
    }

}

