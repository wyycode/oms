package com.hu.sysManagement.system.service;import com.hu.sysManagement.common.domain.Tree;import com.hu.sysManagement.system.domain.Menu;import java.util.List;import java.util.Map;import java.util.Set;import org.springframework.stereotype.Service;@Servicepublic interface MenuService {    Tree<Menu> getSysMenuTree(Long paramLong);    List<Tree<Menu>> listMenuTree(Long paramLong1, Long paramLong2);    List<Menu> getSubs(Long paramLong);    Tree<Menu> getTree();    Tree<Menu> getTree(Long paramLong, boolean paramBoolean);    List<Menu> list(Map<String, Object> paramMap);    int remove(Long paramLong);    int save(Menu paramMenu);    int update(Menu paramMenu);    Menu get(Long paramLong);    Set<String> listPerms(Long paramLong);}