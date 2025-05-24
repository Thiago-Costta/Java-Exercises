package br.com.unifacef.apimovies.controller;

import br.com.unifacef.apimovies.model.Movies;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Movies")

public class MoviesController {

    List<Movies> movies = new ArrayList<>();

    @GetMapping
    public List<Movies> getMovies() {
        return this.movies;
    }

    @PostMapping
    public Movies addMovie(@RequestBody Movies movies) {
    this.movies.add(movies);
    return movies;
    }

    @DeleteMapping("/{id}")
    public String deleteMovies(@PathVariable Long id) {
    boolean achou = (this.movies.removeIf(movie -> movie.getId() == id));
    return achou ? "Filme deletado!" : "Filme não encontrado!";
    }

    @PutMapping("/{id}")
    public Movies updateMovies(@RequestBody Movies novo, @PathVariable Long id) {
        for(Movies obj : this.movies){
            if(obj.getId() == id){
                obj.setNome(novo.getNome());
                obj.setGenero(novo.getGenero());
                obj.setDirecao(novo.getDirecao());
                obj.setNota(novo.getNota());
                return obj;
            }

        }
        return null;
    }

}
