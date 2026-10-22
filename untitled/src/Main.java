//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*void main(String[] args) {

    //TIPO DE DADO + IDENTIFICAÇÃO + VALOR ATRIBUIDO
    String NOME;
    String idade;
    String profissao;
    Scanner entradaUsuario = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    NOME = entradaUsuario.nextLine();

    System.out.println("Qual é a sua profissão?");
    profissao = entradaUsuario.nextLine();

    System.out.println("Qual é a sua idade?");
    idade = entradaUsuario.nextLine();

    System.out.println("Me chamo " + NOME + "!"+ " Sou " + profissao + " e tenho " + idade + "anos" + "!");


}
*/
/*
    operadores de igualdade (==, !=), Operadores relacionados (>, >=, <, <=)
    if (condição){ true
    codigo que será executado quando for verdadeiro
    else {false
    codigo que será executado quando for falso(else sempre será falso)
    }



 */
/*void main(String[] args) {
    byte idade;
    System.out.println("Qual é a sua idade? ");
    Scanner entradaUsuario = new Scanner(System.in);
    idade = entradaUsuario.nextByte();

    if (idade <= 10){

        System.out.println("CRIANÇA");

    }else if (idade <= 17){
        System.out.println("adolescente");
    }else if(idade>17){
        System.out.println("Adulto");
    }
}
*/
//OPERADORES LÓGICOS || (OU) e && (e)

/*void main(String[] args){

    int num1 = 10;
    int num2 = 20;
    int num3 = 40;
    int num4 = 40;

    System.out.println();
    Scanner entradaUsuario = new Scanner(System.in);

    if(num1 == num2 || num3 > num4){
        System.out.println("verdadeiro");
    }else{
        System.out.println("False");
    }
    //Embaixo se usa o "E" ambas validações precisão ser verdadeiro para ser true
    if(num1 < num2 && num3 == num4){
        System.out.println("verdadeiro");
    }else{
        System.out.println("False");
    }
}
*/
//ARRAYS PODE ARMAZENAR VÁRIAS VALORES, BOM PARA ARMAZENAR LISTAS.

/*+void main(String[] args){

    String[] listaCompras = {"maçã","Carne","feijão","Batata","Arroz"};
    int[] sorteio = {10,20,30,40,50};
    double[] Moedas = {10.50, 99.90, 89.90, 100.00};
    boolean[] estados = {false, true,false};

    Scanner entradaUsuario = new Scanner(System.in);
    System.out.println(Arrays.toString(Moedas));

}*/
//ESTRUTURA DE REPETIÇÃO WHILE LOOPS

/*void main(String[] args){

    int indice = 0;
    String[] listaCompras = {"maçã","Carne","feijão","Batata","Arroz"};

    while (listaCompras.length <=5){ //length significa tamanho

        System.out.println(listaCompras[indice]);
        indice++; //colocando o indice++ embaixo, consigo mostrar o primeiro item da lista, porque o 1º é 0
    }
}*/

//FOR MESMA IDEIA DO WHILE, MAS É MAIS SIMPLIFICADO E POSSO CRIAR DENTRO DA CONDIÇÃO

/*void main(String[] args){

    //  int indice = 0;
    String[] listaCompras = {"maçã","Carne","feijão","Batata","Arroz"};

    for (int indice = 0; listaCompras.length <=5; indice++){ //length significa tamanho
        System.out.println(listaCompras[indice]);
    }
}*/
//SWITCH PARECIDO COM IF, MAS TRABALHA DE FORMA DIFERENTE
/*void main(String[] args) {

    byte opcoesBanco;

    System.out.println("Escolha uma opção: \n " + // \n é para pular linha
            "1 - Ver fatura do cartão \n " +
            "2 - saldo conta corrente \n " +
            "3 - Poupança \n " +
            "4 - Câmbio"
    );
    Scanner entradaUsuario = new Scanner(System.in);
    opcoesBanco = entradaUsuario.nextByte();

    switch (opcoesBanco){
        case 1:
            System.out.println("fatura do cartão");
            break;

        case 2:
            System.out.println("Conta corrente");
            break;

        case 3:

            System.out.println("Poupança");
            break;

        case 4:
            System.out.println("Câmbio");
            break;
        default:
            System.out.println("Nenhuma opção selecionada!");
    }

    System.out.println();
}*/
//PROGRAMAÇÃO ORIENTADA A OBJETOS - mais avançado agora.


import POO.Carro;

//import POO.Carro;

void main(String[] args) {

    Scanner entradaUsuario = new Scanner(System.in);

    Carro carro1 = new Carro("Azul", "Bozo22");
    carro1.detalhesCarro();
    carro1.acelerar();

    Carro carro2 = new Carro("Cinza", "Vazar daqui");
    carro2.detalhesCarro();
    carro2.abastecer();

    System.out.println();
}



















