package FactoryMethod2;

/**
 * トランペットを作成するAbstractCreatorのサブクラスです。
 */
public class TrumpetCreator extends AbstractCreator {

    // トランペットオブジェクトを生成する
    public WindInstrumentProduct createInstrument() {
        return new Trumpet();
    }
}

