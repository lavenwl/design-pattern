package j2eepattern.interceptingfilter;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:40
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
