package cn.lhm.kmall.service;

import cn.lhm.kmall.bean.Catalog1;
import cn.lhm.kmall.bean.Catalog2;
import cn.lhm.kmall.bean.Catalog3;

import java.util.List;

public interface CatalogService {
    public List<Catalog1>getCatalog1();
    public List<Catalog2> getCatalog2(Integer id);
    public List<Catalog3> getCatalog3(Long id);

}
