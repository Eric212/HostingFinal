package com.sospedra.hosting.servicios;

import com.sospedra.hosting.entidades.DominiosEntity;
import com.sospedra.hosting.entidades.WebEntity;
import com.sospedra.hosting.respositorios.DominiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DominiosService {
    @Autowired
    DominiosRepository dominiosRepository;

    @Autowired
    WebService webService;

    public List<DominiosEntity> findAll(){
        return dominiosRepository.findAll();
    }

    public String findDomainName(Long id){
        return dominiosRepository.findDomainName(id);
    }

    public List<DominiosEntity> findDomainByStatus(Boolean status){
        return dominiosRepository.findDomainByStatus(status);
    }

    public List<DominiosEntity> findDomainByUpDate(Date fecha){
        return dominiosRepository.findDomainsByUpDate(fecha);
    }

    public DominiosEntity createDomain(DominiosEntity domain){
        return dominiosRepository.save(domain);
    }

    public void updateDomain(DominiosEntity domain){
        dominiosRepository.save(domain);
    }

    public void deleteDomain(DominiosEntity domain){
        webService.delete(webService.findWebByDomain(domain.getFkWeb()));
        dominiosRepository.delete(domain);
    }
}
