package com.softlatin.android.inmochat.pool.objectPool;

import com.softlatin.android.inmochat.model.bean.pool.ObjectPoolBean;

import java.util.ArrayList;

/**
 * Created by Alejandro on 02/11/2015.
 */
public class ObjectPool {

    private static ObjectPool mInstance = null;

    ArrayList<ObjectPoolBean> objectPoolBeanArrayList;
    int idCount;

    public static ObjectPool getInstance(){
        if(mInstance == null){
            mInstance = new ObjectPool();
        }

        return mInstance;
    }

    private ObjectPool(){
        this.objectPoolBeanArrayList = new ArrayList<ObjectPoolBean>();
        this.idCount = -1;
    }

    public int addObject(Object object){
        idCount = idCount + 1;
        ObjectPoolBean objectPoolBean = new ObjectPoolBean(idCount, object);

        this.objectPoolBeanArrayList.add(idCount, objectPoolBean);

        return idCount;
    }

    public Object getObject(int id) throws Exception{

        try{

            return this.objectPoolBeanArrayList.get(id).getObject();

        }catch(Exception ex){
            throw new Exception(ex);
        }
    }

    public void cleanPool(){
        this.objectPoolBeanArrayList.clear();
        this.idCount = -1;
    }

    public ArrayList<ObjectPoolBean> getObjectPoolBeanArrayList() {
        return objectPoolBeanArrayList;
    }

    public void setObjectPoolBeanArrayList(ArrayList<ObjectPoolBean> objectPoolBeanArrayList) {
        this.objectPoolBeanArrayList = objectPoolBeanArrayList;
    }
}