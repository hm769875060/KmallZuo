package cn.lhm.kmall.managerservice.service;

import cn.lhm.kmall.bean.*;
import cn.lhm.kmall.managerservice.mapper.Catalog1Mapper;
import cn.lhm.kmall.managerservice.mapper.Catalog2Mapper;
import cn.lhm.kmall.managerservice.mapper.Catalog3Mapper;
import cn.lhm.kmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Resource
    Catalog1Mapper catalog1Mapper;
    @Resource
    Catalog2Mapper catalog2Mapper;
    @Resource
    Catalog3Mapper catalog3Mapper;


    @Override
    public List<Catalog1> getCatalog1() {
        return catalog1Mapper.selectByExample(null);
    }

    @Override
    public List<Catalog2> getCatalog2(Integer id) {
        Catalog2Example catalog2Example = new Catalog2Example();
        Catalog2Example.Criteria criteria=catalog2Example.createCriteria();
        criteria.andCatalog1IdEqualTo(id);
        List<Catalog2> catalog2s = catalog2Mapper.selectByExample(catalog2Example);
        return catalog2s;
    }

    @Override
    public List<Catalog3> getCatalog3(Long id) {
        Catalog3Example catalog3Example = new Catalog3Example();
        Catalog3Example.Criteria criteria=catalog3Example.createCriteria();
        criteria.andCatalog2IdEqualTo(id);
        List<Catalog3> catalog3s = catalog3Mapper.selectByExample(catalog3Example);
        return catalog3s;
    }
}
