package Iterator;

public class Main {
    public static void main(String[] args) {

      //Iterator実装前
       Teacher you = new MyTeacher();
       you.createStudentList();
       you.callStudents();

       //Iterator実装後
       Teacher vete = new VeteranTeacher();
       vete.createStudentList();
       vete.callStudents();

    }
}
