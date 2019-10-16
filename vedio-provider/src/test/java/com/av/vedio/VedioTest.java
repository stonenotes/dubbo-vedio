package com.av.vedio;

import com.alibaba.fastjson.JSON;
import com.av.vedio.entity.TbItem;
import com.av.vedio.service.ITbItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VedioTest {

    @Autowired
    private ITbItemService itemService;

    @Test
    public void testSave(){
        TbItem item = new TbItem();
        item.setTitle("录音机");
        item.setPrice(BigDecimal.valueOf(79.591));
        boolean result = itemService.save(item);
        System.out.printf("-----------------" + result);
    }

    @Test
    public void getEntity(){
        TbItem item = itemService.getById(2);
        System.out.printf("-------" + item.toString());
    }
}
