package com.example.producer.service.impl;

import com.example.contract.feign.ContractFeign;
import com.example.measure.feign.MeasureFeign;
import com.example.producer.service.IService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServcieImpl implements IService {

    @Autowired
    private MeasureFeign measureFeign;

    @Autowired
    private ContractFeign contractFeign;

    @Override
    // @Transactional
    @GlobalTransactional(rollbackFor = Exception.class)
    public void update() {
        log.info("=====> 开始处理业务 <=======");
        contractFeign.update();
        // int a = 1/0;
        measureFeign.update();
    }
}
