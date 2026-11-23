package pm_prova_m;

public class Moto  extends Veiculo implements Avaliavel,Inspecionavel{
    private int cilindrada;
    
    

    public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status,int cilindrada){
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.cilindrada = cilindrada;
    };

        public int getCilindrada() {
            return cilindrada;
        };

    public void setCilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
        };

        @Override
    public boolean possuiSeguroEspecial(){
        return true;
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("[Moto] Placa: " + getPlaca()
                + " | Modelo: " + getModelo()+ " | Cilindrada" +getCilindrada() + "Valor a diaria"
                + " | R$ " + String.format("%.2f", getValorDiaria())
                + " | " + getQuilometragem() + " KM" + "| Ano" + getAnoFabricacao()
                + " | " + getStatus());
    }

    @Override
    public  void avaliar(int nota){
        System.out.println("Moto não pode receber avaliação!");
    }

    @Override
    public void realizarInspecao(){
        System.out.println("Não precisa realiar inspenção!");
    }


        
}
