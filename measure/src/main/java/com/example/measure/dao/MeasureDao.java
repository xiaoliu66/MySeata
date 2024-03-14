package com.example.measure.dao;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.measure.model.Measure;
import org.springframework.stereotype.Repository;

@Repository
@DS("measure")
public interface MeasureDao extends BaseMapper<Measure> {

}
