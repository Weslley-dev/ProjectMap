/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.DAOCliente;
import Model.Cliente;
import java.util.List;

/**
 *
 * @author beatr
 */
public class ControleCliente {
    
    DAOCliente dAOCliente = new DAOCliente();

    /**
     * salvar um novo usuario no banco de dados 
     * @param modelCliente
     * @return boolean
     */
    public boolean salvarClienteControle(Cliente modelCliente) {
        return this.dAOCliente.salvarUsuarioDAO(modelCliente);
    }

    public List<Cliente> getListaClienteControle() {
        return this.dAOCliente.getListaClienteDAO();
    }

    public boolean excluirClienteControle(int pCodigo) {
        return this.dAOCliente.excluirUsuarioDAO(pCodigo);
    }    

    public Cliente getClienteControle(int pCodigo) {
        return this.dAOCliente.getClienteDAO(pCodigo);
    }
    // criei o método validar cliente e instanciei o objeto cliente
    public boolean validarClienteController(Cliente cliente) {
        return this.dAOCliente.validarCliente(cliente);
    }
    
}
