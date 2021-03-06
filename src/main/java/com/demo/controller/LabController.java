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
       setAttr("labpage",labService.paginate(getParaToInt(0,1),10));
       render("lab.html");
    }

    public void add(){
       render("add.html");
    }

    public void save(){
        getBean(Lab.class).save();
//        String lab_id = getPara("lab_id");
//        String lab_name = getPara("lab_name");
//        String lab_place = getPara("lab_place");
//        String lab_intro = getPara("lab_intro");
//        String lab_web = getPara("lab_web");
//        labService.add(lab_id, lab_name, lab_place, lab_intro, lab_web);
        redirect("/lab");
    }

    public void delete(){
//        int id = getParaToInt("lab_id");
        int id = getParaToInt();
        System.err.println(id);
        labService.deleteById(id);
        redirect("/lab");
    }
    public void edit() {
        setAttr("lab",labService.findById(getParaToInt()));
    }
    //
    public void update(){
       String lab_id = getPara("lab_id");
        String lab_name = getPara("lab_name");
        String lab_place = getPara("lab_place");
        String lab_intro = getPara("lab_intro");
        String lab_web = getPara("lab_web");
        labService.updateById(lab_id, lab_name, lab_place, lab_intro, lab_web);
        redirect("/lab");
    }

}
