package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_usage_hour_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterUsageHourTableEntityPK.class)
public class ClusterUsageHourTableEntity {
    @Basic
    @Column(name = "creation_time")
    private long creationTime;
    @Basic
    @Column(name = "mod_time")
    private long modTime;
    @Basic
    @Column(name = "deleted")
    private byte deleted;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tres")
    private int idTres;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "time_start")
    private long timeStart;
    @Basic
    @Column(name = "count")
    private long count;
    @Basic
    @Column(name = "alloc_secs")
    private long allocSecs;
    @Basic
    @Column(name = "down_secs")
    private long downSecs;
    @Basic
    @Column(name = "pdown_secs")
    private long pdownSecs;
    @Basic
    @Column(name = "idle_secs")
    private long idleSecs;
    @Basic
    @Column(name = "plan_secs")
    private long planSecs;
    @Basic
    @Column(name = "over_secs")
    private long overSecs;

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getModTime() {
        return modTime;
    }

    public void setModTime(long modTime) {
        this.modTime = modTime;
    }

    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    public int getIdTres() {
        return idTres;
    }

    public void setIdTres(int idTres) {
        this.idTres = idTres;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getAllocSecs() {
        return allocSecs;
    }

    public void setAllocSecs(long allocSecs) {
        this.allocSecs = allocSecs;
    }

    public long getDownSecs() {
        return downSecs;
    }

    public void setDownSecs(long downSecs) {
        this.downSecs = downSecs;
    }

    public long getPdownSecs() {
        return pdownSecs;
    }

    public void setPdownSecs(long pdownSecs) {
        this.pdownSecs = pdownSecs;
    }

    public long getIdleSecs() {
        return idleSecs;
    }

    public void setIdleSecs(long idleSecs) {
        this.idleSecs = idleSecs;
    }

    public long getPlanSecs() {
        return planSecs;
    }

    public void setPlanSecs(long planSecs) {
        this.planSecs = planSecs;
    }

    public long getOverSecs() {
        return overSecs;
    }

    public void setOverSecs(long overSecs) {
        this.overSecs = overSecs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterUsageHourTableEntity that = (ClusterUsageHourTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (deleted != that.deleted) return false;
        if (idTres != that.idTres) return false;
        if (timeStart != that.timeStart) return false;
        if (count != that.count) return false;
        if (allocSecs != that.allocSecs) return false;
        if (downSecs != that.downSecs) return false;
        if (pdownSecs != that.pdownSecs) return false;
        if (idleSecs != that.idleSecs) return false;
        if (planSecs != that.planSecs) return false;
        if (overSecs != that.overSecs) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (int) deleted;
        result = 31 * result + idTres;
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (count ^ (count >>> 32));
        result = 31 * result + (int) (allocSecs ^ (allocSecs >>> 32));
        result = 31 * result + (int) (downSecs ^ (downSecs >>> 32));
        result = 31 * result + (int) (pdownSecs ^ (pdownSecs >>> 32));
        result = 31 * result + (int) (idleSecs ^ (idleSecs >>> 32));
        result = 31 * result + (int) (planSecs ^ (planSecs >>> 32));
        result = 31 * result + (int) (overSecs ^ (overSecs >>> 32));
        return result;
    }
}
