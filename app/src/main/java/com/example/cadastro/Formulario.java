package com.example.cadastro;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private String sexo;
    private String cidade;
    private String uf;

    public String toString() {
        return "Nome: " + nomeCompleto + "\n"
                + "Telefone: " + telefone + "\n"
                + "Email: " + email + "\n"
                + "Sexo: " + sexo + "\n"
                + "Cidade: " + cidade + "\n"
                + "UF: " + uf;
    }
}