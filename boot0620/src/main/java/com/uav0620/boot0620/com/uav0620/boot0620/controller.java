package com.uav0620.boot0620.com.uav0620.boot0620;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class controller {

    public static  int counttt=0;

    @GetMapping(value = {"/zadd"},produces="application/json;charset=UTF-8")
    public String add(String id,String pw,HttpServletRequest request) {

       // Map<Integer,String> as = new HashMap<>();
//        for (int i=0;i<2000;i++){
//           /* if (i==199997){
//                as.put(i,"");
//            }*/
//            as.put(i,"这里计数");
//            //as.put("as"+i,"woshide");
//            //as.put("bs"+i+i,"asjdklajsdl");
//        }
        String server0 =request.getParameter("");
        System.out.println(id+":::::"+pw);
       //System.out.println(pw);
        System.out.println(counttt);
        counttt++;
        //System.out.println(yyy);
        return null;

    }

    /*@GetMapping("/zadd")
    public String add(String id,String pw,HttpServletRequest request) {

        Map<String,String> as = new HashMap<>();
        for (int i=0;i<100;i++){
            as.put("as"+i,"我的天啊");
            //as.put("bs"+i+i,"asjdklajsdl");
        }
        String server0 =request.getParameter("id");
        System.out.println(id);
        System.out.println(pw);
        //System.out.println(yyy);
        return "as";

    }*/
}
