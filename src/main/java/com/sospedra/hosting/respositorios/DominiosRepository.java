package com.sospedra.hosting.respositorios;

import com.sospedra.hosting.entidades.DominiosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DominiosRepository extends JpaRepository<DominiosEntity,Long> {

    @Query("select d.nombre from DominiosEntity d where d.id = ?1")
    String findDomainName(Long id);

    @Query("select d from DominiosEntity d where d.status = ?1")
    List<DominiosEntity> findDomainByStatus(Boolean status);

    @Query("select d from DominiosEntity d where d.fechaAlta = ?1")
    List<DominiosEntity> findDomainsByUpDate(Date fecha);

}
