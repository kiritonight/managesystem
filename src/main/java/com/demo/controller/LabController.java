package com.demo.controller;

import com.demo.common.model.Lab;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;

/**
 * @author ZhiWeng Wang
 * @Description:
 * @Date: Created in 18:142018/11/15/015
 * @Modified By:
 */
public class LabController extends Controller {

    //
    @Inject
    LabService labService;

    public void index(){
        renderText("OMG");
    }

    public void add(){
        String lab_id = getPara("lab_id");
        String lab_name = getPara("lab_name");
        String lab_place = getPara("lab_place");
        String lab_intro = getPara("lab_intro");
        String lab_web = getPara("lab_web");
        labService.add(lab_id, lab_name, lab_place, lab_intro, lab_web);
        redirect("/lab");
    }

    public void save(){

    }

    public void delete(){
        int id = getParaToInt("lab_id");
        System.err.println(id);
        labService.deleteById(id);
        redirect("/lab");
    }

    //
    public void update(){
       String lab_id = getPara("lab_id");
        String lab_name = getPara("lab_name");
        String lab_place = getPara("lab_place");
        String lab_intro = getPara("lab_intro");
        String lab_web = getPara("lab_web");
        if(labService.updateById(lab_id, lab_name, lab_place, lab_intro, lab_web)) {
            System.out.println("更新成功");
        }
        redirect("/lab");
    }

}
