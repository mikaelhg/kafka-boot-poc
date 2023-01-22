package io.mikael.poc

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HorseRepository : CrudRepository<Horse, Long>
