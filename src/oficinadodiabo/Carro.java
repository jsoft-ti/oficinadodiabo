/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinadodiabo;

/**
 *
 * @author jsoft-ti
 */
public class Carro extends Veiculo {
    private double potencia;
    private int qtdPortas;
    private int placa;

    public Carro(String nome, double peso, int qtdRodas, String marca, double valor, double potencia, int qtdPortas, int placa ) {
        super(nome, peso, qtdRodas, marca, valor);
        this.potencia = potencia;
        this.qtdPortas = qtdPortas;
        this.placa = placa;
    }
    
    @Override
    public String getInformacoes(){
        String informacao = "Potencia:"+this.potencia+" Portas:"+this.qtdPortas+" Placa:"+this.placa+"\n";
        informacao = super.getInformacoes() + informacao;
        return informacao;
    }
    
    
    
    
}
