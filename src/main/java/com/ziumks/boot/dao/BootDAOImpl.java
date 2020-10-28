package com.ziumks.boot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ziumks.boot.domain.Admin;
import com.ziumks.boot.mapper.BootMapper;

@Service
public class BootDAOImpl implements BootDAO {
	@Autowired
	private BootMapper mapper;
	@Override
	public List<Admin> adminList() {
		// TODO Auto-generated method stub
		return mapper.adminList();
	}

}
