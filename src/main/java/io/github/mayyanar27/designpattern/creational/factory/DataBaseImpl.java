package io.github.mayyanar27.designpattern.creational.factory;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 13:29
 */
public class DataBaseImpl {
    public static void main(String[] args) {
        IDataBase sql = DataBaseFactory.getDataBase("SQL");
        System.out.println(sql.getDataBaseName());
    }
}
