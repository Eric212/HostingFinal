package com.sospedra.hosting.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "suscripciones", schema = "hosting", catalog = "")
public class SuscripcionesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "plan")
    private String plan;
    @Basic
    @Column(name = "fk_duracion")
    private long fkDuracion;
    @Basic
    @Column(name = "cuota_ftp")
    private double cuotaFtp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public long getFkDuracion() {
        return fkDuracion;
    }

    public void setFkDuracion(long fkDuracion) {
        this.fkDuracion = fkDuracion;
    }

    public double getCuotaFtp() {
        return cuotaFtp;
    }

    public void setCuotaFtp(double cuotaFtp) {
        this.cuotaFtp = cuotaFtp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuscripcionesEntity that = (SuscripcionesEntity) o;
        return id == that.id && fkDuracion == that.fkDuracion && Double.compare(that.cuotaFtp, cuotaFtp) == 0 && Objects.equals(plan, that.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plan, fkDuracion, cuotaFtp);
    }
}
