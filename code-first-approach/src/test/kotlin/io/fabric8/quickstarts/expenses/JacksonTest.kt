package io.fabric8.quickstarts.expenses

import org.apache.commons.logging.LogFactory
import org.junit.runner.RunWith
import org.springframework.boot.test.json.JacksonTester
import org.springframework.boot.test.autoconfigure.json.JsonTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired
import org.junit.Test
import org.junit.Assert.*
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.Before
import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month


@JsonTest
class JacksonTest {

    private val logger = LogFactory.getLog(SpringRestTest::class.java)


    lateinit  var json: JacksonTester<Expense>


    @Before
    fun setup() {
        val objectMapper = ObjectMapper()
        JacksonTester.initFields(this, objectMapper)
    }

    @Test
    @Throws(Exception::class)
    fun testSerialize() {
         var expense = Expense()

        logger.info("************ json: " + this.json.write(expense).toString())


        expense= Expense(amount = 30,
                createdAT = LocalDate.now(),
                description = "Schloss Schoenbrunn entry fee")

        logger.info("************ json: " + this.json.write(expense).toString())
        var objFromJSON= this.json.parse("{\"amount\":30,\"id\":null," +
        "\"description\":\"Schloss Schoenbrunn entry fee\",\"createdAT\":\"2019-10-01\",\"tstamp\":\"2019-10-01\"}").`object`

        assertEquals(expense.amount , objFromJSON.amount)
        assertEquals(expense.description , objFromJSON.description)
        assertEquals(expense.createdAT.toString(),objFromJSON.createdAT.toString())

        //TODO  real tests

        // Assert against a `.json` file in the same package as the test
       // assertThat(this.json.write(details)).isEqualToJson("expected.json")
        // Or use JSON path based assertions
       // assertThat(this.json.write(details)).hasJsonPathStringValue("@.make")
       // assertThat(this.json.write(details)).extractingJsonPathStringValue("@.make")
        //        .isEqualTo("Honda")
    }
}