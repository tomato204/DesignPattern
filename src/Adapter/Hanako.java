package Adapter;

public class Hanako implements Chairperson{
    private Taro taro;
    public Hanako() {
        taro=new Taro();
    }
    @Override
    public void organizeClass() {
       taro.enjoyWithAllClassmate();
    }
}
