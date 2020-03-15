package com.company.my;

public class SexFactory{
    @SuppressWarnings("unchecked")
    public <T extends Sex> T createHumanFactory(Class<T> tClass) {
        T sex = null;
        try {
            sex = (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sex;
    }
}
