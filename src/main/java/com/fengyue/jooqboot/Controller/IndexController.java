package com.fengyue.jooqboot.Controller;

import com.fengyue.jooqboot.Service.JooqCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengyue
 * @date 2019-12-05  下午5:43
 */
@RequestMapping("/")
@RestController
public class IndexController {

    @Autowired
    private JooqCURD jooqCURD;

    @GetMapping("/select")
    public  int select(){
      return   jooqCURD.select();
    }
}
