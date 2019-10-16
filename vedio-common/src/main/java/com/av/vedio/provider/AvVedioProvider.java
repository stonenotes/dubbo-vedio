package com.av.vedio.provider;

import com.av.vedio.entity.TbItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;

@Api(value = "Av视频接口")
public interface AvVedioProvider {

    @ApiOperation(value = "查询全部视频", notes = "111")
    List<TbItem> findAllTbItem();

    @ApiOperation(value = "获取名称")
    String getName(@ApiParam(value = "账号") String account);

}
