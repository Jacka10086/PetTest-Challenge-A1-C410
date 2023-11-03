// 定义一个Dog类，继承自Pet类
public class Dog extends Pet {

    // 私有成员变量，用于存储狗的品种
    private String dogBreed;

    // Dog类的构造方法，用于创建Dog对象时初始化名称、年龄和品种
    public Dog(String theName, int theAge, String theBreed) {
        super(theName, theAge); // 调用父类Pet的构造方法来初始化名称和年龄
        this.dogBreed = theBreed; // 初始化狗的品种
    }

    // 重写speak方法，用于返回狗叫的声音和一些基本信息
    public String speak() {
        return "Woof! I am " + this.getName() + ", a " + this.getAge() + " year old " + this.dogBreed;
    }
}
