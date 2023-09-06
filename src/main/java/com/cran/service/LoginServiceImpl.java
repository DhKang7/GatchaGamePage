package com.cran.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cran.spring.dto.UserID;

import com.cran.mapper.LoginMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@AllArgsConstructor
public class LoginServiceImpl implements LoginService{

	@Setter(onMethod_ = @Autowired)
	private LoginMapper mapper;	
	
	
	@Override
	public void createID(UserID id) {
		mapper.createID(id);
	}	

}