package io.github.mayyanar27.fun.grouping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 10-07-2021
 * Time: 10:42
 */
public class Menu {
    private String menuID;
    private String parentID;
    private String menuTitle;
    private int menuIndex;
    private List<Menu> childrens;

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public int getMenuIndex() {
        return menuIndex;
    }

    public void setMenuIndex(int menuIndex) {
        this.menuIndex = menuIndex;
    }

    public List<Menu> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Menu> childrens) {
        this.childrens = childrens;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuID='" + menuID + '\'' +
                ", parentID='" + parentID + '\'' +
                ", menuTitle='" + menuTitle + '\'' +
                ", menuIndex=" + menuIndex +
                ", childrens=" + childrens +
                '}';
    }
}
