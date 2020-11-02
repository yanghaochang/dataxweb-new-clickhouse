package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 构建hive reader dto
 *
 * @author jingwk
 * @ClassName hive reader
 * @Version 2.0
 * @since 2020/01/11 17:15
 */
@Data
public class HiveReaderDto implements Serializable {

    private String readerPath;

    private String readerDefaultFS;

    private String readerFileType;

    private String readerFieldDelimiter;

    private Boolean readerSkipHeader;

    public String getReaderPath() {
        return readerPath;
    }

    public void setReaderPath(String readerPath) {
        this.readerPath = readerPath;
    }

    public String getReaderDefaultFS() {
        return readerDefaultFS;
    }

    public void setReaderDefaultFS(String readerDefaultFS) {
        this.readerDefaultFS = readerDefaultFS;
    }

    public String getReaderFileType() {
        return readerFileType;
    }

    public void setReaderFileType(String readerFileType) {
        this.readerFileType = readerFileType;
    }

    public String getReaderFieldDelimiter() {
        return readerFieldDelimiter;
    }

    public void setReaderFieldDelimiter(String readerFieldDelimiter) {
        this.readerFieldDelimiter = readerFieldDelimiter;
    }

    public Boolean getReaderSkipHeader() {
        return readerSkipHeader;
    }

    public void setReaderSkipHeader(Boolean readerSkipHeader) {
        this.readerSkipHeader = readerSkipHeader;
    }
}
