package com.av.vedio.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.av.vedio.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author stonenotes
 * @since 2019-10-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_item")
@AllArgsConstructor
@NoArgsConstructor
public class TbItem extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 价格
     */
    private BigDecimal price;


}
