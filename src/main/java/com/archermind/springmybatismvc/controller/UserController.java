package com.archermind.springmybatismvc.controller;

import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.archermind.springmybatismvc.service.UserService;
import com.archermind.springmybatismvc.vo.User;

/**https://www.cnblogs.com/zyw-205520/p/4771253.html*/

@RestController
@RequestMapping("/user")
public class UserController {
	
	public Log log = LogFactory.getLog(UserController.class);
	
	@Resource
	private UserService userService;

//	@RequestMapping("/showUser")
//	public String toIndex(HttpServletRequest request, Model model) {
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.getUserByNu(userId);
//		model.addAttribute("user", user);
//		return "showUser";
//	}
	
	/*@RequestMapping(value = "/showUser")
	public void downloadApkIpa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getRequestDispatcher("/WEB-INF/view/showUser.jsp").forward(request, response);
	}*/


	@RequestMapping(value = "/showUser", produces = "application/json;charset=UTF-8")
	public User showUser(@RequestBody User user) {
		log.info("[showUser] +");
		int userId = 1;
		User user1 = this.userService.getUserByNu(userId);
		log.info("[showUser] -");
		return user1;

	}

	@RequestMapping(value = "/login",produces = "application/json;charset=UTF-8")
	public String login(@RequestBody User user){
		

		return "{'result':'login success'}";
	}

}
