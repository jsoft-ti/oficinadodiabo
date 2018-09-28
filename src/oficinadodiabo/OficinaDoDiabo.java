/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinadodiabo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jsoft-ti
 */
public class OficinaDoDiabo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Veiculo> lstVeiculos = new ArrayList<>();
        String menu = "1 - Cadastrar\n2 - Listar\n0 - Sair";
        int op=123;
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op==1){
                String menu2 = "1 - Carro\n2 - Moto";
                int op2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                if(op2==1){
                   String nome = JOptionPane.showInputDialog("Insira o nome");
                   double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso"));
                   int qtdRodas = Integer.parseInt(JOptionPane.showInputDialog("Insira qtd de rodas"));
                   String marca = JOptionPane.showInputDialog("Insira a marca");
                   double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor")); 
                   double potencia = Double.parseDouble(JOptionPane.showInputDialog("Insira a potência"));;
                   int qtdPortas = Integer.parseInt(JOptionPane.showInputDialog("Insira qtd Portas"));
                   int placa = Integer.parseInt(JOptionPane.showInputDialog("Insira a placa"));;
                   Carro carro = new Carro(nome, peso, qtdRodas, marca, valor, potencia, qtdPortas, placa);
                   lstVeiculos.add(carro);
                }else if(op2 == 2){
                   String nome = JOptionPane.showInputDialog("Insira o nome");
                   double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso"));
                   int qtdRodas = Integer.parseInt(JOptionPane.showInputDialog("Insira qtd de rodas"));
                   String marca = JOptionPane.showInputDialog("Insira a marca");
                   double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor")); 
                   int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Insira a cilindrada"));
                   Moto moto = new Moto(nome, peso, qtdRodas, marca, valor, cilindrada);
                   lstVeiculos.add(moto);
                }
            }else if(op==2){
                String dadosLista = "";
                for(Veiculo v:lstVeiculos){
                    if(v instanceof Carro){
                        dadosLista+=((Carro)v).getInformacoes();
                    }else if(v instanceof Moto){
                        dadosLista+=((Moto)v).getInformacoes();
                    }
                   
                   
                }
                JOptionPane.showMessageDialog(null, dadosLista);
                
            }else if(op==3){
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
                lstVeiculos.remove(posicao);
            }else if(op==4){
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
                JOptionPane.showMessageDialog(null, lstVeiculos.get(posicao).getInformacoes());
            }
        }
    }
    
}
