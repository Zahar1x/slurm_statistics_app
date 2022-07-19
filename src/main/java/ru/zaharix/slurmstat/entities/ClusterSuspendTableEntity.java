package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_suspend_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterSuspendTableEntityPK.class)
public class ClusterSuspendTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "job_db_inx")
    private long jobDbInx;
    @Basic
    @Column(name = "id_assoc")
    private int idAssoc;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "time_start")
    private long timeStart;
    @Basic
    @Column(name = "time_end")
    private long timeEnd;

    public long getJobDbInx() {
        return jobDbInx;
    }

    public void setJobDbInx(long jobDbInx) {
        this.jobDbInx = jobDbInx;
    }

    public int getIdAssoc() {
        return idAssoc;
    }

    public void setIdAssoc(int idAssoc) {
        this.idAssoc = idAssoc;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public long getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterSuspendTableEntity that = (ClusterSuspendTableEntity) o;

        if (jobDbInx != that.jobDbInx) return false;
        if (idAssoc != that.idAssoc) return false;
        if (timeStart != that.timeStart) return false;
        if (timeEnd != that.timeEnd) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobDbInx ^ (jobDbInx >>> 32));
        result = 31 * result + idAssoc;
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (timeEnd ^ (timeEnd >>> 32));
        return result;
    }
}
