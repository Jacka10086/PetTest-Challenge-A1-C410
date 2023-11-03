// 定义一个宠物类Pet
public class Pet {

    // 私有成员变量，用于存储宠物的名字
    private String name;
    // 私有成员变量，用于存储宠物的年龄
    private int age;

    // Pet类的构造方法，用于创建Pet对象时初始化名字和年龄
    public Pet(String theName, int theAge) {
        this.name = theName; // 初始化宠物的名字
        this.age = theAge;   // 初始化宠物的年龄
    }

    // getName方法，用于获取宠物的名字
    public String getName() {
        return this.name;
    }

    // setName方法，用于设置宠物的名字
    public void setName(String theName) {
        this.name = theName;
    }

    // getAge方法，用于获取宠物的年龄
    public int getAge() {
        return this.age;
    }

    // setAge方法，用于设置宠物的年龄
    public void setAge(int theAge) {
        this.age = theAge;
    }

}
