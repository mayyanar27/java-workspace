package io.github.mayyanar27.designpattern.creational.factory;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 13:27
 */
public class DataBaseFactory {

    public static IDataBase getDataBase(String name) {
        if (name.equals("SQL")) {
            return new SQLDataBase();
        } else if (name.equals("MONGODB")) {
            return new MongoDataBase();
        }
        return null;
    }
}
