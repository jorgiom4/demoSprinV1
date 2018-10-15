package com.instancia2.demoSpringV.data.repository;

import com.instancia2.demoSpringV.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

    UsuarioEntity findByUserAndPass(String user, String pass);


}
