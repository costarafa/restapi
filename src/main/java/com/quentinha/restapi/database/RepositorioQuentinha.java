package com.quentinha.restapi.database;

import com.quentinha.restapi.entidade.Quentinha;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioQuentinha extends JpaRepository<Quentinha, Long> {
    
}
