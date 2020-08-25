package cn.lhm.kmall.managerservice.mapper;

import cn.lhm.kmall.bean.Catalog3;
import cn.lhm.kmall.bean.Catalog3Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Catalog3Mapper {
    int countByExample(Catalog3Example example);

    int deleteByExample(Catalog3Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Catalog3 record);

    int insertSelective(Catalog3 record);

    List<Catalog3> selectByExample(Catalog3Example example);

    Catalog3 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Catalog3 record, @Param("example") Catalog3Example example);

    int updateByExample(@Param("record") Catalog3 record, @Param("example") Catalog3Example example);

    int updateByPrimaryKeySelective(Catalog3 record);

    int updateByPrimaryKey(Catalog3 record);
}