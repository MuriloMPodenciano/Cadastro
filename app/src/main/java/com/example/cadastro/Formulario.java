package com.example.cadastro;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private String emailCheckbox;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario(String nome, String telefone, String email, String emailcb, String sexo, String cidade, String uf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.emailCheckbox = emailcb;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }


    public String toString() {
        return "Nome: " + nome + "\n"
                + "Telefone: " + telefone + "\n"
                + "Email: " + email + "\n"
                + "Ingressar na lista de email: " + emailCheckbox + "\n"
                + "Sexo: " + sexo + "\n"
                + "Cidade: " + cidade + "\n"
                + "UF: " + uf;
    }
}