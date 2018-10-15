package com.instancia2.demoSpringV.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Long idUsuario;

    @Column(name = "user")
    private String user;

    @Column(name = "pass")
    private String pass;

    public UsuarioEntity() {}

    public UsuarioEntity(Long idUsuario, String user, String pass) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.pass = pass;
    }

    // Getter & Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
