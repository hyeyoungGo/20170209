package com.bit2017.emailList.dao.Test;

import com.bit2017.emailList.dao.EmailListDao;
import com.bit2017.emailList.vo.EmailListVo;

public class EmailListDaoTest {
	
	public static void main(String[] args) {
		insertTest();
	}
	
	public static void insertTest() {
		//mock data 가짜 데이터
		EmailListVo vo = new EmailListVo();
		vo.setFirstName("밥");
		vo.setLastName("미니언즈");
		vo.setEmail("bob@minions.com");
		
		
		EmailListDao dao = new EmailListDao();
		dao.insert(vo);
	}

}
