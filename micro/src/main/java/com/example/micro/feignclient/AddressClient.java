package com.example.micro.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.micro.responses.AddressResponse;

@FeignClient(name = "address-service", url = "http://localhost:8081", path = "/")
public interface AddressClient {
    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id") int id);
}
