package com.sospedra.hosting.entidades;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "dominios", schema = "hosting", catalog = "")
public class DominiosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "status")
    private byte status;
    @Basic
    @Column(name = "fecha_alta")
    private Date fechaAlta;
    @Basic
    @Column(name = "fk_web")
    private Long fkWeb;

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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Long getFkWeb() {
        return fkWeb;
    }

    public void setFkWeb(Long fkWeb) {
        this.fkWeb = fkWeb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DominiosEntity that = (DominiosEntity) o;
        return id == that.id && status == that.status && Objects.equals(nombre, that.nombre) && Objects.equals(fechaAlta, that.fechaAlta) && Objects.equals(fkWeb, that.fkWeb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, status, fechaAlta, fkWeb);
    }
}
