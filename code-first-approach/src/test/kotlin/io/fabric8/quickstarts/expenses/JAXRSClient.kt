package io.fabric8.quickstarts.expenses

import io.fabric8.quickstarts.expences.ExpensesService
import org.apache.cxf.jaxrs.client.JAXRSClientFactory


/**
 *
 * client to call RESTful service
 *
 */
object JAXRSClient {


    /**
     * @return restful service stub
     */
    fun getExpenecesService(webAppPath:String):ExpensesService {
        val expencesService = JAXRSClientFactory.create(
                "http://localhost:8080"  + webAppPath,
                ExpensesService::class.java)

        return expencesService
    }

}