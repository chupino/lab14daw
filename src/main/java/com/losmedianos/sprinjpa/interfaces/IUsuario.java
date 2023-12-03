package com.losmedianos.sprinjpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.losmedianos.sprinjpa.modelo.Usuario;

@Repository
public interface IUsuario extends JpaRepository <Usuario,Integer> {
    Usuario findByNombre (String nombre);
}

