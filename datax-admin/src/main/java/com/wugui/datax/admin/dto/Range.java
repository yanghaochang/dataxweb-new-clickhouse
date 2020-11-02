package com.wugui.datax.admin.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Range implements Serializable {

  private String startRowkey;

  private String endRowkey;

  private Boolean isBinaryRowkey;

  public String getStartRowkey() {
    return startRowkey;
  }

  public void setStartRowkey(String startRowkey) {
    this.startRowkey = startRowkey;
  }

  public String getEndRowkey() {
    return endRowkey;
  }

  public void setEndRowkey(String endRowkey) {
    this.endRowkey = endRowkey;
  }

  public Boolean getBinaryRowkey() {
    return isBinaryRowkey;
  }

  public void setBinaryRowkey(Boolean binaryRowkey) {
    isBinaryRowkey = binaryRowkey;
  }
}
