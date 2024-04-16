
package br.ulbra.entity;

public class Usuario {
    private int pkIdUusu; 
    private String nomeUsu; 
    private String emailUsu; 
    private String senhaUsu; 
    
    
    public Usuario(){
        this.pkIdUusu = 1;
        this.nomeUsu = "Matheus";
        this.emailUsu = "m@t.com"; 
        this.senhaUsu = "123";  
    }

    public int getPkIdUusu() {
        return pkIdUusu;
    }

    public void setPkIdUusu(int pkIdUusu) {
        this.pkIdUusu = pkIdUusu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    @Override
    public String toString() {
        return "Usuario{" + "pkIdUusu=" + pkIdUusu + ", nomeUsu=" + nomeUsu + ", emailUsu=" + emailUsu + ", senhaUsu=" + senhaUsu + '}';
    }
    
    
}
