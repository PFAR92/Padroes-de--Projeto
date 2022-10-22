package one.digitalinnovation.labPadroesProjetosSpring.service.impl;

import one.digitalinnovation.labPadroesProjetosSpring.model.Cliente;
import one.digitalinnovation.labPadroesProjetosSpring.service.ClienteService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 */

public class ClienteServiceImpl implements ClienteService{

    @Override
    public Iterable<Cliente> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        
    }

    
    
}
