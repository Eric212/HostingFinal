package com.sospedra.hosting.respositorios;

import com.sospedra.hosting.entidades.DuracionPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<DuracionPlanEntity,Long> {

    @Query("select d.precio from DuracionPlanEntity d where d.id = ?1")
    public float findPriceById(Long id);

}
