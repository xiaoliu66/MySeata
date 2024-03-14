package com.example.contract.service.impl;

import com.example.contract.dao.ContractDao;
import com.example.contract.model.Contract;
import com.example.contract.service.IContractService;

import com.example.measure.feign.MeasureFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class ContractServiceImpl implements IContractService {

    @Autowired
    private ContractDao contractDao;

    @Autowired
    private MeasureFeign measureFeign;
    @Override
    // @GlobalTransactional(rollbackFor = Exception.class)
    @Transactional
    public void doSomethings() {
        // 合同更新数据 id=1 amount=100 ---> amount=99
        Contract contract = new Contract();
        contract.setId(1);
        contract.setAmount(new BigDecimal("99"));
        contractDao.updateById(contract);



        // measureFeign.update();
        // int a = 1/ 0;
    }
}
