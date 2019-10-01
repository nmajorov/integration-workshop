package io.fabric8.quickstarts.expenses

import java.math.BigDecimal
import java.time.LocalDateTime


//https://spring.io/guides/tutorials/spring-boot-kotlin/

class User(
        var login: String,
        var firstname: String,
        var lastname: String,
        var id: Long? = null
)


class Expense (

		var id: Long? = null,
        var description: String,
        var createdAT: LocalDateTime,
        var amount: Long,
       // @ManyToOne var author: User,
        var version: LocalDateTime = LocalDateTime.now()
)
        //@Id @GeneratedValue var id: Long? = null)