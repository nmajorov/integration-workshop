package io.fabric8.quickstarts.expences

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.stereotype.Service
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

//check swagger old annotation style
// /https://github.com/swagger-api/swagger-core/wiki/Annotations


/**
 * expenses rest services
 */
@Path("/")
@Service
interface ExpensesService {

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    abstract  fun findall(): List<Expence>

    @DELETE
    @Path("/{id}")
    fun delete(@PathParam("id") id:Long)

    @POST
    @Path("/{id}")
    fun update(@PathParam("id") id:Long)

    @GET
    @Path("/{id}")
    fun findOne(@PathParam("id") id:Long)
}

@Api("/expences")
class ExpensesServiceImpl : ExpensesService {

    @ApiOperation(value = "update expense in system by given id",
            notes = "")
    override fun update(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @ApiOperation(value = "Get one expense in system by given id",
            notes = "")
    override fun findOne(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @ApiOperation(value = "Get all expenses in system",
            notes = "")
    override fun findall(): List<Expence> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @ApiOperation(value = "Delete expense by id ",
            notes = "")
    override fun delete(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}