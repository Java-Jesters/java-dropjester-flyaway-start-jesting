package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.exceptions.DoesNotExistException;
import org.example.services.DeliveryEmployeeService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Delivery Employee API")
@Path("/api/deliveryEmployee")
public class DeliveryEmployeeController {
    DeliveryEmployeeService deliveryEmployeeService;

    public DeliveryEmployeeController(
            final DeliveryEmployeeService deliveryEmployeeService
    ) {
        this.deliveryEmployeeService = deliveryEmployeeService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeliveryEmployees() {
        try {
            return Response.ok().entity(
                            deliveryEmployeeService
                                    .getDeliveryEmployees())
                    .build();
        } catch (SQLException e) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeliveryEmployeeById(@PathParam("id") final int id) {
        try {
            return Response.ok().entity(
                    deliveryEmployeeService
                            .getDeliveryEmployeeById(id))
                    .build();
        } catch (DoesNotExistException e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(e.getMessage()).build();
        } catch (SQLException e) {
            return Response.serverError().build();
        }
    }
}
