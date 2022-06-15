package com.learn.request.learnrequest;

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
public class LearnAddRequest {
    @NotNull
    String text;
}
