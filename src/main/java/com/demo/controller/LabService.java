package com.demo.controller;

import com.demo.common.model.Lab;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

public class LabService {

    public static final Lab dao = new Lab().dao();

    public Lab findById(int id){
        return dao.findById(id);
    }

    public void add(String id, String name, String place, String intro, String web){
        Record record = new Record().set("lab_name", name).set("lab_place", place).set("lab_intro", intro).set("lab_web", web);
        Db.save("t_lab", record);
    }

    public boolean deleteById(int id){
        try{
            String sql = "DELETE * FROM t_lab WHERE lib_id=?";
            int iRet = Db.update(sql, id);
            if(iRet>0){
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateById(String id, String name, String place, String intro, String web){
        try{
            String sql = "UPDATE t_lab SET lab_name=?,lab_place=?,lab_intro=?,lab_web=? WHERE lab_id=?";
            int ret = Db.update(sql, name, place, intro, web, id);
            if(ret>0){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
