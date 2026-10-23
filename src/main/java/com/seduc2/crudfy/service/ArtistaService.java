package com.seduc2.crudfy.service;

import com.seduc2.crudfy.entity.Artista;
import com.seduc2.crudfy.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    public List<Artista> listarTodos() {
        return artistaRepository.findAll();
    }

    public Artista buscarPorId(int id) {
        Optional<Artista> artista = artistaRepository.findById(id);
        return artista.orElse(null);
    }

    public Artista salvar(Artista artista) {
        return artistaRepository.save(artista);
    }

    public void deletar(int id) {
        artistaRepository.deleteById(id);
    }
}
