package io.fabric8.quickstarts.expences

import io.fabric8.quickstarts.expenses.Expense
import io.swagger.annotations.*
import org.springframework.stereotype.Service
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

//check swagger old annotation style
// /https://github.com/swagger-api/swagger-core/wiki/Annotations


/**
 * expenses rest services
 */
@Path("/expenses")
@Api(description = "the expenses API")
@Service
interface ExpensesService {

    @GET
    @Path("")
    @ApiOperation(value = "Get all expenses in system",
            response = Expense::class ,responseContainer = "list")
    @Produces(MediaType.APPLICATION_JSON)
    abstract  fun findAll(): List<Expense>

    @DELETE
    @Path("/{id}")
    @ApiOperation("Delete an expense")
    fun delete(@PathParam("id") @ApiParam("Expense id to delete")  id:Long)

    @POST
    @Path("/")
    @Consumes("application/json")
    @Produces("application/json")
    @ApiOperation(value = "Add a new expense")
    @ApiResponses(
            ApiResponse(code = 200, message = "successful operation",response = Long::class),
            ApiResponse(code = 405, message = "invalid input")
    )
    fun create(expense: Expense) :Long


    @PUT
    @Path("/")
    @ApiOperation(value = "update an existing expense",
            notes = "")
    @ApiResponses(
            ApiResponse(code = 200, message = "successful operation"),
            ApiResponse(code = 404, message = "Expense not found")
    )
    fun update(@PathParam("id") id:Long, expense: Expense):Response


    @GET
    @Path("/{id}")
    @ApiOperation(value = "fetch an expense by id",
            notes = "", response = Expense::class)
    @ApiResponses(
            ApiResponse(code = 400, message = "Invalid id supplied"),
            ApiResponse(code = 404, message = "Expense not found")
    )
    fun find(@PathParam("id") id:Long): Response
}

@Api("/expences")
class ExpensesServiceImpl : ExpensesService {

    @ApiOperation(value = "Create expense in system",
            notes = "")
    override fun create(expense: Expense): Long {
        TODO("not implemented")
    }



    override fun update(id: Long, expense: Expense):Response {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun find(id: Long):Response{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun findAll(): List<Expense> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @ApiOperation(value = "Delete expense by id ",
            notes = "")
    override fun delete(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}