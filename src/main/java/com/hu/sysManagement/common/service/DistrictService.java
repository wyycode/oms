package com.hu.sysManagement.common.service;import com.hu.sysManagement.common.domain.District;import com.hu.sysManagement.system.domain.User;import java.util.List;import java.util.Map;public interface DistrictService {    List<Map<String, Object>> list(Map<String, Object> paramMap);    int count(Map<String, Object> paramMap);    int save(District paramDistrict);    int update(District paramDistrict);    int remove(Long paramLong);    List<User> principalList();    List<District> DistrictList(Map<String, Object> paramMap);}