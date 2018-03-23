package com.offbytwo.jenkins.model;

public class RobotReport extends BaseModel {

    private int criticalFailed;
    private int criticalPassed;
    private int overallFailed;
    private int criticalTotal;
    private int overallPassed;
    private int overallTotal;

    public int getCriticalFailed() {
        return criticalFailed;
    }

    public void setCriticalFailed(int criticalFailed) {
        this.criticalFailed = criticalFailed;
    }

    public int getCriticalPassed() {
        return criticalPassed;
    }

    public void setCriticalPassed(int criticalPassed) {
        this.criticalPassed = criticalPassed;
    }

    public int getOverallFailed() {
        return overallFailed;
    }

    public void setOverallFailed(int overallFailed) {
        this.overallFailed = overallFailed;
    }

    public int getCriticalTotal() {
        return criticalTotal;
    }

    public void setCriticalTotal(int criticalTotal) {
        this.criticalTotal = criticalTotal;
    }

    public int getOverallPassed() {
        return overallPassed;
    }

    public void setOverallPassed(int overallPassed) {
        this.overallPassed = overallPassed;
    }

    public int getOverallTotal() {
        return overallTotal;
    }

    public void setOverallTotal(int overallTotal) {
        this.overallTotal = overallTotal;
    }
}
