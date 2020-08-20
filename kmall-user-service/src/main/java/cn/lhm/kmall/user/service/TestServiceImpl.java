package cn.lhm.kmall.user.service;

import cn.lhm.kmall.bean.Member;
import cn.lhm.kmall.service.TestService;
import cn.lhm.kmall.user.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    MemberMapper memberMapper;

    @Override
    public List<Member> test() {
        return memberMapper.selectByExample(null);
    }
}
