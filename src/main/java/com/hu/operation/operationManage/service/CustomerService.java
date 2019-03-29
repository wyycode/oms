package com.hu.operation.operationManage.service;import com.hu.operation.operationManage.domain.Customer;import com.hu.operation.operationManage.domain.CustomerSys;import com.hu.sysManagement.common.domain.Dict;import java.util.List;import java.util.Map;public interface CustomerService {    List<Customer> AllCustomers();    List<Map<String, Object>> list(Map<String, Object> paramMap);    int count(Map<String, Object> paramMap);    int save(Customer paramCustomer);    int updateC(Customer paramCustomer);    int delete(Integer paramInteger);    int find(Integer paramInteger);    List<Dict> stateList();    List<Dict> propertyList();    List<CustomerSys> customerSyslist();    int updateCS(CustomerSys paramCustomerSys);    int saveCS(CustomerSys paramCustomerSys);}