package com.acme.tour.controller

import com.acme.tour.model.Promocao
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class PromocaoController {
    @RequestMapping(value=["/sayHello"], method = arrayOf(RequestMethod.GET))
    fun sayHello(): String {
        return "Hello World"
    }

    @RequestMapping(value=["/promocoes"], method = arrayOf(RequestMethod.GET))
    fun getPromocao(): Promocao{
        val promocao = Promocao(1, "Maravilhosa viagem a Cancun", "Cancun",true, 7, 4200.99)
        return promocao
    }
}