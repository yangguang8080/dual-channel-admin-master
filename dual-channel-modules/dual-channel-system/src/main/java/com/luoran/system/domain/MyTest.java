package com.luoran.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.luoran.common.core.annotation.Excel;
import com.luoran.common.core.web.domain.BaseEntity;

/**
 * 测试对象 my_test
 *
 * @author luoran
 * @date 2021-04-04
 */
public class MyTest extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long testId;

    /**
     * 编码
     */
    @Excel(name = "编码")
    private Integer testCode;

    /**
     * 内容
     */
    @Excel(name = "内容")
    private String testContent;

    /**
     * json字段
     */
    @Excel(name = "json字段")
    private String testJson;

    /**
     * 时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date testDate;

    /**
     * 价格
     */
    @Excel(name = "价格")
    private BigDecimal testPrice;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private Integer testStatus;

    /**
     * 删除
     */
    @Excel(name = "删除")
    private Boolean testBool;

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public Long getTestId() {
        return testId;
    }
    public void setTestCode(Integer testCode) {
        this.testCode = testCode;
    }

    public Integer getTestCode() {
        return testCode;
    }
    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    public String getTestContent() {
        return testContent;
    }
    public void setTestJson(String testJson) {
        this.testJson = testJson;
    }

    public String getTestJson() {
        return testJson;
    }
    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Date getTestDate() {
        return testDate;
    }
    public void setTestPrice(BigDecimal testPrice) {
        this.testPrice = testPrice;
    }

    public BigDecimal getTestPrice() {
        return testPrice;
    }
    public void setTestStatus(Integer testStatus) {
        this.testStatus = testStatus;
    }

    public Integer getTestStatus() {
        return testStatus;
    }
    public void setTestBool(Boolean testBool) {
        this.testBool = testBool;
    }

    public Boolean getTestBool() {
        return testBool;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("testId", getTestId())
            .append("testCode", getTestCode())
            .append("testContent", getTestContent())
            .append("testJson", getTestJson())
            .append("testDate", getTestDate())
            .append("testPrice", getTestPrice())
            .append("testStatus", getTestStatus())
            .append("testBool", getTestBool())
            .toString();
    }
}
