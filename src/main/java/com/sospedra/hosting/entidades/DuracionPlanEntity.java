package com.sospedra.hosting.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "duracion_plan", schema = "hosting", catalog = "")
public class DuracionPlanEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "duracion")
    private int duracion;
    @Basic
    @Column(name = "precio")
    private double precio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuracionPlanEntity that = (DuracionPlanEntity) o;
        return id == that.id && duracion == that.duracion && Double.compare(that.precio, precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, duracion, precio);
    }
}
