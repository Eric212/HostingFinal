package com.sospedra.hosting.respositorios;

import com.sospedra.hosting.entidades.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<TypeEntity,Long> {

    @Query("select t.type from TypeEntity t where t.id=?1")
    public String findTypeById(Long id);
}
