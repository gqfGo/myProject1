package com.jxd.controller;

import com.jxd.model.Emp;
import com.jxd.model.QueryInfo;
import com.jxd.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-11 20:19
 */
@RestController
public class EmpController {
    @Autowired
    private IEmpService empService;
    @RequestMapping("/getAllEmp")
    public Map<String, Object> getAllEmp(@RequestBody QueryInfo queryInfo){
        System.out.println(queryInfo);
        // 获取数据总数
        int counts = empService.getEmpCounts(queryInfo.getEname());
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<Emp> emps =
                empService.getAllEmp(queryInfo.getEname(),pageStart,queryInfo.getPageSize());
        Map<String, Object> map = new HashMap<>();
        map.put("counts",counts);
        map.put("emps",emps);
        System.out.println("总条数："+counts);
        return map;
    }

    @RequestMapping("/addEmp")
    public String addUser(@RequestBody Emp emp) {
        int i = empService.addEmp(emp);
        return i > 0 ? "success":"error";
    }

    @RequestMapping("/delEmp")
    public String delUser(int empno) {
        int i = empService.delEmp(empno);
        return i > 0 ? "success":"error";
    }
    @RequestMapping("/delBatchEmp")
    public String delBatchEmp(int[] empnos) {
        int i = empService.delBatchEmp(empnos);
        return i > 0 ? "success":"error";
    }

    @RequestMapping("/getEmpByEmpno")
    public Emp getEmpByEmpno(int empno) {
        Emp emp = empService.getEmpByEmpno(empno);
        return emp;
    }

    @RequestMapping("/editEmp")
    public String editEmp(@RequestBody Emp emp) {
        int i = empService.editEmp(emp);
        return i > 0 ? "success":"error";
    }
}
