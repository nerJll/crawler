package com.anxpp.tinysoft.core.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Comparator;
import java.util.Date;

/**
 * 文章信息
 * Created by anxpp.com on 2017/3/11.
 */
@Entity
@Table(name = "t_csdn_weekly_article")
@Data
public class Article extends BaseEntity {
    /**
     * 文章名称
     */
    private String name;

    /**
     * 文章名称
     */
    private String url;

    /**
     * 属于哪一期
     */
    private Integer stage;

    /**
     * 浏览量
     */
    private Integer views;

    /**
     * 收藏数
     */
    private Integer collections;

    /**
     * 所属知识库类别
     */
    private String type;

    /**
     * 类别图片地址
     */
    private String img;

    /**
     * 更新时间
     */
    @Column(name = "update_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    public Article() {
        this.updateAt = new Date();
    }
}
