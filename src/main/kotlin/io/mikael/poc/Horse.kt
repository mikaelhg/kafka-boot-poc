package io.mikael.poc

import org.springframework.data.annotation.Id

data class Horse(@Id var id: Long, var name: String)
