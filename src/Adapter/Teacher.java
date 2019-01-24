package Adapter;

public class Teacher {
    public static void main(String[] args) {

        //コンパイルエラーが発生
        //Chairperson chairperson = new Taro();
       // chairperson.organizeClass();

        //継承を利用したAdapterパターン
        Chairperson chairperson1 = new NewTaro();
        chairperson1.organizeClass();

        //委譲を利用したAdapterパターン
        Chairperson chairperson2 = new Hanako();
        chairperson2.organizeClass();

    }

}
