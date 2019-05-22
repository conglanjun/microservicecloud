package com.clj.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: conglanjun
 * Date: 2019/4/4
 * Time: 19:24
 * Description:
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();// ribbon默认轮询，现在定义成随机
        return new RandomRule_ZY();
    }

}
