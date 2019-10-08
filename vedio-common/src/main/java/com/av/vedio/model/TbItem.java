package com.av.vedio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class TbItem implements Serializable {

    private Long id;
    private String title;
    private Double price;

}
