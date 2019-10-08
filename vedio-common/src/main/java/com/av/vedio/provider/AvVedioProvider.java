package com.av.vedio.provider;

import com.av.vedio.model.TbItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value = "Av视频接口")
public interface AvVedioProvider {

    @ApiOperation(value = "查询全部视频", notes = "")
    List<TbItem> findAllTbItem();

}
