package io.mikael.poc

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Testcontainers
class ApplicationTests {

	companion object {
		@Container
		val pg = PostgreSQLContainer<Nothing>("postgres:15-alpine")

		@DynamicPropertySource
		@JvmStatic
		fun pgProperties(registry: DynamicPropertyRegistry) {
			registry.add("spring.datasource.url") { pg.jdbcUrl }
			registry.add("spring.datasource.username") { pg.username }
			registry.add("spring.datasource.password") { pg.password }
		}
	}

	@Test
	fun contextLoads() {
	}

}
