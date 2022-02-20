package com.sospedra.hosting.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuarios", schema = "hosting", catalog = "")
public class UsuariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "Apellidos")
    private String apellidos;
    @Basic
    @Column(name = "DNI")
    private String dni;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "fk_suscripcion")
    private Long fkSuscripcion;
    @Basic
    @Column(name = "fk_dominios")
    private Long fkDominios;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getFkSuscripcion() {
        return fkSuscripcion;
    }

    public void setFkSuscripcion(Long fkSuscripcion) {
        this.fkSuscripcion = fkSuscripcion;
    }

    public Long getFkDominios() {
        return fkDominios;
    }

    public void setFkDominios(Long fkDominios) {
        this.fkDominios = fkDominios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuariosEntity that = (UsuariosEntity) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(dni, that.dni) && Objects.equals(email, that.email) && Objects.equals(fkSuscripcion, that.fkSuscripcion) && Objects.equals(fkDominios, that.fkDominios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, dni, email, fkSuscripcion, fkDominios);
    }
}
