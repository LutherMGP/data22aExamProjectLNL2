package com.example.data22aexamprojectlnl2.services.Impl;

import com.example.data22aexamprojectlnl2.models.Service;
import com.example.data22aexamprojectlnl2.repositories.ServiceRepository;
import com.example.data22aexamprojectlnl2.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public Service saveYdelse(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public Optional<Service> getYdelseById(int id) {
        return serviceRepository.findById(id);
    }

    @Override
    public List<Service> getAllYdelser() {
        return serviceRepository.findAll();
    }

    @Override
    public void deleteYdelse(int id) {
        serviceRepository.deleteById(id);
    }
}

