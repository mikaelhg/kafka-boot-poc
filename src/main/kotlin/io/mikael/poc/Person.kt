package io.mikael.poc

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table

@Table(name = "people")
data class Person(
    @Id
    var id: Long?,
    @MappedCollection(idColumn = "person_id")
    var horses: Set<Horse>,
    var name: String,
    var email: String
)
