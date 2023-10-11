package com.oauth.resource.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(force = true)
public class Mapper {

    public static final ObjectMapper mapper = new ObjectMapper();


}
