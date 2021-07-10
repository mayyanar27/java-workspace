package io.github.mayyanar27.fun.grouping;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 10-07-2021
 * Time: 10:43
 */
public class TestApp {


    public static void main(String[] args) {

        List<Menu> menusFinal = new ArrayList<>();
        TestApp testApp = new TestApp();
        ArrayList<MenuResource> menus = testApp.testData();
        Map<Object, List<MenuResource>> collect =
                menus.stream().collect(Collectors.groupingBy(menu -> menu.getParentID()));
        List<MenuResource> na = collect.get("NA");
        for (MenuResource menu : na) {
            menusFinal.add(testApp.groupMenu(collect, menu));
        }
        menusFinal.sort(testApp.sortMenu);
        System.out.println(new Gson().toJson(menusFinal));

    }


    private /*static*/ Menu groupMenu(Map<Object, List<MenuResource>> collect, MenuResource na) {
        List<MenuResource> menus = collect.get(na.getMenuID());
        if (menus != null) {
            Menu menu = createMenu(na);
            menu.setChildrens(new ArrayList<>());
            for (MenuResource menu1 : menus) {
                Menu menu2 = groupMenu(collect, menu1);
                menu2.setParentID((menu.getMenuID()));
                menu.getChildrens().add(menu2);
            }
            menu.getChildrens().sort(sortMenu);
            return menu;
        } else {
            return createMenu(na);
        }

        //return na;
    }

    private /*static*/ Menu createMenu(MenuResource na) {
        Menu menu = new Menu();
        menu.setMenuID(na.getMenuID());
        menu.setMenuTitle(na.getMenuTitle());
        menu.setMenuIndex(na.getMenuIndex());
        return menu;
    }


    private /*static*/ Comparator<Menu> sortMenu = (o1, o2) -> {
        if (o1.getMenuIndex() == o2.getMenuIndex()) {
            return 0;
        } else if(o1.getMenuIndex() > o2.getMenuIndex()){
            return  1;
        }
        return  -1;
    };

    private /*static*/ ArrayList<MenuResource> testData() {
        ArrayList<MenuResource> menus = new ArrayList<>();
        MenuResource menu = new MenuResource();
        menu.setMenuID("My_DashBoard");
        menu.setMenuTitle("My Dashboard");
        menu.setMenuIndex(6);
        menu.setParentID("NA");
        menus.add(menu);
        MenuResource menu1 = new MenuResource();
        menu1.setMenuID("Onboarding");
        menu1.setMenuTitle("Onboarding");
        menu1.setMenuIndex(2);
        menu1.setParentID("NA");
        menus.add(menu1);
        MenuResource menu2 = new MenuResource();
        menu2.setMenuID("grade");
        menu2.setMenuTitle("grade");
        menu2.setMenuIndex(4);
        menu2.setParentID("Onboarding");
        menus.add(menu2);
        MenuResource menu3 = new MenuResource();
        menu3.setMenuID("section");
        menu3.setMenuTitle("section");
        menu3.setMenuIndex(2);
        menu3.setParentID("Onboarding");
        menus.add(menu3);
        MenuResource menu4 = new MenuResource();
        menu4.setMenuID("section2");
        menu4.setMenuTitle("section2");
        menu4.setMenuIndex(1);
        menu4.setParentID("section");
        menus.add(menu4);
        return menus;
    }
}
