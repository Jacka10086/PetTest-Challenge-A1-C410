public class Pet {

    private String name;
    private int age;

    public Pet(String theName, int theAge) {
        this.name = theName;
        this.age = theAge;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int theAge) {
        this.age = theAge;
    }

}
