package com.acme.films.rest

import com.acme.films.domain.Ator
import com.acme.films.repository.AtorRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import org.slf4j.LoggerFactory

@Controller("/")
class AtorController(
    private val atorRepository: AtorRepository
) {

    private val logger = LoggerFactory.getLogger(AtorController::class.java)

    @Get
    fun listarTodos(): MutableIterable<Ator> {
        logger.info("Listar todos os atores")
        return atorRepository.findAll()
    }

    @Post
    fun gravar(ator: Ator): Ator {
        logger.info("Gravar ator: $ator")
        return atorRepository.save(ator)
    }

    @Put
    fun atualizar(ator: Ator): Ator {
        logger.info("Atualizar ator: $ator")
        return atorRepository.update(ator)
    }

    @Delete("/{id}")
    fun excluir(id: Short){
        logger.info("Excluir Ator id $id")
        atorRepository.deleteById(id)
    }
}