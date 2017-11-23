package com.service.aaatesttttt.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-23T02:10:07.353Z")

@RestSchema(schemaId = "test01")
@RequestMapping(path = "/aaatesttttt", produces = MediaType.APPLICATION_JSON)
public class Test01Impl {

    @Autowired
    private Test01Delegate userTest01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest01Delegate.helloworld(name);
    }

}
