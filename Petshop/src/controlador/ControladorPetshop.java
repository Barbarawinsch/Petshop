/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPetshop;
import javax.swing.JOptionPane;
import modelo.Petshop;
import tela.manutencao.ManutencaoPetshop;
/**
 *
 * @author Administrador
 */
public class ControladorPetshop {
    public static void inserir(ManutencaoPetshop man){
        Petshop objeto = new Petshop();
        objeto.setAvaliacao(Integer.parseInt(man.jtfAvaliacao.getText()));
        objeto.setNumero(Integer.parseInt(man.jtfNumero.getText()));
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setNome(man.jtfNome.getText());
        boolean resultado = DaoPetshop.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
