public class Main {
    public static void main(String[] args) {

        Taffe taffe = new Taffe();

        String fala = taffe.dizerOi();
        System.out.println(fala);

        taffe.falar("Inter maior toda vida");
        taffe.falar("Aprendendo Classes em java");

        taffe.andar(10,false);
        taffe.andar(30,true);
        taffe.retornarPosicao();

        Taffe patrick = new Taffe();
        patrick.andar(20,false);
        patrick.retornarPosicao();
    }
}