package com.oneday.study.microservicestudyfeign.controller;

import com.oneday.study.microservicestudyapi.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:48
 * @description
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService deptClientService;
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( com.oneday.study.microservicestudyapi.entities.DeptEntity deptEntity){
        //三个参数：url,requestMap ResponseBean.class
        return  deptClientService.add(deptEntity);
    }
    @RequestMapping("/consumer/dept/findById/{deptNo}")
    public com.oneday.study.microservicestudyapi.entities.DeptEntity findById(Long deptNo){
        //三个参数：url,requestMap ResponseBean.class
        return deptClientService.findById(deptNo);
    }
    @RequestMapping("/consumer/dept/findAll")
    public List findAll(){
        //三个参数：url,requestMap ResponseBean.class
        return  deptClientService.findAll();
    }
}