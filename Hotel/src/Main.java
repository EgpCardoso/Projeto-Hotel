import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar Quarto");
            System.out.println("2. Adicionar Reserva");
            System.out.println("3. Realizar Check-in");
            System.out.println("4. Realizar Check-out");
            System.out.println("5. Gerar Relatório de Ocupação");
            System.out.println("6. Gerar Histórico de Reservas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("ID do quarto: ");
                    int idQuarto = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Tipo de quarto: ");
                    String tipoQuarto = scanner.nextLine();
                    System.out.print("Valor diário: ");
                    double valorDiario = scanner.nextDouble();
                    hotel.adicionarQuarto(idQuarto, tipoQuarto, valorDiario);
                    break;
                case 2:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Data de entrada: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Data de saída: ");
                    String dataSaida = scanner.nextLine();
                    System.out.print("Quantidade de quartos reservados: ");
                    int quantidadeQuartos = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Tipo de quarto reservado: ");
                    String tipoQuartoReservado = scanner.nextLine();
                    hotel.adicionarReserva(nomeCliente, dataEntrada, dataSaida, quantidadeQuartos, tipoQuartoReservado);
                    break;
                case 3:
                    System.out.print("Nome do cliente: ");
                    nomeCliente = scanner.nextLine();
                    hotel.realizarCheckIn(nomeCliente);
                    break;
                case 4:
                    System.out.print("Nome do cliente: ");
                    nomeCliente = scanner.nextLine();
                    hotel.realizarCheckOut(nomeCliente);
                    break;
                case 5:
                    hotel.gerarRelatorioOcupacao();
                    break;
                case 6:
                    hotel.gerarHistoricoReservas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
