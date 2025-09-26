import java.util.ArrayList;

public class Locadora {
    private ArrayList<Carro> carros = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCarro(Carro c) {
        carros.add(c);
        System.out.println("Carro cadastrado: " + c.getModelo());
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente cadastrado: " + c.getNome());
    }

    public void alugarCarro(String modelo) {
        for (Carro c : carros) {
            if (c.getModelo().equalsIgnoreCase(modelo) && c.isDisponivel()) {
                c.setDisponivel(false);
                System.out.println("Carro alugado: " + modelo);
                return;
            }
        }
        System.out.println("Carro não encontrado ou indisponível.");
    }

    public void devolverCarro(String modelo) {
        for (Carro c : carros) {
            if (c.getModelo().equalsIgnoreCase(modelo) && !c.isDisponivel()) {
                c.setDisponivel(true);
                System.out.println("Carro devolvido: " + modelo);
                return;
            }
        }
        System.out.println("Carro não encontrado ou já está disponível.");
    }

    public void listarCarrosDisponiveis() {
        System.out.println("Carros disponíveis:");
        for (Carro c : carros) {
            if (c.isDisponivel()) {
                System.out.println(c);
            }
        }
    }
}
