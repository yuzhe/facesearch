package net.ssln.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.ssln.dao.CollectUrlDao;
import net.ssln.model.CollectUrl;
import net.ssln.service.CollectUrlService;
import net.ssln.util.JsoupUtil;
import net.ssln.util.UUIDTool;
@Controller
public class MainCotroller {
	
	@Autowired
	public CollectUrlService cuService;
	JsoupUtil jutil=new JsoupUtil();
	@RequestMapping("test")
	@ResponseBody
	String home(HttpServletRequest request) {
		request.setAttribute("key", "hello world");  
	    CollectUrl cu=new CollectUrl();
	    List<Map<String,String>> list= jutil.getListLink("http://www.365j.com/star/list--1--1.html");
	    for(Map<String,String> map :list){
        cu.setId(UUIDTool.getUUID());
        cu.setCollectDomain("www.365j.com");
        cu.setDetailUrl(map.get("url"));
        cu.setName(map.get("name"));
        cu.setState(0);
        cu.setType(1);
        cu.setUpdateTime(new Date());
	    cuService.add(cu);
	    }
		return "index";
	}

}
