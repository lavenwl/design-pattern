package j2ee_pattern.mvc;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午3:13
 */
public class TestMVC {
    @Test
    public void testController(){
        //从数据可获取学生记录
        Student model  = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
