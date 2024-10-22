public class Quarto {
    private int idQuarto;
    private String tipoQuarto;
    private double valorDiario;
    private boolean statusDisponivel;

    public Quarto(int idQuarto, String tipoQuarto, double valorDiario) {
        this.idQuarto = idQuarto;
        this.tipoQuarto = tipoQuarto;
        this.valorDiario = valorDiario;
        this.statusDisponivel = true; 
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public boolean isStatusDisponivel() {
        return statusDisponivel;
    }

    public void setStatusDisponivel(boolean statusDisponivel) {
        this.statusDisponivel = statusDisponivel;
    }
}
