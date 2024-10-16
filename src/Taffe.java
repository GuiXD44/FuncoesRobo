public class Taffe {

    public int numeracao;

    public String versao;

    public int posicaoAtual = 0;

    public String dizerOi(){
        return "Oi pessoal";
    }

    public void falar(String oqueFalar){

        System.out.println(oqueFalar);

    }


    public void andar(int quantidadePassos, boolean paraFrente){

        for(int i = 1; i <= quantidadePassos; i++){
            System.out.println("Passo " + i);
        }
        if(paraFrente == true){
            posicaoAtual += quantidadePassos;
        }else{
            posicaoAtual -= quantidadePassos;
        }
    }

    public void retornarPosicao(){
        System.out.println("A posição é: " + posicaoAtual);
    }

    //manda mensagem bravo
    //dizer oi
    //dar um recado em sala
    //andar
    //falar
    //limpar casa
    //cantar uma musica
    //mudar idioma
}
