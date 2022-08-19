/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epst.epst;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

/**
 *
 * @author Pierre
 */
@Service
@Path("test")
@Produces("text/plain")
public class TestController {
    
    @GET
    public String getTest(){
        return "Dieu est grand";
    }
}
