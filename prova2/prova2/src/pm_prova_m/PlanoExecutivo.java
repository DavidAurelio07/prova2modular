package pm_prova_m;

import java.util.ArrayList;
import java.util.List;

public class PlanoExecutivo extends Aluguel implements Avaliavel{
    private String kmPorDia;
    private int avaliacao;
    private List<Veiculo> veiculos = new ArrayList<>();

    public PlanoExecutivo (String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
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

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Aluguel Básico - Cliente: " + getNomeCliente()
                + " | Quantidade de dias: " + getQuantidadeDias()+ "Valor a diaria"
                + " | R$ " + String.format("%.2f", getValorTotal())+ " | KM por dia: " + getKmPorDia() + " | Possui Motorista Particular! " 
                + " | " + getStatus());
    }

    @Override
    public  void avaliar(int nota){
        setAvaliacao(nota);
    };


    @Override
    public boolean possuiSeguroIncluso(){
        return true;
    };
}
