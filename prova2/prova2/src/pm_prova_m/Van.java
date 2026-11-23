package pm_prova_m;

public class Van extends Veiculo implements Avaliavel,Inspecionavel{
    private int quantMaxPassageiro;
    private int avaliacao;
    

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status,int quantMaxPassageiro){

        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
        this.quantMaxPassageiro = quantMaxPassageiro;
    };

    public int getQuantMaxPassageiro() {
        return quantMaxPassageiro;
    }


    public void setQuantMaxPassageiro(int quantMaxPassageiro) {
        this.quantMaxPassageiro = quantMaxPassageiro;
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
        System.out.println("[Van] Placa: " + getPlaca()
                + " | Modelo: " + getModelo()+ " | Quantidade Máxima" +getQuantMaxPassageiro() + "Valor a diaria"
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
        System.out.println("Não precisa realiar inspenção!");
    }
    
}
