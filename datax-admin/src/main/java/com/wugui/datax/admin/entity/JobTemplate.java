package com.wugui.datax.admin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * xxl-job info
 *
 * @author jingwk  2019-11-17 14:25:49
 */
@Data
public class JobTemplate {

	@ApiModelProperty("主键ID")
	private int id;

	@ApiModelProperty("执行器主键ID")
	private int jobGroup;

	@ApiModelProperty("任务执行CRON表达式")
	private String jobCron;

	@ApiModelProperty("排序")
	private String jobDesc;

	private Date addTime;

	private Date updateTime;

	@ApiModelProperty("修改用户")
	private int userId;

	@ApiModelProperty("报警邮件")
	private String alarmEmail;

	@ApiModelProperty("执行器路由策略")
	private String executorRouteStrategy;

	@ApiModelProperty("执行器，任务Handler名称")
	private String executorHandler;

	@ApiModelProperty("执行器，任务参数")
	private String executorParam;

	@ApiModelProperty("阻塞处理策略")
	private String executorBlockStrategy;

	@ApiModelProperty("任务执行超时时间，单位秒")
	private int executorTimeout;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(int jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobCron() {
		return jobCron;
	}

	public void setJobCron(String jobCron) {
		this.jobCron = jobCron;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAlarmEmail() {
		return alarmEmail;
	}

	public void setAlarmEmail(String alarmEmail) {
		this.alarmEmail = alarmEmail;
	}

	public String getExecutorRouteStrategy() {
		return executorRouteStrategy;
	}

	public void setExecutorRouteStrategy(String executorRouteStrategy) {
		this.executorRouteStrategy = executorRouteStrategy;
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

	public String getExecutorBlockStrategy() {
		return executorBlockStrategy;
	}

	public void setExecutorBlockStrategy(String executorBlockStrategy) {
		this.executorBlockStrategy = executorBlockStrategy;
	}

	public int getExecutorTimeout() {
		return executorTimeout;
	}

	public void setExecutorTimeout(int executorTimeout) {
		this.executorTimeout = executorTimeout;
	}

	public int getExecutorFailRetryCount() {
		return executorFailRetryCount;
	}

	public void setExecutorFailRetryCount(int executorFailRetryCount) {
		this.executorFailRetryCount = executorFailRetryCount;
	}

	public String getGlueType() {
		return glueType;
	}

	public void setGlueType(String glueType) {
		this.glueType = glueType;
	}

	public String getGlueSource() {
		return glueSource;
	}

	public void setGlueSource(String glueSource) {
		this.glueSource = glueSource;
	}

	public String getGlueRemark() {
		return glueRemark;
	}

	public void setGlueRemark(String glueRemark) {
		this.glueRemark = glueRemark;
	}

	public Date getGlueUpdatetime() {
		return glueUpdatetime;
	}

	public void setGlueUpdatetime(Date glueUpdatetime) {
		this.glueUpdatetime = glueUpdatetime;
	}

	public String getChildJobId() {
		return childJobId;
	}

	public void setChildJobId(String childJobId) {
		this.childJobId = childJobId;
	}

	public long getTriggerLastTime() {
		return triggerLastTime;
	}

	public void setTriggerLastTime(long triggerLastTime) {
		this.triggerLastTime = triggerLastTime;
	}

	public long getTriggerNextTime() {
		return triggerNextTime;
	}

	public void setTriggerNextTime(long triggerNextTime) {
		this.triggerNextTime = triggerNextTime;
	}

	public String getJobJson() {
		return jobJson;
	}

	public void setJobJson(String jobJson) {
		this.jobJson = jobJson;
	}

	public String getJvmParam() {
		return jvmParam;
	}

	public void setJvmParam(String jvmParam) {
		this.jvmParam = jvmParam;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@ApiModelProperty("失败重试次数")
	private int executorFailRetryCount;

	@ApiModelProperty("GLUE类型\t#com.wugui.datatx.core.glue.GlueTypeEnum")
	private String glueType;

	@ApiModelProperty("GLUE源代码")
	private String glueSource;

	@ApiModelProperty("GLUE备注")
	private String glueRemark;

	@ApiModelProperty("GLUE更新时间")
	private Date glueUpdatetime;

	@ApiModelProperty("子任务ID")
	private String childJobId;

	@ApiModelProperty("上次调度时间")
	private long triggerLastTime;

	@ApiModelProperty("下次调度时间")
	private long triggerNextTime;

	@ApiModelProperty("datax运行json")
	private String jobJson;

	@ApiModelProperty("jvm参数")
	private String jvmParam;

    @ApiModelProperty("所属项目")
	private int projectId;

	@TableField(exist=false)
	private String projectName;

	@TableField(exist=false)
	private String userName;
}
