package FactoryMethod2;

public class Main {

    public static void main(String[] args) {
        AbstractCreator tc = new TrumpetCreator();
        AbstractCreator sc = new SaxophoneCreator();
        WindInstrumentProduct wt = tc.create();
        WindInstrumentProduct ws = sc.create();

        wt.setPlate("トランペット1号");
        wt.printPlate();
        wt.play();

        ws.setPlate("サックス1号");
        ws.printPlate();
        ws.play();
    }

}
