package com.quentinha.restapi;

import java.util.List;

import com.quentinha.restapi.database.RepositorioQuentinha;
import com.quentinha.restapi.entidade.Quentinha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quentinha")
public class QuentinhaREST {
    @Autowired
    private RepositorioQuentinha repositorio;

    @GetMapping
    public List<Quentinha> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Quentinha quentinha){
        repositorio.save(quentinha);
    }

    @PutMapping
    public void alterar(@RequestBody Quentinha quentinha){
        if(quentinha.getId() > 0)
            repositorio.save(quentinha);
    }

    @DeleteMapping
    public void excluir(@RequestBody Quentinha quentinha){
        repositorio.delete(quentinha);
    }
}
