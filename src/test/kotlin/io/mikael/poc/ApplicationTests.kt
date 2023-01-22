package io.mikael.poc

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.KafkaContainer
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.utility.DockerImageName

@SpringBootTest
@Testcontainers
class ApplicationTests {

	companion object {

		@Container
		val pg = PostgreSQLContainer(DockerImageName.parse("postgres:15-alpine"))

		@Container
		val kafka = KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka"))

		@DynamicPropertySource
		@JvmStatic
		fun containerProperties(registry: DynamicPropertyRegistry) {
			registry.add("spring.datasource.url") { pg.jdbcUrl }
			registry.add("spring.datasource.username") { pg.username }
			registry.add("spring.datasource.password") { pg.password }
			registry.add("spring.kafka.bootstrap-servers") { kafka.bootstrapServers }
		}

	}

	@Test
	fun contextLoads() {
	}

}
