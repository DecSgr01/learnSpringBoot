package com.learn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author xyp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Learn {
    Integer id;
    @NotNull
    String text;

}
