package io.fabric8.quickstarts.expenses

import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.commons.logging.LogFactory
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.springframework.boot.test.autoconfigure.json.JsonTest
import org.springframework.boot.test.json.JacksonTester
import java.time.LocalDate


/**
 * test object mapping
 *
 */
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
                createdAT = LocalDate.of(2019,10,1),
                description = "Schloss Schoenbrunn entry fee")

        logger.info("************ json: " + this.json.write(expense).toString())
        var objFromJSON= this.json.parse("{\"amount\":30,\"id\":null," +
        "\"description\":\"Schloss Schoenbrunn entry fee\",\"createdAT\":\"2019-10-01\",\"tstamp\":\"2019-10-01\"}").`object`

        assertEquals(expense.amount , objFromJSON.amount)
        assertEquals(expense.description , objFromJSON.description)
        assertEquals(expense.createdAT.toString(),objFromJSON.createdAT.toString())


    }
}