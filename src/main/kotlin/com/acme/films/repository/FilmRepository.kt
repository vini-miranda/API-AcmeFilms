package com.acme.films.repository

import com.acme.films.domain.Film
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.MYSQL)
interface FilmRepository: CrudRepository<Film,Short> {
}