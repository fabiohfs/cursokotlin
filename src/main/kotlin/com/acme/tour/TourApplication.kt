package com.acme.tour

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.concurrent.ConcurrentHashMap
import com.acme.tour.model.Promocao

@SpringBootApplication
class TourApplication{
	companion object{
		val initialPromocoes = arrayOf(
			Promocao(1, "Maravilhosa viagem a Cancun", "Cancun", true, 7, 4999.99),
			Promocao(2, "Viagem radical com Rapel e Escalada", "Nova Zelândia", false, 12, 12000.0),
			Promocao(3, "Viagem espiritual", "Tailândia", false, 17, 15000.0),
			Promocao(4, "Viagem em família", "Gramado", false, 5, 3500.33)
		)
	}
	@Bean
	fun promocoes() = ConcurrentHashMap<Long,Promocao>(initialPromocoes.associateBy(Promocao::id))
}

fun main(args: Array<String>) {
	runApplication<TourApplication>(*args)
}
