package com.sospedra.hosting.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "web", schema = "hosting", catalog = "")
public class WebEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "fk_type")
    private Long fkType;
    @Basic
    @Column(name = "active")
    private byte active;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getFkType() {
        return fkType;
    }

    public void setFkType(Long fkType) {
        this.fkType = fkType;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebEntity webEntity = (WebEntity) o;
        return id == webEntity.id && active == webEntity.active && Objects.equals(url, webEntity.url) && Objects.equals(fkType, webEntity.fkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, fkType, active);
    }
}
