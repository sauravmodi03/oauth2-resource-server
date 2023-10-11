package com.oauth.resource.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(force = true)
public class Mapper {

    private static Gson gson = new Gson();

    public static String getJSON(Object o) {
        return gson.toJson(o);
    }

}
