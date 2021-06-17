package com.jxd.model;

import java.util.List;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-11 18:00
 */
public class MainMenu {
    private int id;
    private String title;
    private String path;
    List<SubMenu> slist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<SubMenu> getSlist() {
        return slist;
    }

    public void setSlist(List<SubMenu> slist) {
        this.slist = slist;
    }

    public MainMenu() {
    }

    public MainMenu(int id, String title, String path, List<SubMenu> slist) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.slist = slist;
    }
}
