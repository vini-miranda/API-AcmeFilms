package com.acme.films.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty
import java.time.LocalDateTime

@Introspected
@MappedEntity(value = "film")
data class Film(

    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    @MappedProperty(value = "film_id")
    val id: Short? = null,

    @MappedProperty(value = "title")
    var titulo: String,

    @MappedProperty(value = "language_id")
    var linguagemId: Short,

    @MappedProperty(value = "rental_duration")
    var duracaoAluguel: Short?,

    @MappedProperty(value = "rental_rate")
    var precoAluguel: Double? = null,

    @MappedProperty(value = "replacement_cost")
    var custoReposicao: Double?,

    @MappedProperty(value = "last_update")
    val ultimaAtt: LocalDateTime? = null


)
