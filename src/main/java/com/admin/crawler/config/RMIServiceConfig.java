package com.admin.crawler.config;

import com.admin.crawler.service.XXRMIService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Component;

@Configurable
@Component
public class RMIServiceConfig {


    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://127.0.0.1:9999/helloRMI");
        factoryBean.setServiceInterface(XXRMIService.class);
        return factoryBean;
    }

}
