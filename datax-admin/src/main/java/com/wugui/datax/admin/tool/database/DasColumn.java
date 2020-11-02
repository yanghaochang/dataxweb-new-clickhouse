package com.wugui.datax.admin.tool.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 原始jdbc字段对象
 *
 * @author zhouhongfa@gz-yibo.com
 * @ClassName DasColumn
 * @Version 1.0
 * @since 2019/7/17 16:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DasColumn {

    private String columnName;

    private String columnTypeName;

    private String columnClassName;

    private String columnComment;
    private int isNull;
    private boolean isprimaryKey;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnTypeName() {
        return columnTypeName;
    }

    public void setColumnTypeName(String columnTypeName) {
        this.columnTypeName = columnTypeName;
    }

    public String getColumnClassName() {
        return columnClassName;
    }

    public void setColumnClassName(String columnClassName) {
        this.columnClassName = columnClassName;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public int getIsNull() {
        return isNull;
    }

    public void setIsNull(int isNull) {
        this.isNull = isNull;
    }

    public boolean isIsprimaryKey() {
        return isprimaryKey;
    }

    public void setIsprimaryKey(boolean isprimaryKey) {
        this.isprimaryKey = isprimaryKey;
    }
}
