package com.acme.tour.controller

import com.acme.tour.model.Promocao
import com.acme.tour.service.PromocaoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap

@RestController
@RequestMapping(value = ["/promocoes"])
class PromocaoController {

    @Autowired
    lateinit var promocaoService: PromocaoService

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = promocaoService.getById(id)

    @PostMapping()
    fun create(@RequestBody promocao: Promocao){
        promocaoService.create(promocao)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long){
        promocaoService.delete(id)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody promocao: Promocao){
        promocaoService.update(id, promocao)
    }

    @GetMapping()
    fun getAll(@RequestParam(required = false, defaultValue = "") localFilter: String) =
        promocaoService.searchByLocal(localFilter)

}