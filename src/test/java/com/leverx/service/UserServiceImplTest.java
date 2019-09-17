//package com.leverx.service;
//
//import com.leverx.entity.User;
//import com.leverx.entity.enums.Role;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
//public class UserServiceImplTest {
//
//    @Autowired
//    UserService service;
//
//    @Test
//    public void saveTest() {
//        User userValid = new User();
//        userValid.setName("Name");
//        userValid.setPassword("1234");
//        userValid.setEmail("aa@bbb.com");
//        userValid.setRole(Role.ADMINISTRATOR);
//        service.save(userValid);
//        //Assert.assertEquals(User.class, service.save(userValid));
//    }
//
//
//}
