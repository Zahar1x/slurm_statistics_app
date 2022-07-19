package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusterSuspendTableEntityPK implements Serializable {
    @Column(name = "job_db_inx")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobDbInx;
    @Column(name = "time_start")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long timeStart;

    public long getJobDbInx() {
        return jobDbInx;
    }

    public void setJobDbInx(long jobDbInx) {
        this.jobDbInx = jobDbInx;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterSuspendTableEntityPK that = (ClusterSuspendTableEntityPK) o;

        if (jobDbInx != that.jobDbInx) return false;
        if (timeStart != that.timeStart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobDbInx ^ (jobDbInx >>> 32));
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        return result;
    }
}
