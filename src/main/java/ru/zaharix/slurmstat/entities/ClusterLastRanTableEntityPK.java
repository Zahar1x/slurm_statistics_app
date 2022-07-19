package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusterLastRanTableEntityPK implements Serializable {
    @Column(name = "hourly_rollup")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hourlyRollup;
    @Column(name = "daily_rollup")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dailyRollup;
    @Column(name = "monthly_rollup")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long monthlyRollup;

    public long getHourlyRollup() {
        return hourlyRollup;
    }

    public void setHourlyRollup(long hourlyRollup) {
        this.hourlyRollup = hourlyRollup;
    }

    public long getDailyRollup() {
        return dailyRollup;
    }

    public void setDailyRollup(long dailyRollup) {
        this.dailyRollup = dailyRollup;
    }

    public long getMonthlyRollup() {
        return monthlyRollup;
    }

    public void setMonthlyRollup(long monthlyRollup) {
        this.monthlyRollup = monthlyRollup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterLastRanTableEntityPK that = (ClusterLastRanTableEntityPK) o;

        if (hourlyRollup != that.hourlyRollup) return false;
        if (dailyRollup != that.dailyRollup) return false;
        if (monthlyRollup != that.monthlyRollup) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hourlyRollup ^ (hourlyRollup >>> 32));
        result = 31 * result + (int) (dailyRollup ^ (dailyRollup >>> 32));
        result = 31 * result + (int) (monthlyRollup ^ (monthlyRollup >>> 32));
        return result;
    }
}
