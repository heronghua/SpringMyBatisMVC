package com.archermind.springmybatismvc.controller;

import com.archermind.springmybatismvc.service.VersionService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**https://www.cnblogs.com/zyw-205520/p/4771253.html*/

@RestController
@RequestMapping("/version")
public class VersionController {
	
	public Log log = LogFactory.getLog(VersionController.class);
	
	@Resource
	private VersionService versionService;

//	@RequestMapping("/showUser")
//	public String toIndex(HttpServletRequest request, Model model) {
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.getUserByNu(userId);
//		model.addAttribute("user", user);
//		return "showUser";
//	}
	
	@RequestMapping(value = "/downloadApkIpa")
	public void downloadApkIpa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.debug("[downloadApkIpa] +");
		String type = request.getParameter("type");
		if ("android".equals(type)){
			String version = versionService.getVersionByType(type).getVersion();
			String redirect = "/SpringMybatisMVC/apks/"+ "XXX_" + version +".apk";
			response.sendRedirect(redirect);
		}else {

		}
		log.debug("[downloadApkIpa] -");

	}



}
