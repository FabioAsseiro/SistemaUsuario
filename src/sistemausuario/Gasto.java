package sistemausuario;

import java.time.LocalDate;

public class Gasto {
    private String nomeGasto;
    private Double valorGasto;
    private int codigoGasto;
    private LocalDate data;

    public String getNomeGasto() {
        return nomeGasto;
    }

    public void setNomeGasto(String nomeGasto) {
        this.nomeGasto = nomeGasto;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public int getCodigoGasto() {
        return codigoGasto;
    }

    public void setCodigoGasto(int codigoGasto) {
        this.codigoGasto = codigoGasto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Gasto(String nomeGasto, Double valorGasto, int codigoGasto, LocalDate data) {
        this.nomeGasto = nomeGasto;
        this.valorGasto = valorGasto;
        this.codigoGasto = codigoGasto;
        this.data = data;
    }
}
