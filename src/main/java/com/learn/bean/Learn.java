package com.learn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author xyp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "learn")
public class Learn {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "text")
    private String text;
}
