package com.sospedra.hosting.servicios;

import com.sospedra.hosting.entidades.DuracionPlanEntity;
import com.sospedra.hosting.respositorios.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    PlanRepository planRepository;

    public List<DuracionPlanEntity> findAll(){
        return planRepository.findAll();
    }

    public float findPriceById(Long id){
        return planRepository.findPriceById(id);
    }

}
