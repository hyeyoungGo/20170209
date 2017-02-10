package com.bit2017.email.dao.Test;

import com.bit2017.email.dao.EmailDao;
import com.bit2017.email.vo.EmailVo;

public class EmailDaoTest {
	
	public static void main(String[] args) {
		
		insertTest();
		
	}

	private static void insertTest() {
		EmailVo emailVo = new EmailVo();
		emailVo.setFristName("고");
		emailVo.setLastName("혜영");
		emailVo.setEmail("yuki_o0oa@naver.com");		
		
		EmailDao emailDao = new EmailDao();
		emailDao.insert(emailVo);
	}

}
