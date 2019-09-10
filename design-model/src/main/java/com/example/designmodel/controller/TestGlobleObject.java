package com.example.designmodel.controller;

import com.example.designmodel.single.SingleObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author peter
 * @version 1.1
 * @date 2019/9/10 15:32
 */

@Controller
public class TestGlobleObject {

    @RequestMapping("putmsg")
    @ResponseBody
    public void putMsg(HttpServletRequest req){
        SingleObject.getInstance().do1(req.getParameter("name"));
    }

    @RequestMapping("getmsg")
    @ResponseBody
    public void getMsg(){
        SingleObject.getInstance().do2();
    }
}
