package com.instancia2.demoSpringV.service.impl;

import com.instancia2.demoSpringV.data.entity.UsuarioEntity;
import com.instancia2.demoSpringV.data.repository.UsuarioRepository;
import com.instancia2.demoSpringV.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public String login(String user, String pass) {

        String resp = null;

        UsuarioEntity usuarioEntity = usuarioRepository.findByUserAndPass(user,pass);

        if(usuarioEntity != null){
            resp = "Todo ha ido bien";
        }else{
            resp = "Usuario o contreaseña no coincide";
        }

        return resp;
    }
}
