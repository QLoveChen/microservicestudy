package com.oneday.study.microservicestudyhystrix8001.controller;

import com.oneday.study.microservicestudyapi.entities.DeptEntity;
import com.oneday.study.microservicestudyhystrix8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:07
 * @description
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody DeptEntity deptEntity) {
        return   deptService.addDept(deptEntity);
    }

//    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
//    public DeptEntity findById(Long deptNo) {
//        return  deptService.findById(deptNo);
//    }

    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List<DeptEntity> findAll() {
        return deptService.findAll();
    }

    /**
     * 增加自己服务描述的接口
     * @return
     */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有多少个微服务"+list.size());

        //查询STUDY-SPRINGCLOUD-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICESTUDY-DEPT");

        //打印STUDY-SPRINGCLOUD-DEPT服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }

    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public DeptEntity findById(Long deptNo) {
        DeptEntity deptEntity = deptService.findById(deptNo);
        if(null ==deptEntity){
            throw  new RuntimeException("该deptNo没有对应的信息"+deptNo);
        }
        return  deptEntity;
    }

    public DeptEntity processHystrixGet(Long deptNo){
        return  new DeptEntity().setDeptNo(deptNo)
                .setDeptName("该deptNo没有对应的信息")
                .setDbSource("没有这个数据库");
    }


}