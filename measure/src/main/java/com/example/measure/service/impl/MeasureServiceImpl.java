package com.example.measure.service.impl;



import com.example.measure.dao.MeasureDao;
import com.example.measure.model.Measure;
import com.example.measure.service.IMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class MeasureServiceImpl implements IMeasureService {

    @Autowired
    private MeasureDao measureDao;
    @Override
    // @GlobalTransactional(rollbackFor = Exception.class)
    @Transactional
    public void doSomethings() {

        // 计量更新数据 id=1 amount=100 ---> amount=101
        Measure measure = new Measure();
        measure.setId(1);
        measure.setAmount(new BigDecimal("101"));
        measureDao.updateById(measure);
        int a = 1/ 0;
    }
}
