package com.mabaji.myapp.sample.web.menu;

import org.joda.time.LocalDateTime;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class MenuVO implements Serializable {
    private Integer menuId;
    private String menuNm;
    private String menuNmEng;
    private Integer parMenuId;
    private String menuTyp;
    private String useYn;
    private Integer power;
    private Integer dispSeq;
    private String url;
    private String remark1;
    private String regMemberId;
    private LocalDateTime regDt;
    private String updMemberId;
    private LocalDateTime updDt;
    private Integer lvl;

    public Integer getMenuId() {
        return this.menuId;
    }

    public void setMenuId(final Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuNm() {
        return this.menuNm;
    }

    public void setMenuNm(final String menuNm) {
        this.menuNm = menuNm;
    }

    public String getMenuNmEng() {
        return this.menuNmEng;
    }

    public void setMenuNmEng(final String menuNmEng) {
        this.menuNmEng = menuNmEng;
    }

    public Integer getParMenuId() {
        return this.parMenuId;
    }

    public void setParMenuId(final Integer parMenuId) {
        this.parMenuId = parMenuId;
    }

    public String getMenuTyp() {
        return this.menuTyp;
    }

    @SuppressWarnings("unused")
    public void setMenuTyp(final String menuTyp) {
        this.menuTyp = menuTyp;
    }

    public String getUseYn() {
        return this.useYn;
    }

    public void setUseYn(final String useYn) {
        this.useYn = useYn;
    }

    public Integer getPower() {
        return this.power;
    }

    public void setPower(final Integer power) {
        this.power = power;
    }

    public Integer getDispSeq() {
        return this.dispSeq;
    }

    public void setDispSeq(final Integer dispSeq) {
        this.dispSeq = dispSeq;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getRemark1() {
        return this.remark1;
    }

    public void setRemark1(final String remark1) {
        this.remark1 = remark1;
    }

    public String getRegMemberId() {
        return this.regMemberId;
    }

    public void setRegMemberId(final String regMemberId) {
        this.regMemberId = regMemberId;
    }

    public LocalDateTime getRegDt() {
        return this.regDt;
    }

    public void setRegDt(final LocalDateTime regDt) {
        this.regDt = regDt;
    }

    public String getUpdMemberId() {
        return this.updMemberId;
    }

    public void setUpdMemberId(final String updMemberId) {
        this.updMemberId = updMemberId;
    }

    public LocalDateTime getUpdDt() {
        return this.updDt;
    }

    public void setUpdDt(final LocalDateTime updDt) {
        this.updDt = updDt;
    }

    public Integer getLvl() {
        return this.lvl;
    }

    public void setLvl(final Integer lvl) {
        this.lvl = lvl;
    }

}
