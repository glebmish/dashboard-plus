package com.baloise.confluence.dashboardplus.jenkins.bean;

import com.offbytwo.jenkins.model.BuildWithDetails;
import com.offbytwo.jenkins.model.JobWithDetails;
import com.offbytwo.jenkins.model.RobotReport;
import com.offbytwo.jenkins.model.TestReport;

public class JenkinsData {

	private JobWithDetails jobDetails;

	private BuildWithDetails lastCompletedBuildDetails;

	private TestReport lastCompletedBuildTestReport;

	private RobotReport lastCompletedBuildRobotReport;

	public JobWithDetails getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(JobWithDetails jobDetails) {
		this.jobDetails = jobDetails;
	}

	public BuildWithDetails getLastCompletedBuildDetails() {
		return lastCompletedBuildDetails;
	}

	public void setLastCompletedBuildDetails(
			BuildWithDetails lastCompletedBuildDetails) {
		this.lastCompletedBuildDetails = lastCompletedBuildDetails;
	}

	public TestReport getLastCompletedBuildTestReport() {
		return lastCompletedBuildTestReport;
	}

	public void setLastCompletedBuildTestReport(
			TestReport lastCompletedBuildTestReport) {
		this.lastCompletedBuildTestReport = lastCompletedBuildTestReport;
	}

	public RobotReport getLastCompletedBuildRobotReport() {
		return lastCompletedBuildRobotReport;
	}

	public void setLastCompletedBuildRobotReport(RobotReport lastCompletedBuildRobotReport) {
		this.lastCompletedBuildRobotReport = lastCompletedBuildRobotReport;
	}
}
