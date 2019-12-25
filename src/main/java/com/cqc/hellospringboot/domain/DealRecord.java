package com.cqc.hellospringboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ccc..deal_record")
public class DealRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "claim_voucher_id")
    private Integer claimVoucherId;

    @Column(name = "deal_sn")
    private String dealSn;

    @Column(name = "deal_time")
    private Date dealTime;

    @Column(name = "deal_way")
    private String dealWay;

    @Column(name = "deal_result")
    private String dealResult;

    private String comment;

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
     * @return claim_voucher_id
     */
    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    /**
     * @param claimVoucherId
     */
    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    /**
     * @return deal_sn
     */
    public String getDealSn() {
        return dealSn;
    }

    /**
     * @param dealSn
     */
    public void setDealSn(String dealSn) {
        this.dealSn = dealSn;
    }

    /**
     * @return deal_time
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * @param dealTime
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * @return deal_way
     */
    public String getDealWay() {
        return dealWay;
    }

    /**
     * @param dealWay
     */
    public void setDealWay(String dealWay) {
        this.dealWay = dealWay;
    }

    /**
     * @return deal_result
     */
    public String getDealResult() {
        return dealResult;
    }

    /**
     * @param dealResult
     */
    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}