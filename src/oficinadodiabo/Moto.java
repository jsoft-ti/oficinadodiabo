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
public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String nome, double peso, int qtdRodas, String marca, double valor, int cilindrada) {
        super(nome, peso, qtdRodas, marca, valor);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String getInformacoes(){
        String informacao = "Cilindrada: "+this.cilindrada+"\n";
        informacao = super.getInformacoes()+informacao;
        return informacao;
    }
    
    
}
