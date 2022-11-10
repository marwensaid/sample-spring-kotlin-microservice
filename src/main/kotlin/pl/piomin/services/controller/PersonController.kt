package pl.piomin.services.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.piomin.services.repository.PersonRepository

@RestController
@RequestMapping("/persons")
class PersonController(val repository: PersonRepository) {

    val log: Logger = LoggerFactory.getLogger(PersonController::class.java)


    // TODO find by id

    // TODO find by age

    // TODO find all

    // TODO method add person

    // TODO method update person

    // TODO methode delete person

}
