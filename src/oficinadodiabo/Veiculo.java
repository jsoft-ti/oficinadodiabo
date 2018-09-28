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
public class Veiculo {
    private String nome;
    private double peso;
    private int qtdRodas;
    private String marca;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Veiculo(String nome, double peso, int qtdRodas, String marca, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.qtdRodas = qtdRodas;
        this.marca = marca;
        this.valor = valor;
    }
    
    public String getInformacoes(){
        String informacao = "Nome: "+this.nome+" Peso: "+this.peso+" Rodas: "+this.qtdRodas;
        informacao+=" Marca: "+this.marca+" Valor: "+this.valor;
        return informacao;
    }
    
}
