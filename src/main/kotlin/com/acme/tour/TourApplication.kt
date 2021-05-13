package com.acme.tour

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.concurrent.ConcurrentHashMap
import com.acme.tour.model.Promocao

@SpringBootApplication
class TourApplication

fun main(args: Array<String>) {
	runApplication<TourApplication>(*args)
}
