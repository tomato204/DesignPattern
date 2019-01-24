package Iterator;

/**
 * Iterator実装前クラス
 * @author d009015
 *
 */
public class MyTeacher extends Teacher {
    private StudentList studentList;

    @Override
    public void createStudentList() {
        studentList = new StudentList(5);
        studentList.add(new Student("赤井亮太", 1));
        studentList.add(new Student("赤羽里美", 2));
        studentList.add(new Student("岡田美央", 2));
        studentList.add(new Student("西森俊介", 1));
        studentList.add(new Student("中ノ森玲菜", 2));
    }

    @Override
    public void callStudents() {
        int size = studentList.getLastNum();
        for (int n = 0; n < size; n++) {
            System.out.println(studentList.getStudentAt(n).getName());
        }
    }
}
