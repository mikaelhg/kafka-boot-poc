package io.mikael.poc

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "horses")
data class Horse(@Id var id: Long?, var name: String, var stall: Long?)
