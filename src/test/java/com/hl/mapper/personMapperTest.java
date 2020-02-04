package com.hl.mapper;


import com.hl.mapper.Impl.personMapperImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class personMapperTest {


    @Autowired
    personMapperImpl pm;

    @Test
    public void selectByPrimaryKey() {
        System.out.println(pm);
    }
}