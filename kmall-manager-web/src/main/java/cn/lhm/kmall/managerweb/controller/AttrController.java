package cn.lhm.kmall.managerweb.controller;

import cn.lhm.kmall.bean.PmsBaseAttrInfo;
import cn.lhm.kmall.bean.PmsBaseAttrValue;
import cn.lhm.kmall.bean.PmsProductInfo;
import cn.lhm.kmall.service.AttrService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttrController {
    @Reference
    AttrService attrService;
    @RequestMapping(value = "attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
    @RequestMapping(value = "getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId){
        List<PmsBaseAttrValue> attrValueList = attrService.getAttrValueList(attrId);
    return attrValueList;
    }
    @RequestMapping(value = "saveAttrInfo")
    public Integer saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        Integer integer = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return integer;
    }


}
