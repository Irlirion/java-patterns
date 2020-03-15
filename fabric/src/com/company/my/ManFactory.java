package com.company.my;

public class ManFactory implements Sex{
    @SuppressWarnings("unchecked")
    public <T extends Man> T createHuman(Class<T> tClass) {
        T man=null;
        try {
            man= (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return man;
    }
}
