package com.kodframe.easyoracle.admin.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodframe.easyoracle.db.service.ArgumentVo;
import com.kodframe.easyoracle.db.service.ProcedureService;
import com.kodframe.easyoracle.db.service.ProcedureVo;
import com.kodframe.easyoracle.db.service.SourceVo;
import com.kodframe.easyoracle.db.service.TableService;
import com.kodframe.easyoracle.db.service.TableVo;;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ProcedureService procedureService;

	@Autowired
	private TableService tableService;

	//테이블
	@RequestMapping("/db/list.do")
	public String dbList() throws Exception{
		return "admin/db/list";
	}
	
	//프로시저
	@RequestMapping("/db/list2.do")
	public String dbList2() throws Exception{
		return "admin/db/list2";
	}
	
	@RequestMapping("/db/selectAllProceduresList.do")
	@ResponseBody
	public Map<String , Object> selectAllProceduresList(@ModelAttribute ProcedureVo param) throws Exception {
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		jsonObject.put("list", procedureService.selectAllProceduresList(param));

		return jsonObject;
	}
	
	@RequestMapping("/db/selectAllTablesList.do")
	@ResponseBody
	public Map<String , Object> selectTableList(@ModelAttribute TableVo param) throws Exception {
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		jsonObject.put("list", tableService.selectAllTablesList(param));

		return jsonObject;
	}
	
	@RequestMapping("/db/selectTableDesc.do")
	@ResponseBody
	public Map<String , Object> selectTableDesc(@ModelAttribute TableVo param) throws Exception {
		Map<String, Object> jsonObject = new HashMap<String, Object>();

		jsonObject.put("list", tableService.selectTableDesc(param));

		return jsonObject;
	}	
	
	@RequestMapping("/db/selectAllOwner.do")
	@ResponseBody
	public Map<String , Object> selectAllOwner() throws Exception {
		Map<String, Object> jsonObject = new HashMap<String, Object>();

		jsonObject.put("list", tableService.selectAllOwner());

		return jsonObject;
	}	
	
	@RequestMapping("db/selectAllSourceList.do")
	@ResponseBody
	public Map<String, Object> selectAllSourceList(@ModelAttribute SourceVo param) throws Exception {
		Map<String, Object> jsonObject = new HashMap<String, Object>();

		System.out.println("== selectAllSourceList==");
		System.out.println("owner : "+param.getOwner());
		System.out.println("name : "+param.getName());
		System.out.println("type : "+param.getText());	
		
		jsonObject.put("list", procedureService.selectAllSourceList(param));

		return jsonObject;
	}

	@RequestMapping("db/selectArgumentList.do")
	@ResponseBody
	public Map<String, Object> selectArgumentList(@ModelAttribute ArgumentVo param) throws Exception {
		Map<String, Object> jsonObject = new HashMap<String, Object>();

		System.out.println("== selectArgumentList==");
		System.out.println("packageName : "+param.getPackageName());
		System.out.println("objectName : "+param.getObjectName());
		
		jsonObject.put("list", procedureService.selectArgumentList(param));

		return jsonObject;
	}
	
}
