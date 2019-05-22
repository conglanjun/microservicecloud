package com.clj.springcloud.controller;

import com.clj.springcloud.entities.Dept;
import com.clj.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") long id){
        Dept dept = this.service.get(id);
        if(dept == null){
            throw new RuntimeException("该ID:" + id + " 没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") long id){
        return new Dept().setDeptno(id).setDname("该ID：" + id + " 没有对应的信息，null--@HystrixCommand").setDb_source("no this database in mysql");
    }

}
