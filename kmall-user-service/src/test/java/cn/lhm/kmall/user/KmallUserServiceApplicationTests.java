package cn.lhm.kmall.user;

import cn.lhm.kmall.bean.Member;
import cn.lhm.kmall.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class KmallUserServiceApplicationTests {
    @Resource
    TestService testService;
    @Test
    void contextLoads() {
        List<Member> test = testService.test();
        test.forEach(item-> System.out.println(item.toString()));
    }

}
