package com.sospedra.hosting.servicios;

import com.sospedra.hosting.entidades.UsuariosEntity;
import com.sospedra.hosting.respositorios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    @Autowired
    UsuariosRepository usuariosRepository;
    public UsuariosEntity findByDNI(String dni){
        return usuariosRepository.findByDNI(dni);
    }
}
