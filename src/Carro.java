public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private boolean disponivel;

    public Carro(String modelo, int ano, String cor, boolean disponivel) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        String disp = disponivel ? "Sim" : "Não";
        return String.format("Modelo: %s | Ano: %d | Cor: %s | Disponível: %s",
                modelo, ano, cor, disp);
    }
}
