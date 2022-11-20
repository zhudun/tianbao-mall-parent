package com.yz.tianbaoums.mapper;

import com.yz.tianbaoums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: yangzhen
 * @Date 2022/11/20-12:00
 * @Description: com.yz.tianbaoums.mapper
 * @version: 1.0
 */
@SpringBootTest(classes = com.yz.tianbaoums.TianbaoUmsApplication.class)
public class UserMemberTest {
    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
//	@Rollback
//	@Transactional
    void testInsert(){


        UmsMember t = new UmsMember();
        t.setUsername("yz");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");


        umsMemberMapper.insert(t);

//		UmsMember cpf1 = umsMemberMapper.selectByName("nick");
//		Long id = cpf1.getId();
//		System.out.println("id:"+id);

    }

    @Test
    void testUpdate(){
        UmsMember t = new UmsMember();
        t.setNickName("尴尬");
        t.setId(61L);

        umsMemberMapper.updateById(t);
    }



    @Test
    void testSelect(){
        UmsMember cpf = umsMemberMapper.selectByName("cpf");
        System.out.println(cpf.getNickName());
    }


}
