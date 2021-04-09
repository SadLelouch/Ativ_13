import java.util.ArrayList;
import java.util.Scanner;

public class Fabrica {
    public static void main (String [] args){
        ArrayList<Veiculo> veicList = new ArrayList<Veiculo>();

        Carro carro = new Carro();
        carro.setModelo ("Honda Civic");
        carro.setCor ("Prata");
        carro.setAno ("2011");
        veicList.add(carro);

        Moto moto = new Moto();
        moto.setModelo ("Yamaha");
        moto.setCor ("Amarelo");
        moto.setAno ("2013");
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
            System.out.println("---------------------------------------");
            System.out.println("Insira a opção que deseja: ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    Carro carroExib = new Carro();
                    int i = 0;
                    for (Veiculo item : veicList) {
                        if (item instanceof Carro){
                            carroExib =(Carro) item;
                        }
                        System.out.println("Posição: " + i);
                        System.out.println("Modelo: " + carroExib.getModelo());
                        System.out.println("Cor: " + carroExib.getCor());
                        System.out.println("Ano: " + carroExib.getAno());
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
            switch (opc){
                case 2:
                    Moto motoExib = new Moto();

                    int i = 0;
                    for (Veiculo item : veicList) {
                        if (item instanceof Moto){
                            motoExib = (Moto) item;
                        }
                        System.out.println("Posição: " + i);
                        System.out.println("Modelo: " + motoExib.getModelo());
                        System.out.println("Cor: " + motoExib.getCor());
                        System.out.println("Ano: " + motoExib.getAno());
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