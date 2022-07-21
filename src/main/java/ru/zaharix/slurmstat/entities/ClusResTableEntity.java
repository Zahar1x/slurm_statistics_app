package ru.zaharix.slurmstat.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clus_res_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusResTableEntityPK.class)
public class ClusResTableEntity {
    @Basic
    @Column(name = "creation_time")
    private long creationTime;
    @Basic
    @Column(name = "mod_time")
    private long modTime;
    @Basic
    @Column(name = "deleted")
    private Byte deleted;
    @Column(name = "cluster")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cluster;
    @Column(name = "res_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int res_id;
    @Basic
    @Column(name = "percent_allowed")
    private Integer percentAllowed;

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

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public int getResId() {
        return res_id;
    }

    public void setResId(int resId) {
        this.res_id = resId;
    }

    public Integer getPercentAllowed() {
        return percentAllowed;
    }

    public void setPercentAllowed(Integer percentAllowed) {
        this.percentAllowed = percentAllowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusResTableEntity that = (ClusResTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (res_id != that.res_id) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (cluster != null ? !cluster.equals(that.cluster) : that.cluster != null) return false;
        if (percentAllowed != null ? !percentAllowed.equals(that.percentAllowed) : that.percentAllowed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (cluster != null ? cluster.hashCode() : 0);
        result = 31 * result + res_id;
        result = 31 * result + (percentAllowed != null ? percentAllowed.hashCode() : 0);
        return result;
    }
}
