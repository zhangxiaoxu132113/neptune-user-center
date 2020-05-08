//package com.water.neptune.usercenter.core;
//
//import com.alibaba.csp.sentinel.datasource.Converter;
//import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
//import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
//import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
//import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.TypeReference;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * @author : zhangmiaojie
// * @date : 2020/5/7 15:05
// */
//@Slf4j
//@Component
//public class ApplicationRunnerImpl
//        implements ApplicationRunner {
//
//    private String remoteAddress = "localhost:8848";
//    private String groupId = "SENTINEL_GROUP";
//    private String dataId = "neptune-user-center-sentinel";
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        log.info("sentinel register nacos datasource...");
//        Converter<String, List<FlowRule>> parser = source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
//        });
//        ReadableDataSource<String, List<FlowRule>> nacosDataSource = new NacosDataSource<>(remoteAddress, groupId, dataId, parser);
//        FlowRuleManager.register2Property(nacosDataSource.getProperty());
//    }
//}
