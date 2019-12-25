package com.cqc.hellospringboot.domain;

import javax.persistence.*;

@Table(name = "ccc..claim_voucher_item")
public class ClaimVoucherItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "claim_voucher_id")
    private Integer claimVoucherId;

    private String item;

    private Double amount;

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
     * @return item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
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