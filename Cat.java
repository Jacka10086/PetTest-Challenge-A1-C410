// 定义一个Cat类，它继承自Pet类
public class Cat extends Pet {

    // 私有成员变量，用于存储猫的品种
    private String breed;

    // Cat类的构造方法，用于创建Cat对象时初始化名称、年龄和品种
    public Cat(String theName, int theAge, String theBreed) {
        super(theName, theAge); // 调用父类的构造方法来初始化名称和年龄
        this.breed = theBreed; // 初始化猫的品种
    }

    // 重写speak方法，用于返回猫叫的声音和一些基本信息
    public String speak() {
        return "Miaow! I am " + this.getName() + ", a " + this.getAge() + " year old " + this.breed;
    }
}

