import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> listaQuartos;
    private List<Reserva> listaReservas;

    public Hotel() {
        this.listaQuartos = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }

    public void adicionarQuarto(int idQuarto, String tipoQuarto, double valorDiario) {
        Quarto quarto = new Quarto(idQuarto, tipoQuarto, valorDiario);
        listaQuartos.add(quarto);
    }

    public void adicionarReserva(String nomeCliente, String dataEntrada, String dataSaida, int quantidadeQuartos, String tipoQuartoReservado) {
        Reserva reserva = new Reserva(nomeCliente, dataEntrada, dataSaida, quantidadeQuartos, tipoQuartoReservado);
        listaReservas.add(reserva);
        atualizarStatusQuartos(tipoQuartoReservado, false);
    }

    public void realizarCheckIn(String nomeCliente) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getNomeCliente().equals(nomeCliente)) {
                atualizarStatusQuartos(reserva.getTipoQuartoReservado(), false);
                System.out.println("Check-in realizado para " + nomeCliente);
                return;
            }
        }
        System.out.println("Reserva não encontrada para " + nomeCliente);
    }

    public void realizarCheckOut(String nomeCliente) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getNomeCliente().equals(nomeCliente)) {
                atualizarStatusQuartos(reserva.getTipoQuartoReservado(), true);
                System.out.println("Check-out realizado para " + nomeCliente);
                return;
            }
        }
        System.out.println("Reserva não encontrada para " + nomeCliente);
    }

    private void atualizarStatusQuartos(String tipoQuartoReservado, boolean statusDisponivel) {
        for (Quarto quarto : listaQuartos) {
            if (quarto.getTipoQuarto().equals(tipoQuartoReservado) && quarto.isStatusDisponivel() != statusDisponivel) {
                quarto.setStatusDisponivel(statusDisponivel);
                return;
            }
        }
    }

    public void gerarRelatorioOcupacao() {
        int quartosOcupados = 0;
        for (Quarto quarto : listaQuartos) {
            if (!quarto.isStatusDisponivel()) {
                quartosOcupados++;
            }
        }
        System.out.println("Número de quartos ocupados: " + quartosOcupados);
    }

    public void gerarHistoricoReservas() {
        for (Reserva reserva : listaReservas) {
            System.out.println("Nome do cliente: " + reserva.getNomeCliente());
            System.out.println("Data de reserva: " + reserva.getDataEntrada() + " a " + reserva.getDataSaida());
            System.out.println("Número de quartos reservados: " + reserva.getQuantidadeQuartos());
            System.out.println("Tipo de quarto reservado: " + reserva.getTipoQuartoReservado());
            System.out.println();
        }
    }
}
