package facade.subsistema2;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstacia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Patrocínio";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }
}
