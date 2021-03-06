/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.service.impl;

import com.mnzit.crm.dto.master.EnquiryStatusDTO;
import com.mnzit.crm.entity.master.EnquiryStatus;
import com.mnzit.crm.repository.EnquiryStatusRepository;
import com.mnzit.crm.service.EnquiryStatusService;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mnzit
 */
@Service
public class EnquiryStatusServiceImpl implements EnquiryStatusService {

    @Autowired
    private EnquiryStatusRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void save(EnquiryStatusDTO model) {
        EnquiryStatus enquiryStatus = mapper.map(model, EnquiryStatus.class);
        if (model.getId() > 0) {
            repository.update(enquiryStatus);
        } else {
            repository.insert(enquiryStatus);
        }
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public EnquiryStatus findById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<EnquiryStatus> findAll() {
        return repository.getAll();
    }
}
