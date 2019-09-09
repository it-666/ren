package io.renren.activiti.id;

import org.activiti.engine.impl.cfg.IdGenerator;

import java.util.UUID;

/**
 * @author     ：邬志斌（www.wzbjsz.cn)
 * @date       ：Created in 2019 06 15
 */
public class MyIdGenerator implements IdGenerator {
    @Override
    public String getNextId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}