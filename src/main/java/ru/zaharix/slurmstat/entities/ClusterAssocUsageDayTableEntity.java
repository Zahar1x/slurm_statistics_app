package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_assoc_usage_day_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterAssocUsageDayTableEntityPK.class)
public class ClusterAssocUsageDayTableEntity {
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
    @Column(name = "id")
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tres")
    private int idTres;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "time_start")
    private long timeStart;
    @Basic
    @Column(name = "alloc_secs")
    private long allocSecs;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getAllocSecs() {
        return allocSecs;
    }

    public void setAllocSecs(long allocSecs) {
        this.allocSecs = allocSecs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterAssocUsageDayTableEntity that = (ClusterAssocUsageDayTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (deleted != that.deleted) return false;
        if (id != that.id) return false;
        if (idTres != that.idTres) return false;
        if (timeStart != that.timeStart) return false;
        if (allocSecs != that.allocSecs) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (int) deleted;
        result = 31 * result + id;
        result = 31 * result + idTres;
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (allocSecs ^ (allocSecs >>> 32));
        return result;
    }
}
