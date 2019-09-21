package com.shtramak.msscbrewery.web.service;

import com.shtramak.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
