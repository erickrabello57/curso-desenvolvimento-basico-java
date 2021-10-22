package one.digitalInnovation.exceptions.loiane.exercicio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        String opcao = escolherOpcao().toUpperCase();
        while(!opcao.equals("X")){
            switch (opcao){
                case "1":
                    agenda.consultarContato();
                    break;

                case "2":
                    agenda.adicionarContato();
                    break;

                case "3":
                    agenda.listarContatos();
                    break;
                default:
                    System.out.println();
                    System.out.println("Obrigado por usar nossa agenda, volte sempre!");
                    System.exit(0);

            }
            opcao = escolherOpcao();
        }


    }

    public static String escolherOpcao(){
        System.out.println("=== MENU AGENDA ===");
        System.out.println("1 - Consultar contato da agenda");
        System.out.println("2 - Adicionar contato na agenda");
        System.out.println("3 - Listar contatos da agenda");
        System.out.println("X - Sair da agenda");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Q que deseja fazer?");
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.next();
        return opcao;

    }
}
