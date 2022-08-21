package com.code.devmode.requestprocess;

import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class RestApi {

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public JSONObject uploadFile() {
        JSONObject response = new JSONObject();

        try {
            response.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

}
