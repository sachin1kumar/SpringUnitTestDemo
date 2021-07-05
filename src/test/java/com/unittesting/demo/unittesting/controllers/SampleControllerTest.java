package com.unittesting.demo.unittesting.controllers;

import org.junit.Assert;
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

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnSampleDataString() throws Exception {
        //make the request using mockmvc.
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/getSampleData")
                .accept(MediaType.APPLICATION_JSON);
        //Get the result back..
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        //assert
        Assert.assertEquals("Sample Data", result.getResponse().getContentAsString());
    }

}
