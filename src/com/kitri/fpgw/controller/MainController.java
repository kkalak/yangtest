package com.kitri.fpgw.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kitri.fpgw.model.CodeManageDto;
import com.kitri.fpgw.model.LogHistoryDto;
import com.kitri.fpgw.model.MenuDto;
import com.kitri.fpgw.model.UserDetaileDto;
import com.kitri.fpgw.model.UserDto;
import com.kitri.fpgw.model.UserImageDto;
import com.kitri.fpgw.model.UserMainDto;
import com.kitri.fpgw.service.MainService;

@Controller
@RequestMapping(value="/main")
public class MainController {

	@Autowired
	private MainService MainService;

	@RequestMapping(value="/index.html")
	public String Index(){
		
		return "index";
	}
	
	@RequestMapping(value="/default.html")
	public String Default(){
		
		return "jsp/main/default";
	}
	
	@RequestMapping(value="/login.html")
	public String Login(String id, String pwd, HttpSession session) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String ymd = sdf.format(date);
		
		UserMainDto userIn = new UserMainDto();
		userIn.setStrID(id);
		userIn.setStrPWD(pwd);
				
		UserMainDto userOut = MainService.LogIn(userIn);
		
		String strMovePage = "";

		if(userOut == null){
			
			session.setAttribute("success", "failed");
			strMovePage = "index";
		} else {
			
			/*�α��� ���*/			
			LogHistoryDto LogHistoryDto = new LogHistoryDto();
			LogHistoryDto.setStrLog_Ymd(ymd);
			LogHistoryDto.setStrUser_Cd(userOut.getStrCode());
			LogHistoryDto.setStrLog_Cd("001");
			MainService.LogCheck(LogHistoryDto);
			
			/*===== ���� ���� =====*/
			/*����� ����*/
			session.setAttribute("success", "ok");
			session.setAttribute("userInfo", userOut);
			
			UserDetaileDto userDetailInfo = MainService.UserDetailSelect(userOut.getStrCode());
			session.setAttribute("userDetailInfo", userDetailInfo);
			UserImageDto userImageInfo = MainService.UserImageSelect(userOut.getStrCode());
			session.setAttribute("userImageInfo", userImageInfo);
			
			/*��������*/
			ArrayList<CodeManageDto> BCode = MainService.CodeManageBCodeGroupSelectAll();
			session.setAttribute("BCode", BCode);
			
			int len = BCode.size();
			for(int i = 0; i < len; i++){
				
				CodeManageDto bcodeDto = BCode.get(i);
								
				ArrayList<CodeManageDto> SCode = MainService.CodeManageSelectBCode(bcodeDto.getStrBCode());
								
				session.setAttribute(bcodeDto.getStrValue4(), SCode);
			}
			
			
			
			//�޴�����
			ArrayList<MenuDto> listMenu = MainService.MenuSelectAll();
			session.setAttribute("menu", listMenu);
			
			
			strMovePage = "jsp/main/default";
		}
		
		return strMovePage;
	}
	
	@RequestMapping(value="logout.html")
	public String LogOut(HttpSession session) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String ymd = sdf.format(date);
		
		UserDto userIn = (UserDto) session.getAttribute("userInfo");
		
		/*�α׾ƿ� ���*/			
		LogHistoryDto LogHistoryDto = new LogHistoryDto();
		LogHistoryDto.setStrLog_Ymd(ymd);
		LogHistoryDto.setStrUser_Cd(userIn.getStrCode());
		LogHistoryDto.setStrLog_Cd("002");
		MainService.LogCheck(LogHistoryDto);
		
		//��������		
		ArrayList<CodeManageDto> BCode = (ArrayList<CodeManageDto>) session.getAttribute("BCode");
		session.removeAttribute("BCode");
		
		int len = BCode.size();
		
		for(int i = 0; i < len; i++){
			
			CodeManageDto bcodeDto = BCode.get(i);
			session.removeAttribute(bcodeDto.getStrValue4());
		}
		
		return "index";
	}
	
}
