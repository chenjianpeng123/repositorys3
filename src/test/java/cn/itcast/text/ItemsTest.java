package cn.itcast.text;

import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import cn.itcast.service.ItemsService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    /**
     * dao测试
     */
    @Test
    public void test1() {
        //获取Spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需mapper的代理对象
        ItemsMapper itemsMapper = app.getBean(ItemsMapper.class);
        //调用方法
        Items items = itemsMapper.findById(1);
        System.out.println(items.getName());
    }

    /**
     * Service测试
     */
    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = app.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
