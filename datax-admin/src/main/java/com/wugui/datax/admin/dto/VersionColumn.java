package com.wugui.datax.admin.dto;

import lombok.Data;

@Data
public class VersionColumn {

  private Integer index;

  private String value;

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
