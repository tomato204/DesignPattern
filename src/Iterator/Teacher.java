package Iterator;

/**
 * Iterator実装前後共通クラス
 * @author d009015
 *
 */
public abstract class Teacher {
    protected StudentList studentList;

    public abstract void createStudentList();

    public abstract void callStudents();

}
