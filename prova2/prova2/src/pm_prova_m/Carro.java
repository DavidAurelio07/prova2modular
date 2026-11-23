package pm_prova_m;

public class Carro extends Veiculo implements Avaliavel,Inspecionavel{
    private int quantPortas;
    private int avaliacao;
    


    

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status,int quantPortas){

        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
        this.quantPortas = quantPortas;
    }

    public int getQuantPortas() {
        return quantPortas;
    }


    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public boolean possuiSeguroEspecial(){
        return true;
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("[Carro] Placa: " + getPlaca()
                + " | Modelo: " + getModelo()+ " | Quantidade de portas" +getQuantPortas() + "Valor a diaria"
                + " | R$ " + String.format("%.2f", getValorDiaria())
                + " | " + getQuilometragem() + " KM" + "| Ano" + getAnoFabricacao()
                + " | " + getStatus());
    }


    @Override
    public  void avaliar(int nota){
        setAvaliacao(nota);
    };

    @Override
    public void realizarInspecao(){
        System.out.println("Realizando Inspenção!");
    }
}
