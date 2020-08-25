package cn.lhm.kmall.managerweb.controller;

import cn.lhm.kmall.bean.Catalog1;
import cn.lhm.kmall.bean.Catalog2;
import cn.lhm.kmall.bean.Catalog3;
import cn.lhm.kmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CatalogController {
    @Reference
    CatalogService catalogService;
    @RequestMapping(value = "/getCatalog1")
    public List<Catalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }
    @RequestMapping(value = "/getCatalog2")
    public List<Catalog2> getCatalog2(Integer catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }
    @RequestMapping(value = "/getCatalog3")
    public List<Catalog3> getCatalog3(Long catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }

}
