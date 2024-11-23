package org.example;

import org.example.util.TestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TerstController {

    @ResponseBody
    @RequestMapping
    public Object index(){
        return TestUtil.test(1);
    }
}
