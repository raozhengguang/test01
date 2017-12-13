package com.service.vanke003.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-13T01:51:37.548Z")

@RestSchema(schemaId = "vanke003")
@RequestMapping(path = "/vanke003", produces = MediaType.APPLICATION_JSON)
public class Vanke003Impl {

    @Autowired
    private Vanke003Delegate userVanke003Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userVanke003Delegate.helloworld(name);
    }

}
