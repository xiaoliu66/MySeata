package com.example.contract.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.contract.model.Contract;
import org.springframework.stereotype.Repository;

@Repository
@DS("contract")
public interface ContractDao extends BaseMapper<Contract> {

}
