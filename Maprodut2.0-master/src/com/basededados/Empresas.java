package com.basededados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Essa classe foi criada para ser a base de dados de cadastro das empresas
*/
public class Empresas {
    
    private String nome;
    private String email;
    private String cnpj;
    private String telefone;
    private String login;
    private String senha;
    private String end;
    private String bairro;
    private String numero;
    private String uf;
    private String complemento;
    private String cidade;
/*
    Eu utilizei a visibilidade dos objetos em private para utilizar 
    os métodos getters e setters, como forma de encapsulamento.
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    /* 
    criei o método salvar para criar o arquivo txt com os dados das empresas que
    fazem o cadastro. 
    
    Eu utilizei a biblioteca java.io para entrada e saída dos dados
    Nessa biblioteca utilizei a classe FileWriter para criar o arquivo txt.
    Depois só puxei o try e catch.
    Além do PrintWriter que pula as linhas e etc.
    */
    
    public String salvar (){
          
        try { 
            FileWriter fw = new FileWriter("empresas.txt", true);
            PrintWriter pw = new PrintWriter (fw);
            pw.println("Nome: " + this.nome);
            pw.println("Email: " + this.email);
            pw.println("CNPJ: " + this.cnpj);
            pw.println("Login: " + this.login);
            pw.println("Senha: " + this.senha);
            pw.println("Endereço: " + this.end);
            pw.println("Bairro: " + this.bairro);
            pw.println("Nº: " + this.numero);
            pw.println("UF: " + this.uf);
            pw.println("Complemento: " + this.complemento);
            pw.println("Cidade: " + this.cidade);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Empresas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Cadastro realizado com sucesso!";
        
        // Criei um return com a mensagem de cadastro realizado.
    }
}