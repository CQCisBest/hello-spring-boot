package com.cqc.hellospringboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ccc..claim_voucher")
public class ClaimVoucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cause;

    @Column(name = "create_sn")
    private String createSn;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "next_deal_sn")
    private String nextDealSn;

    @Column(name = "total_amount")
    private Double totalAmount;

    private String status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return cause
     */
    public String getCause() {
        return cause;
    }

    /**
     * @param cause
     */
    public void setCause(String cause) {
        this.cause = cause;
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
     * @return next_deal_sn
     */
    public String getNextDealSn() {
        return nextDealSn;
    }

    /**
     * @param nextDealSn
     */
    public void setNextDealSn(String nextDealSn) {
        this.nextDealSn = nextDealSn;
    }

    /**
     * @return total_amount
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}