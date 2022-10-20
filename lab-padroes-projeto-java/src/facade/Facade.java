package facade;

import facade.subsistema1.CrmService;
import facade.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        
        String cidade = CepApi.getInstacia().recuperarCidade(cep);
        String estado = CepApi.getInstacia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
    
}
