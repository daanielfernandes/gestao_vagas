package br.com.daniel.fernandes.gestao_vagas.exceptions;

public class UserNotFoundException extends RuntimeException {
    
    public UserNotFoundException() {
        super("Usuário não existe");
    }

}
