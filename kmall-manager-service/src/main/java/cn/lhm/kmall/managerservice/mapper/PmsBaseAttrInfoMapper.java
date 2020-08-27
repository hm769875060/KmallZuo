package cn.lhm.kmall.managerservice.mapper;

import cn.lhm.kmall.bean.PmsBaseAttrInfo;
import cn.lhm.kmall.bean.PmsBaseAttrInfoExample;
import cn.lhm.kmall.bean.PmsBaseAttrValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseAttrInfoMapper {
    int countByExample(PmsBaseAttrInfoExample example);

    int deleteByExample(PmsBaseAttrInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrInfo record);

    int insertSelective(PmsBaseAttrInfo record);

    List<PmsBaseAttrInfo> selectByExample(PmsBaseAttrInfoExample example);

    PmsBaseAttrInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrInfo record, @Param("example") PmsBaseAttrInfoExample example);

    int updateByExample(@Param("record") PmsBaseAttrInfo record, @Param("example") PmsBaseAttrInfoExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrInfo record);

    int updateByPrimaryKey(PmsBaseAttrInfo record);

}