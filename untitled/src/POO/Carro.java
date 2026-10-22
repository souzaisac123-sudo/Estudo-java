//propriedades | atributos | campos | Variáveis de instância - se referem a mesma coisa.

package POO;

public class Carro {

    String cor;
    String placa;  //var de instância

    public Carro(String cor, String placa) {

        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesCarro(){
        System.out.println("O carro tem cor " + cor + " e o número da Placa é: " + placa);
    }

    public void acelerar(){
        System.out.println("Carro está em movimento");
    }

    public void frear(){
        System.out.println("Carro está parando");
    }

    public void abastecer(){
        System.out.println("Carro está abastecendo.");
    }


}
