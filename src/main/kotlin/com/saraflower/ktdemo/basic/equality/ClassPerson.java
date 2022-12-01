package com.saraflower.ktdemo.basic.equality;

public class ClassPerson {
    private int id;
    private String name;

    public ClassPerson(
            Integer id,
            String name
    ) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        if(obj == this) return true;

        if(obj instanceof ClassPerson) {
            return name.equals(((ClassPerson) obj).name) &&
                    id == ((ClassPerson) obj).id;
        }

        return false;
    }
}
