package cn.lhm.kmall.service;

import cn.lhm.kmall.bean.PmsBaseAttrInfo;
import cn.lhm.kmall.bean.PmsBaseAttrValue;
import cn.lhm.kmall.bean.PmsProductInfo;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id);
    List<PmsBaseAttrValue> getAttrValueList(Long attrId);
    Integer saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

}
