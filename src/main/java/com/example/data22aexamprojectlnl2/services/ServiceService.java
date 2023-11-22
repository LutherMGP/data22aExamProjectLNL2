package com.example.data22aexamprojectlnl2.services;

import com.example.data22aexamprojectlnl2.models.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceService {
    Service saveYdelse(Service service);
    Optional<Service> getYdelseById(int id);
    List<Service> getAllYdelser();
    void deleteYdelse(int id);
}
