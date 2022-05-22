package com.acme.films.repository

import com.acme.films.domain.Ator
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.MYSQL)
interface AtorRepository: CrudRepository<Ator,Short> {

}