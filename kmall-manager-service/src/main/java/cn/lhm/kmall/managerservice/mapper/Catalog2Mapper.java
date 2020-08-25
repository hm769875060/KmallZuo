package cn.lhm.kmall.managerservice.mapper;

import cn.lhm.kmall.bean.Catalog2;
import cn.lhm.kmall.bean.Catalog2Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Catalog2Mapper {
    int countByExample(Catalog2Example example);

    int deleteByExample(Catalog2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Catalog2 record);

    int insertSelective(Catalog2 record);

    List<Catalog2> selectByExample(Catalog2Example example);

    Catalog2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Catalog2 record, @Param("example") Catalog2Example example);

    int updateByExample(@Param("record") Catalog2 record, @Param("example") Catalog2Example example);

    int updateByPrimaryKeySelective(Catalog2 record);

    int updateByPrimaryKey(Catalog2 record);
}