package com.foxconn.springmybatismvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foxconn.springmybatismvc.service.UserService;
import com.foxconn.springmybatismvc.vo.User;

/**https://www.cnblogs.com/zyw-205520/p/4771253.html*/

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

//	@RequestMapping("/showUser")
//	public String toIndex(HttpServletRequest request, Model model) {
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.getUserByNu(userId);
//		model.addAttribute("user", user);
//		return "showUser";
//	}
	
	@RequestMapping(value = "/showUser")
	public void downloadApkIpa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getRequestDispatcher("/WEB-INF/view/showUser.jsp").forward(request, response);
	}

	@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
	public User toIndex(@RequestBody User user) {
		int userId = 1;
		User user1 = this.userService.getUserByNu(userId);
		return user1;
	}

}
