package io.fabric8.quickstarts.expenses

import io.fabric8.quickstarts.cxf.jaxrs.SampleRestApplication
import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.apache.commons.logging.LogFactory
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month

/**
 * Test RESTful services
 *
 *
 */
@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(SampleRestApplication::class))
class SpringRestTest {

    private val logger = LogFactory.getLog(SpringRestTest::class.java)


    @Value("\${cxf.path}")
    private lateinit var cxfPathProperty: String


    @Test
    fun createExpensesTest() {
        logger.info("*** rest path settings: ${cxfPathProperty}")
        val expenseService = JAXRSClient.getExpenecesService(cxfPathProperty)

        expenseService.create(Expense(amount = 30,
                createdAT = LocalDateTime.of(2019, Month.SEPTEMBER, 29, 12, 17, 0),
                description = "Schloss Schoenbrunn entry fee"))
//        Assert.assertEquals("Bar", simpleComponent.foo())
        assertTrue(false)
    }
}





