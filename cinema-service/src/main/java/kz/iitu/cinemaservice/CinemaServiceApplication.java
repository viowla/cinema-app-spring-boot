package kz.iitu.cinemaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CinemaServiceApplication {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setConnectionRequestTimeout(3000);
        return new RestTemplate(requestFactory);
    }

    public static void main(String[] args) {
        SpringApplication.run(CinemaServiceApplication.class, args);
    }

}
