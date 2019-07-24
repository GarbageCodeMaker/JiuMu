package com.jiumu.service.impl;

import com.jiumu.service.IndexService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
        isolation = Isolation.REPEATABLE_READ,
        propagation = Propagation.REQUIRED,
        readOnly = false,
        rollbackFor = Exception.class
)
public class IndexServiceImpl implements IndexService {

}
