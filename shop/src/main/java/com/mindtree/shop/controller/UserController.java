/*
 * package com.mindtree.shop.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import com.mindtree.shop.service.UserService;
 * 
 * @Controller public class UserController {
 * 
 * @Autowired UserService userservice;
 * 
 * @RequestMapping("/login") public String LoginPage() { return "Login"; }
 * 
 * @PostMapping("/login") public String add(@RequestParam String
 * registerId,@RequestParam String Password) {
 * 
 * String message=userservice.getUserDetails(registerId, Password);
 * if(message.equals("success")) { return ""; } else return "Login"; } }
 */