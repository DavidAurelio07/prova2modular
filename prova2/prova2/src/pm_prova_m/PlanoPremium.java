package pm_prova_m;

import java.util.ArrayList;
import java.util.List;

public class PlanoPremium extends Aluguel{
    private String kmPorDia;
    private List<Veiculo> veiculos = new ArrayList<>();
    

    public PlanoPremium (String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.kmPorDia = "Ilimitado";
    }


    public String getKmPorDia() {
        return kmPorDia;
    }

    public void setKmPorDia(String kmPorDia) {
        this.kmPorDia = kmPorDia;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }


    public void registarVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluguel Básico - Cliente: " + getNomeCliente()
                + " | Quantidade de dias: " + getQuantidadeDias()+ "Valor a diaria"
                + " | R$ " + String.format("%.2f", getValorTotal())+ " | KM por dia: " + getKmPorDia()
                + " | " + getStatus());
    }

    @Override
    public boolean possuiSeguroIncluso(){
        return true;
    };
}
