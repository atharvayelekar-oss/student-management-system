package com.studentmanagement.sms.repository;

import com.studentmanagement.sms.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
