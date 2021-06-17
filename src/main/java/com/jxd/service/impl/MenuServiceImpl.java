package com.jxd.service.impl;

import com.jxd.dao.IEmpDao;
import com.jxd.dao.IMenuDao;
import com.jxd.model.MainMenu;
import com.jxd.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-11 18:06
 */
@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
    private IMenuDao menuDao;
    @Override
    public List<MainMenu> getMenus() {
        return menuDao.getMenus();
    }
}
