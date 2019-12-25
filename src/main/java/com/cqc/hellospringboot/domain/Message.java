package com.cqc.hellospringboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ccc..message")
public class Message {
    @Id
    private Integer sn;

    @Column(name = "create_sn")
    private String createSn;

    @Column(name = "getter_sn")
    private String getterSn;

    private String text;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_name")
    private String createName;

    /**
     * @return sn
     */
    public Integer getSn() {
        return sn;
    }

    /**
     * @param sn
     */
    public void setSn(Integer sn) {
        this.sn = sn;
    }

    /**
     * @return create_sn
     */
    public String getCreateSn() {
        return createSn;
    }

    /**
     * @param createSn
     */
    public void setCreateSn(String createSn) {
        this.createSn = createSn;
    }

    /**
     * @return getter_sn
     */
    public String getGetterSn() {
        return getterSn;
    }

    /**
     * @param getterSn
     */
    public void setGetterSn(String getterSn) {
        this.getterSn = getterSn;
    }

    /**
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return create_name
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * @param createName
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }
}