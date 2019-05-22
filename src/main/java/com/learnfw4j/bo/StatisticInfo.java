package com.learnfw4j.bo;

public class StatisticInfo {
    private float average;
    private float passRate;
    private float underSixty;
    private float sixtyToSeventy;
    private float seventyToEighty;
    private float eightToNinety;
    private float aboveNinety;

    public StatisticInfo() {
        average = 0;
        passRate = 0;
        underSixty = 0;
        sixtyToSeventy = 0;
        seventyToEighty = 0;
        eightToNinety = 0;
        aboveNinety = 0;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public float getPassRate() {
        return passRate;
    }

    public void setPassRate(float passRate) {
        this.passRate = passRate;
    }

    public float getUnderSixty() {
        return underSixty;
    }

    public void setUnderSixty(float underSixty) {
        this.underSixty = underSixty;
    }

    public float getSixtyToSeventy() {
        return sixtyToSeventy;
    }

    public void setSixtyToSeventy(float sixtyToSeventy) {
        this.sixtyToSeventy = sixtyToSeventy;
    }

    public float getSeventyToEighty() {
        return seventyToEighty;
    }

    public void setSeventyToEighty(float seventyToEighty) {
        this.seventyToEighty = seventyToEighty;
    }

    public float getEightToNinety() {
        return eightToNinety;
    }

    public void setEightToNinety(float eightToNinety) {
        this.eightToNinety = eightToNinety;
    }

    public float getAboveNinety() {
        return aboveNinety;
    }

    public void setAboveNinety(float aboveNinety) {
        this.aboveNinety = aboveNinety;
    }
}
