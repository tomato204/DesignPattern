package Adapter;

/**
 * 「継承」を利用したAdapterパターン
 * @author d009015
 *
 */
public class NewTaro extends Taro implements Chairperson{

    @Override
    public void organizeClass() {
       enjoyWithAllClassmate();

    }


}
