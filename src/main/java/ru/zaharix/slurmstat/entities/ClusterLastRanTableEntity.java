package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_last_ran_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterLastRanTableEntityPK.class)
public class ClusterLastRanTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "hourly_rollup")
    private long hourlyRollup;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "daily_rollup")
    private long dailyRollup;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "monthly_rollup")
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

        ClusterLastRanTableEntity that = (ClusterLastRanTableEntity) o;

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
