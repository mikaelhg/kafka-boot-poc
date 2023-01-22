package io.mikael.poc

import org.springframework.data.annotation.Id

data class Person(
    @Id var id: Long,
    var horses: Set<Horse>,
    var name: String,
    var email: String
)
