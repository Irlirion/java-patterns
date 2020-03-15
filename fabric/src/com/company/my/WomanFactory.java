package com.company.my;

public class WomanFactory implements Sex{
    @SuppressWarnings("unchecked")
    public <T extends Woman> T createHuman(Class<T> tClass) {
        T woman=null;
        try {
            woman= (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return woman;
    }
}
