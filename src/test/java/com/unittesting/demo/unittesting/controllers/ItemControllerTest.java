package com.unittesting.demo.unittesting.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnJson() throws Exception {
        //make the request using mockmvc.
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);
        //Get the result back..
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().json("{\n" +
                        "id: 1,\n" +
                        "name: \"Testing\",\n" +
                        "price: 234.54\n" +
                        "}"))
                .andReturn();
        //assert
    }

    @Test
    public void shouldReturnBusinessServiceJson() throws Exception {
        //make the request using mockmvc.
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/dummy-item-from-service")
                .accept(MediaType.APPLICATION_JSON);
        //Get the result back..
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().json("{{\n" +
                        "id: 1,\n" +
                        "name: \"Testing\",\n" +
                        "price: 234.54\n" +
                        "}}"))
                .andReturn();
        //assert
    }
}
