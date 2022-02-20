package com.sospedra.hosting.servicios;

import com.sospedra.hosting.entidades.TypeEntity;
import com.sospedra.hosting.respositorios.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    @Autowired
    TypeRepository typeRepository;
    public String findTypeById(Long id){
        return typeRepository.findTypeById(id);
    }
    public List<TypeEntity> findAll(){
        return typeRepository.findAll();
    }
}
