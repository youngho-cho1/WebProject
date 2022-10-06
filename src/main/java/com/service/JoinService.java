package com.service;

import com.mapper.Join;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
//@Transactional(readOnly = true)
public class JoinService {
    private final Join join;

    public void insert(){
        join.insert();
    }
}
