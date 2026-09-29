package com.security.practices.services;

import com.security.practices.entities.RegFormEntity;
import com.security.practices.repository.RegFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegFormService {

    @Autowired
    private RegFormRepository regFormRepository;

    public boolean addRegoForm(RegFormEntity regFormEntity) {
        try {
            this.regFormRepository.save(regFormEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
