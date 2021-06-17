package com.jxd.service.impl;

import com.jxd.dao.IEmpDao;
import com.jxd.model.Emp;
import com.jxd.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:26
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpDao empDao;
    @Override
    public List<Emp> getAllEmp(String ename, int pageStart, int pageSize) {
        return empDao.getAllEmp(ename,pageStart,pageSize);
    }

    /**
     * 获取员工条数
     *
     * @param ename
     * @return
     */
    @Override
    public int getEmpCounts(String ename) {
        return empDao.getEmpCounts(ename);
    }

    @Override
    public int addEmp(Emp emp) {
        return empDao.addEmp(emp);
    }

    @Override
    public int delEmp(int empno) {
        return empDao.delEmp(empno);
    }

    @Override
    public int delBatchEmp(int[] empnos) {
        return empDao.delBatchEmp(empnos);
    }

    @Override
    public Emp getEmpByEmpno(int empno) {
        return empDao.getEmpByEmpno(empno);
    }

    @Override
    public int editEmp(Emp emp) {
        return empDao.editEmp(emp);
    }
}
