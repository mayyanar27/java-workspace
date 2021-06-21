package io.github.mayyanar27.designpattern.creational.factory;

/**
 * Created by IntelliJ IDEA.
 * User: Ayyanar
 * Date: 21-06-2021
 * Time: 13:27
 */
public class MongoDataBase implements IDataBase{
    @Override
    public String getDataBaseName() {
        return "MongoDB";
    }
}
