package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 构建json dto
 *
 * @author jingwk
 * @ClassName DataxJsonDto
 * @Version 2.1.1
 * @since 2020/03/14 07:15
 */
@Data
public class DataXJsonBuildDto implements Serializable {

    private Long readerDatasourceId;

    private List<String> readerTables;

    private List<String> readerColumns;

    private Long writerDatasourceId;

    private List<String> writerTables;

    private List<String> writerColumns;

    private HiveReaderDto hiveReader;

    private HiveWriterDto hiveWriter;

    private HbaseReaderDto hbaseReader;

    private HbaseWriterDto hbaseWriter;

    private RdbmsReaderDto rdbmsReader;

    private RdbmsWriterDto rdbmsWriter;

    private MongoDBReaderDto mongoDBReader;

    private MongoDBWriterDto mongoDBWriter;

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

    public List<String> getReaderColumns() {
        return readerColumns;
    }

    public void setReaderColumns(List<String> readerColumns) {
        this.readerColumns = readerColumns;
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

    public List<String> getWriterColumns() {
        return writerColumns;
    }

    public void setWriterColumns(List<String> writerColumns) {
        this.writerColumns = writerColumns;
    }

    public HiveReaderDto getHiveReader() {
        return hiveReader;
    }

    public void setHiveReader(HiveReaderDto hiveReader) {
        this.hiveReader = hiveReader;
    }

    public HiveWriterDto getHiveWriter() {
        return hiveWriter;
    }

    public void setHiveWriter(HiveWriterDto hiveWriter) {
        this.hiveWriter = hiveWriter;
    }

    public HbaseReaderDto getHbaseReader() {
        return hbaseReader;
    }

    public void setHbaseReader(HbaseReaderDto hbaseReader) {
        this.hbaseReader = hbaseReader;
    }

    public HbaseWriterDto getHbaseWriter() {
        return hbaseWriter;
    }

    public void setHbaseWriter(HbaseWriterDto hbaseWriter) {
        this.hbaseWriter = hbaseWriter;
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

    public MongoDBReaderDto getMongoDBReader() {
        return mongoDBReader;
    }

    public void setMongoDBReader(MongoDBReaderDto mongoDBReader) {
        this.mongoDBReader = mongoDBReader;
    }

    public MongoDBWriterDto getMongoDBWriter() {
        return mongoDBWriter;
    }

    public void setMongoDBWriter(MongoDBWriterDto mongoDBWriter) {
        this.mongoDBWriter = mongoDBWriter;
    }
}
