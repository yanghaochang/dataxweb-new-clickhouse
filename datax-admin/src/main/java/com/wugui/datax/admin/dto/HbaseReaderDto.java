package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HbaseReaderDto implements Serializable {

  private String readerMaxVersion;

  private String readerMode;

  private Range readerRange;

  public String getReaderMaxVersion() {
    return readerMaxVersion;
  }

  public void setReaderMaxVersion(String readerMaxVersion) {
    this.readerMaxVersion = readerMaxVersion;
  }

  public String getReaderMode() {
    return readerMode;
  }

  public void setReaderMode(String readerMode) {
    this.readerMode = readerMode;
  }

  public Range getReaderRange() {
    return readerRange;
  }

  public void setReaderRange(Range readerRange) {
    this.readerRange = readerRange;
  }
}

