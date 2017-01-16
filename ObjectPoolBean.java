package com.softlatin.android.inmochat.model.bean.pool;

/**
 * Created by Alejandro on 02/11/2015.
 */
public class ObjectPoolBean {

    private int id;
    private Object object;

    public ObjectPoolBean() {
    }

    public ObjectPoolBean(int id, Object object) {
        this.id = id;
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}