package huk.springio.consumingrestfulwebservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@SpringBootApplication
public class ConsumingRestfulWebServiceApplication {

    @Autowired
    ObjectMapper objectMapper;

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestfulWebServiceApplication.class, args);
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        // {
        //  "type":"success",
        //  "value":{"id":1,"quote":"랜덤 문자열"}
        // } -> 이 형태의 응답을 받음.
        System.out.println(quote.toString());
    }

}
