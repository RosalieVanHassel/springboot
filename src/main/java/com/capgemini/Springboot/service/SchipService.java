package com.capgemini.Springboot.service;

import com.capgemini.Springboot.repository.SchipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SchipService {
    @Autowired
    private SchipRepository schipRepository;
}
