package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 构建json dto
 *
 * @author jingwk
 * @ClassName DataXJsonDto
 * @Version 2.1.2
 * @since 2020/05/05 17:15
 */
@Data
public class DataXBatchJsonBuildDto implements Serializable {

    private Long readerDatasourceId;

    private List<String> readerTables;

    private Long writerDatasourceId;

    private List<String> writerTables;

    private int templateId;

    private RdbmsReaderDto rdbmsReader;

    private RdbmsWriterDto rdbmsWriter;

    public Long getReaderDatasourceId() {
        return readerDatasourceId;
    }

    public void setReaderDatasourceId(Long readerDatasourceId) {
        this.readerDatasourceId = readerDatasourceId;
    }

    public List<String> getReaderTables() {
        return readerTables;
    }

    public void setReaderTables(List<String> readerTables) {
        this.readerTables = readerTables;
    }

    public Long getWriterDatasourceId() {
        return writerDatasourceId;
    }

    public void setWriterDatasourceId(Long writerDatasourceId) {
        this.writerDatasourceId = writerDatasourceId;
    }

    public List<String> getWriterTables() {
        return writerTables;
    }

    public void setWriterTables(List<String> writerTables) {
        this.writerTables = writerTables;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public RdbmsReaderDto getRdbmsReader() {
        return rdbmsReader;
    }

    public void setRdbmsReader(RdbmsReaderDto rdbmsReader) {
        this.rdbmsReader = rdbmsReader;
    }

    public RdbmsWriterDto getRdbmsWriter() {
        return rdbmsWriter;
    }

    public void setRdbmsWriter(RdbmsWriterDto rdbmsWriter) {
        this.rdbmsWriter = rdbmsWriter;
    }
}
