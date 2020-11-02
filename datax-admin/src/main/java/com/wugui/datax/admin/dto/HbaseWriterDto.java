package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HbaseWriterDto implements Serializable {

  private String writeNullMode;

  private String writerMode;

  private String writerRowkeyColumn;

  private VersionColumn writerVersionColumn;

  public String getWriteNullMode() {
    return writeNullMode;
  }

  public void setWriteNullMode(String writeNullMode) {
    this.writeNullMode = writeNullMode;
  }

  public String getWriterMode() {
    return writerMode;
  }

  public void setWriterMode(String writerMode) {
    this.writerMode = writerMode;
  }

  public String getWriterRowkeyColumn() {
    return writerRowkeyColumn;
  }

  public void setWriterRowkeyColumn(String writerRowkeyColumn) {
    this.writerRowkeyColumn = writerRowkeyColumn;
  }

  public VersionColumn getWriterVersionColumn() {
    return writerVersionColumn;
  }

  public void setWriterVersionColumn(VersionColumn writerVersionColumn) {
    this.writerVersionColumn = writerVersionColumn;
  }
}
