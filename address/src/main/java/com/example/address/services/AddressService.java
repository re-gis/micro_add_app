package com.example.address.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.address.entities.Address;
import com.example.address.repositories.AddressRepo;
import com.example.address.responses.AddressResponse;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }

}
