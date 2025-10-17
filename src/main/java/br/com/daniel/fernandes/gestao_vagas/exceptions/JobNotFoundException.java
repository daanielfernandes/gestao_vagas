package br.com.daniel.fernandes.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException {
    
    public JobNotFoundException() {
        super("Vaga não existe");
    }

}
