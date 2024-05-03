package com.example.address.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.address.entities.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(nativeQuery = true, value = "SELECT ea.id, ea.city, ea.state FROM micro.address ea join micro.employee e on e.id = ea.employee_id where ea.employee_id=:employeeId")
    Optional<Address> findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
