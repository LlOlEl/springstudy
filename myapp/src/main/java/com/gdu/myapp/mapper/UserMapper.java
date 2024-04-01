package com.gdu.myapp.mapper;

import java.util.Map;

import com.gdu.myapp.dto.AccessHistoryDto;
import com.gdu.myapp.dto.LeaveUserDto;
import com.gdu.myapp.dto.UserDto;

public interface UserMapper {
  UserDto getUserByMap(Map<String, Object> map);
  int insertAccessHistory(Map<String, Object> map); // 반환한게 있어서 int?
  LeaveUserDto getLeaveUserByMap(Map<String, Object> map);
  int insertUser(UserDto user); //userMapper.xml 과 한몸으로 인식  
}




