package com.acme.films.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty
import java.time.LocalDateTime

@Introspected
@MappedEntity(value = "actor")
data class Ator(

    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    @MappedProperty(value = "actor_id")
    val id: Short? = null,

    @MappedProperty(value = "first_name")
    var nome: String,

    @MappedProperty(value = "last_name")
    var sobrenome: String,

    @MappedProperty(value = "age")
    var idade: Short,

    @MappedProperty(value = "last_update")
    val ultimaAtt: LocalDateTime? = null
)


