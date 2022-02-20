package com.sospedra.hosting.respositorios;

import com.sospedra.hosting.entidades.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosEntity,Long> {

    @Query("select u from UsuariosEntity u where u.dni=?1")
    public UsuariosEntity findByDNI(String dni);
}
