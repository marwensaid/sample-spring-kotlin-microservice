package pl.piomin.services.repository

import net.datafaker.Faker
import org.springframework.stereotype.Repository
import java.util.*
import javax.annotation.PostConstruct


@Repository
class PersonRepository {
//    val persons = mutableListOf<Person>()

    @PostConstruct
    fun init() {
        val faker = Faker()
        for (i in 0..999) {
            val name = faker.name().fullName()
            val gender = faker.gender().binaryTypes().uppercase(Locale.ENGLISH)
            val age = faker.number().numberBetween(18, 85)
//            persons.add(Person(i + 1, name, age, Gender.valueOf(gender)))
        }
    }

    // TODO all function to findById, findByAge, findAll, save, update and removeById


}
