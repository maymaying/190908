import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses=new ArrayList<>();
        courses.add("c语言");
        courses.add("Java SE");
        courses.add("Java Web");
        courses.add("Java EE");
        courses.add("c语言");
        System.out.println(courses);
        System.out.println(courses.get(0));
        System.out.println(courses);
        courses.set(0,"计算机基础");
        System.out.println(courses);
        List<String> subCourses=courses.subList(1,3);
        System.out.println(subCourses);
        List<String> course2=new ArrayList<>(courses);
        System.out.println(course2);
        List<String> course3=new LinkedList<>(courses);
        System.out.println(course3);
        ArrayList<String> course4=(ArrayList<String>)course2;
        System.out.println(course4);
        LinkedList<String> course5=(LinkedList<String>)course3;
        System.out.println(course5);
    }
}
