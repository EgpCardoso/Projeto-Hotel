public class Reserva {
    private String nomeCliente;
    private String dataEntrada;
    private String dataSaida;
    private int quantidadeQuartos;
    private String tipoQuartoReservado;

    public Reserva(String nomeCliente, String dataEntrada, String dataSaida, int quantidadeQuartos, String tipoQuartoReservado) {
        this.nomeCliente = nomeCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quantidadeQuartos = quantidadeQuartos;
        this.tipoQuartoReservado = tipoQuartoReservado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public String getTipoQuartoReservado() {
        return tipoQuartoReservado;
    }
}
