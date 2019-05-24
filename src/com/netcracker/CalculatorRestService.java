package com.netcracker;




import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/calc")
public class CalculatorRestService {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add/{a}/{b}")
    public String add(@PathParam("a") Double a, @PathParam("b") Double b){
        Result result = new Result();
        result.res=a+b;
        result.a = a;
        result.b = b;
        String str = a + "+" + b + "=" + result.res;
        return str;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sub/{a}/{b}")
    public String subtr(@PathParam("a") Double a, @PathParam("b") Double b){
        Result result = new Result();
        result.res=a-b;
        result.a = a;
        result.b = b;
        String str = a + "-" + b + "=" + result.res;
        return str;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/mult/{a}/{b}")
    public String multiply(@PathParam("a") Double a, @PathParam("b") Double b){
        Result result = new Result();
        result.res=a*b;
        result.a = a;
        result.b = b;
        String str = a + "*" + b + "=" + result.res;
        return str;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/div/{a}/{b}")
    public String divisiom(@PathParam("a") Double a, @PathParam("b") Double b){
        Result result = new Result();
        result.res=a/b;
        result.a = a;
        result.b = b;
        String str = a + "/" + b + "=" + result.res;
        return str;
    }



}
