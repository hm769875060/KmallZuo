package cn.lhm.kmall.managerservice.mapper;

import cn.lhm.kmall.bean.PmsBaseAttrValue;
import cn.lhm.kmall.bean.PmsBaseAttrValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseAttrValueMapper {
    int countByExample(PmsBaseAttrValueExample example);

    int deleteByExample(PmsBaseAttrValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    List<PmsBaseAttrValue> selectByExample(PmsBaseAttrValueExample example);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByExample(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);
    Integer insertBase(@Param("List")List<PmsBaseAttrValue> pmsBaseAttrValue,@Param("attrId")Long attrId);
}