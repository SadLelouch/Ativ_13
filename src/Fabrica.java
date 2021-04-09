import java.util.ArrayList;
import java.util.Scanner;

public class Fabrica {
    public static void main (String [] args){
        ArrayList<Veiculo> veicList = new ArrayList<Veiculo>();
        Moto moto = new Moto();
        moto.setModelo = ("Yamaha");
        moto.setCor = ("Amarelo");
        moto.setAno = ("2011");
        veicList.add(moto);

        Scanner scan = new Scanner(System.in);
        Integer opc = 0;
        // Criação do menu de interação do sistema.
        while (opc != 3) {
            System.out.println("______________________________________:");
            System.out.println("|     Bem vindo ao nosso sistema     |");
            System.out.println("--------------------------------------");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_______________________________________ ");
            System.out.println("| Menu de opções:                     |");
            System.out.println("| 1- Carro                            |");
            System.out.println("| 2- Moto                             |");
            System.out.println("| 3- Sair do sistema                  |");
            System.out.println("---------------------------------------");
            System.out.println("Insira a opção que deseja: ");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    Carro carro = new Carro();
                    carro.setModelo = ("Yamaha");
                    carro.setCor = ("Amarelo");
                    carro.setAno = ("2011");
                    veicList.add(carro);

                    int i = 0;
                    for (Veiculo item : veicList) {
                        System.out.println("Posição: " + i);
                        System.out.println("Modelo: " + item.getModelo());
                        System.out.println("Cor: " + item.getCor());
                        System.out.println("Ano: " + item.getAno());
                        System.out.println(" ");
                        i++;
                    }
                    System.out.println("Informe a posição a ser excluída: ");
                    i = scan.nextInt();
                    if (i > veicList.size()) {
                        System.out.println("Código Inválido");
                        continue;
                    }
                    veicList.remove(i);
                    continue;
            }
        }
    }
}