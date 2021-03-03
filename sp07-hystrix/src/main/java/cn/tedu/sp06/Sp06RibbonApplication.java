package cn.tedu.sp06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class Sp06RibbonApplication {

    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate getRestTemplate(){
        SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory();
        f.setConnectTimeout(1000);
        f.setReadTimeout(1000);
        return new RestTemplate(f);
    }

    public static void main(String[] args) {
        SpringApplication.run(Sp06RibbonApplication.class, args);
    }

}
