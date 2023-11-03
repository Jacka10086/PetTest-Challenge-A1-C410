// 定义一个测试类PetTest，包含main方法作为程序的入口
public class PetTest {

    public static void main(String[] args) {
        // 创建一个Cat对象c1，名字为"Pixel"，年龄为8岁，品种为"Tabby"
        Cat c1 = new Cat("Pixel", 8, "Tabby");
        // 创建一个Dog对象d1，名字为"Rex"，年龄为10岁，品种为"Terrier"
        Dog d1 = new Dog("Rex", 10, "Terrier");
        
        // 调用c1的speak方法，并打印返回的字符串
        System.out.println(c1.speak());
        // 调用d1的speak方法，并打印返回的字符串
        System.out.println(d1.speak());
    }

}
