package cn.lhm.kmall.managerservice.service;

import cn.lhm.kmall.bean.*;
import cn.lhm.kmall.managerservice.mapper.PmsBaseAttrInfoMapper;
import cn.lhm.kmall.managerservice.mapper.PmsBaseAttrValueMapper;
import cn.lhm.kmall.managerservice.mapper.PmsProductInfoMapper;
import cn.lhm.kmall.service.AttrService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Resource
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Resource
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id) {
        PmsBaseAttrInfoExample pmsBaseAttrInfoExample = new PmsBaseAttrInfoExample();
        PmsBaseAttrInfoExample.Criteria criteria = pmsBaseAttrInfoExample.createCriteria();
        criteria.andCatalog3IdEqualTo(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.selectByExample(pmsBaseAttrInfoExample);
        return  pmsBaseAttrInfos;
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId) {
        PmsBaseAttrValueExample pmsBaseAttrValueExample = new PmsBaseAttrValueExample();
        PmsBaseAttrValueExample.Criteria criteria = pmsBaseAttrValueExample.createCriteria();
        criteria.andAttrIdEqualTo(attrId);
        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrValueMapper.selectByExample(pmsBaseAttrValueExample);
        return pmsBaseAttrValues;
    }

    @Override
    public Integer saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        Integer i=0;
        if(pmsBaseAttrInfo.getId()==null){
             i = pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
        }else{
            i=pmsBaseAttrInfoMapper.updateByPrimaryKey(pmsBaseAttrInfo);
        }

        PmsBaseAttrValueExample pmsBaseAttrValueExample = new PmsBaseAttrValueExample();
        PmsBaseAttrValueExample.Criteria criteria = pmsBaseAttrValueExample.createCriteria();
        criteria.andAttrIdEqualTo(pmsBaseAttrInfo.getId());
        i=pmsBaseAttrValueMapper.deleteByExample(pmsBaseAttrValueExample);

        if(pmsBaseAttrInfo.getAttrValueList()!=null && pmsBaseAttrInfo.getAttrValueList().size()>0 ) {
            i = pmsBaseAttrValueMapper.insertBase(pmsBaseAttrInfo.getAttrValueList(), pmsBaseAttrInfo.getId());

        }
        return i;
    }
}
