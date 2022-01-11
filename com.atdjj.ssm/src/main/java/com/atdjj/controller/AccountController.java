package com.atdjj.controller;

import com.atdjj.domain.Account;
import com.atdjj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        return "保存成功";
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView View = new ModelAndView();
        List<Account> accountList = accountService.findAll();
        View.setViewName("accountList");
        View.addObject("accountList",accountList);
        return View;
    }

}
