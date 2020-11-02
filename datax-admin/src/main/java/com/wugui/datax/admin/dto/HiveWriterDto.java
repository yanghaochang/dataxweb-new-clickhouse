package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 构建hive write dto
 *
 * @author jingwk
 * @ClassName hive write dto
 * @Version 2.0
 * @since 2020/01/11 17:15
 */
@Data
public class HiveWriterDto implements Serializable {

    private String writerDefaultFS;

    private String writerFileType;

    private String writerPath;

    private String writerFileName;

    private String writeMode;

    private String writeFieldDelimiter;

    public String getWriterDefaultFS() {
        return writerDefaultFS;
    }

    public void setWriterDefaultFS(String writerDefaultFS) {
        this.writerDefaultFS = writerDefaultFS;
    }

    public String getWriterFileType() {
        return writerFileType;
    }

    public void setWriterFileType(String writerFileType) {
        this.writerFileType = writerFileType;
    }

    public String getWriterPath() {
        return writerPath;
    }

    public void setWriterPath(String writerPath) {
        this.writerPath = writerPath;
    }

    public String getWriterFileName() {
        return writerFileName;
    }

    public void setWriterFileName(String writerFileName) {
        this.writerFileName = writerFileName;
    }

    public String getWriteMode() {
        return writeMode;
    }

    public void setWriteMode(String writeMode) {
        this.writeMode = writeMode;
    }

    public String getWriteFieldDelimiter() {
        return writeFieldDelimiter;
    }

    public void setWriteFieldDelimiter(String writeFieldDelimiter) {
        this.writeFieldDelimiter = writeFieldDelimiter;
    }
}
