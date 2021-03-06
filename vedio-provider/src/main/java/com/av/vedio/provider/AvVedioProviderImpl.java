package com.av.vedio.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.av.vedio.dao.TbItemDao;
import com.av.vedio.entity.TbItem;

import java.util.List;

@Service(version = "1.0.0")
public class AvVedioProviderImpl implements AvVedioProvider {
    @Override
    public List<TbItem> findAllTbItem() {
        return TbItemDao.getList();
    }

    @Override
    public String getName(String account) {
        return "stonenotes";
    }
}
