package factory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/9 下午5:33
 */
public class Rectangle implements Shape {

    @Override
    public String draw() {
        System.out.println("Inside Rectangle::draw() method.");
        return "Inside Rectangle::draw() method.";
    }
}
