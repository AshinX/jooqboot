package com.fengyue.jooqboot.Service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class JooqCURDTest {

    @Autowired
    private JooqCURD jooqCURD;

    @Test
    public void testslect(){
        jooqCURD.select();
    }



}