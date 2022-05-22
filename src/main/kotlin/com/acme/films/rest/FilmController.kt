package com.acme.films.rest

import com.acme.films.domain.Ator
import com.acme.films.domain.Film
import com.acme.films.repository.FilmRepository
import io.micronaut.data.repository.CrudRepository
import io.micronaut.http.annotation.*
import org.slf4j.LoggerFactory

@Controller("/filme")
class FilmController(
    private val filmRepository: FilmRepository
) {

    private val logger = LoggerFactory.getLogger(FilmController::class.java)

    @Get
    fun listarFilmes(): MutableIterable<Film> {
      logger.info("Listando todos os filmes")
      return filmRepository.findAll()
    }

    @Post
    fun gravarFilme(film: Film): Film {
        logger.info("Gravar filme: $film")
        return filmRepository.save(film)
    }

    @Put
    fun atualizarFilme(film: Film): Film {
        logger.info("Atualizar filme: $film")
        return filmRepository.update(film)
    }

    @Delete("/{id}")
    fun excluirFilme(id: Short){
        logger.info("Excluir filme id $id")
    }
}