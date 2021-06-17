package com.jxd.service;

import com.jxd.model.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:24
 */
public interface IEmpService {
    List<Emp> getAllEmp(@Param("ename") String ename,
                        @Param("pageStart") int pageStart,
                        @Param("pageSize") int pageSize);
    /**
     * 获取员工条数
     * @param ename
     * @return
     */
    int getEmpCounts(@Param("ename") String ename);

    int addEmp(Emp emp);

    int delEmp(int empno);
    int delBatchEmp(int[] empnos);


    Emp getEmpByEmpno(int empno);

    int editEmp(Emp emp);
}
