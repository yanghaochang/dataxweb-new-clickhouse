package com.wugui.datax.admin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * datax-web log, used to track trigger process
 *
 * @author jingwk  2019-11-17 22:08:11
 */
@Data
public class JobLog {

    private long id;

    // job info
    @ApiModelProperty("执行器主键ID")
    private int jobGroup;
    @ApiModelProperty("任务，主键ID")
    private int jobId;
    @ApiModelProperty("任务描述")
    private String jobDesc;

    // execute info
    @ApiModelProperty("执行器地址，本次执行的地址")
    private String executorAddress;
    @ApiModelProperty("执行器任务handler")
    private String executorHandler;
    @ApiModelProperty("执行器任务参数")
    private String executorParam;
    @ApiModelProperty("执行器任务分片参数，格式如 1/2")
    private String executorShardingParam;
    @ApiModelProperty("失败重试次数")
    private int executorFailRetryCount;

    // trigger info
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("调度-时间")
    private Date triggerTime;
    @ApiModelProperty("调度-结果")
    private int triggerCode;
    @ApiModelProperty("调度-日志")
    private String triggerMsg;

    // handle info
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("执行-时间")
    private Date handleTime;
    @ApiModelProperty("执行-状态")
    private int handleCode;
    @ApiModelProperty("执行-日志")
    private String handleMsg;

    // alarm info
    @ApiModelProperty("告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败")
    private int alarmStatus;

    @ApiModelProperty("DataX进程Id")
    private String processId;

    @ApiModelProperty("增量最大id")
    private Long maxId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(int jobGroup) {
        this.jobGroup = jobGroup;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getExecutorAddress() {
        return executorAddress;
    }

    public void setExecutorAddress(String executorAddress) {
        this.executorAddress = executorAddress;
    }

    public String getExecutorHandler() {
        return executorHandler;
    }

    public void setExecutorHandler(String executorHandler) {
        this.executorHandler = executorHandler;
    }

    public String getExecutorParam() {
        return executorParam;
    }

    public void setExecutorParam(String executorParam) {
        this.executorParam = executorParam;
    }

    public String getExecutorShardingParam() {
        return executorShardingParam;
    }

    public void setExecutorShardingParam(String executorShardingParam) {
        this.executorShardingParam = executorShardingParam;
    }

    public int getExecutorFailRetryCount() {
        return executorFailRetryCount;
    }

    public void setExecutorFailRetryCount(int executorFailRetryCount) {
        this.executorFailRetryCount = executorFailRetryCount;
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public int getTriggerCode() {
        return triggerCode;
    }

    public void setTriggerCode(int triggerCode) {
        this.triggerCode = triggerCode;
    }

    public String getTriggerMsg() {
        return triggerMsg;
    }

    public void setTriggerMsg(String triggerMsg) {
        this.triggerMsg = triggerMsg;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public int getHandleCode() {
        return handleCode;
    }

    public void setHandleCode(int handleCode) {
        this.handleCode = handleCode;
    }

    public String getHandleMsg() {
        return handleMsg;
    }

    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg;
    }

    public int getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(int alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Long getMaxId() {
        return maxId;
    }

    public void setMaxId(Long maxId) {
        this.maxId = maxId;
    }
}
