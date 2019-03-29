package com.hu.sysManagement.system.service.impl;import com.hu.sysManagement.common.domain.Tree;import com.hu.sysManagement.common.utils.BuildTree;import com.hu.sysManagement.system.dao.DeptDao;import com.hu.sysManagement.system.domain.Dept;import com.hu.sysManagement.system.service.DeptService;import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;@Servicepublic class DeptServiceImpl        implements DeptService {    @Autowired    private DeptDao deptMapper;    @Override    public Dept get(Long deptId) {        return this.deptMapper.get(deptId);    }    @Override    public List<Dept> list(Map<String, Object> map) {        return this.deptMapper.list(map);    }    @Override    public int count(Map<String, Object> map) {        return this.deptMapper.count(map);    }    @Override    public int save(Dept sysDept) {        return this.deptMapper.save(sysDept);    }    @Override    public int update(Dept sysDept) {        return this.deptMapper.updatePj(sysDept);    }    @Override    public int remove(Long deptId) {        return this.deptMapper.remove(deptId);    }    @Override    public int batchRemove(Long[] deptIds) {        return this.deptMapper.batchRemove(deptIds);    }    @Override    public Tree<Dept> getTree() {        List trees = new ArrayList();        List<Dept> sysDepts = this.deptMapper.list(new HashMap(16));        for (Dept sysDept : sysDepts) {            Tree tree = new Tree();            tree.setId(sysDept.getDeptId().toString());            tree.setParentId(sysDept.getParentId().toString());            tree.setText(sysDept.getName());            Map state = new HashMap(16);            state.put("opened", Boolean.valueOf(true));            tree.setState(state);            trees.add(tree);        }        Tree t = BuildTree.build(trees);        return t;    }    @Override    public boolean checkDeptHasUser(Long deptId) {        int result = this.deptMapper.getDeptUserNumber(deptId);        return result == 0;    }}