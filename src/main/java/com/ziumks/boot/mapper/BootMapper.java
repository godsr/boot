package com.ziumks.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ziumks.boot.domain.Admin;
@Mapper
public interface BootMapper {
	public List<Admin>adminList();
}
