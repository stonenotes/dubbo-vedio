package com.av.vedio.dao;

import com.av.vedio.model.TbItem;

import java.util.ArrayList;
import java.util.List;

public class TbItemDao {
    static List<TbItem> list;

    static {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new TbItem(i + 1l, "item: " + i, 100d));
        }
    }

    public static List<TbItem> getList(){
        return list;
    }
}
