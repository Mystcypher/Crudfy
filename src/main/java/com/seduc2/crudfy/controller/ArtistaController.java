package com.seduc2.crudfy.controller;

import com.seduc2.crudfy.entity.Artista;
import com.seduc2.crudfy.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    // GET: http://localhost:8080/artistas
    @GetMapping
    public List<Artista> listar() {
        return artistaService.listarTodos();
    }

    // GET por ID: http://localhost:8080/artistas/1
    @GetMapping("/{id}")
    public Artista buscarPorId(@PathVariable int id) {
        return artistaService.buscarPorId(id);
    }

    // POST: http://localhost:8080/artistas (envia o JSON no corpo da requisição)
    @PostMapping
    public Artista criar(@RequestBody Artista artista) {
        return artistaService.salvar(artista);
    }

    // DELETE: http://localhost:8080/artistas/1
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id) {
        artistaService.deletar(id);
        return "Artista removido com sucesso!";
    }
}
