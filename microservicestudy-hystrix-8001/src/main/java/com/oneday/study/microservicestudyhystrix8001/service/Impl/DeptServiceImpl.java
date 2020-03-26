package com.oneday.study.microservicestudyhystrix8001.service.Impl;

import com.oneday.study.microservicestudyapi.entities.DeptEntity;
import com.oneday.study.microservicestudyhystrix8001.dao.DeptDao;
import com.oneday.study.microservicestudyhystrix8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:04
 * @description
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(DeptEntity deptEntity) {
      return   deptDao.addDept(deptEntity);
    }

    @Override
    public DeptEntity findById(Long deptNo) {
        return  deptDao.findById(deptNo);
    }

    @Override
    public List<DeptEntity> findAll() {
        return deptDao.findAll();
    }
}