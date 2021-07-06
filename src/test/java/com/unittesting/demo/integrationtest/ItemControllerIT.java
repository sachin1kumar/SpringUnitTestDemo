package com.unittesting.demo.integrationtest;

import com.unittesting.demo.unittesting.UnitTestingApplication;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.boot.test.context.SpringBootTest.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = UnitTestingApplication.class)
public class ItemControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturnAllItemsFromDb() throws JSONException {
        String response =
                this.testRestTemplate.getForObject("/all-items-from-database", String.class);
        //JsonAssert manually here, not like controller test.
        JSONAssert.assertEquals("[{id: 100}, {id: 101}, {id: 102}, {id: 103}, {id: 104}]"
                , response, false);
    }
}
