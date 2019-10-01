package io.fabric8.quickstarts.expenses

import java.time.LocalDateTime
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnoreProperties


//https://spring.io/guides/tutorials/spring-boot-kotlin/

class User(
        var login: String,
        var firstname: String,
        var lastname: String,
        var id: Long? = null
)

@JsonIgnoreProperties(ignoreUnknown = true)
class Expense (
		@JsonProperty("id")
		var id: Long? = null,
		@JsonProperty("description")
        var description: String,
		@JsonProperty("createdAT")
        var createdAT: LocalDateTime,
		@JsonProperty("amount")
        var amount: Long,
       // @ManyToOne var author: User,
		@JsonProperty("tstamp")
        var tstamp: LocalDateTime = LocalDateTime.now()
)
        //@Id @GeneratedValue var id: Long? = null)