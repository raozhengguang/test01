package com.service.vanke003.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestVanke003 {

        Vanke003Delegate vanke003Delegate = new Vanke003Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = vanke003Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}