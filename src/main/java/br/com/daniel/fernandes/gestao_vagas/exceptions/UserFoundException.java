package br.com.daniel.fernandes.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {

    public UserFoundException() {
        super("Usuário já existe");
    }
    
}