package cn.lhm.kmall.managerservice.mapper;

import cn.lhm.kmall.bean.Catalog1;
import cn.lhm.kmall.bean.Catalog1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Catalog1Mapper {
    int countByExample(Catalog1Example example);

    int deleteByExample(Catalog1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Catalog1 record);

    int insertSelective(Catalog1 record);

    List<Catalog1> selectByExample(Catalog1Example example);

    Catalog1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Catalog1 record, @Param("example") Catalog1Example example);

    int updateByExample(@Param("record") Catalog1 record, @Param("example") Catalog1Example example);

    int updateByPrimaryKeySelective(Catalog1 record);

    int updateByPrimaryKey(Catalog1 record);
}