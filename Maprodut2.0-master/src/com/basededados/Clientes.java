package com.basededados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Clientes {
    
    private String nome;
    private String email;
    private String cpf;
    private String login;
    private String senha;

/* Do mesmo jeito da classe Empresas essa classe foi criada 
    para ser a base de dados de cadastro dos usuários
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    /* criei o método salvar para criar o arquivo txt com os dados dos usuarios que
    fazem o cadastro. 
    
    Eu utilizei a biblioteca java.io para entrada e saída dos dados
    Nessa biblioteca utilizei a classe FileWriter para criar o arquivo txt.
    Depois só puxei o try e catch.
    Além do PrintWriter que pula as linhas e etc.
    */
    
    public String salvar (){
          
        try { 
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter (fw);
            pw.println("Nome: " + this.nome);
            pw.println("Email: " + this.email);
            pw.println("CPF: " + this.cpf);
            pw.println("Login: " + this.login);
            pw.println("Senha: " + this.senha);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Cadastro realizado com sucesso!";
    }
}
