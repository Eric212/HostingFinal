package com.sospedra.hosting.servicios;

import com.sospedra.hosting.entidades.WebEntity;
import com.sospedra.hosting.respositorios.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebService {
    @Autowired
    WebRepository webRepository;

    public WebEntity findWebByDomain(Long id){
        return webRepository.findWebByDomain(id);
    }

    public String findWebUrl(Long id){
        return webRepository.findWebUrl(id);
    }
    public Boolean findWebActive(Long id){
        return webRepository.findWebActive(id);
    }
    public void delete(WebEntity web){
        webRepository.delete(web);
    }
}
