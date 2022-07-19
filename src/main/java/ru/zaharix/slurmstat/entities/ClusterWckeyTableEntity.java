package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_wckey_table", schema = "slurm_acct_db", catalog = "")
public class ClusterWckeyTableEntity {
    @Basic
    @Column(name = "creation_time")
    private long creationTime;
    @Basic
    @Column(name = "mod_time")
    private long modTime;
    @Basic
    @Column(name = "deleted")
    private byte deleted;
    @Basic
    @Column(name = "is_def")
    private byte isDef;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_wckey")
    private int idWckey;
    @Basic
    @Column(name = "wckey_name")
    private Object wckeyName;
    @Basic
    @Column(name = "user")
    private Object user;

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

    public byte getIsDef() {
        return isDef;
    }

    public void setIsDef(byte isDef) {
        this.isDef = isDef;
    }

    public int getIdWckey() {
        return idWckey;
    }

    public void setIdWckey(int idWckey) {
        this.idWckey = idWckey;
    }

    public Object getWckeyName() {
        return wckeyName;
    }

    public void setWckeyName(Object wckeyName) {
        this.wckeyName = wckeyName;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterWckeyTableEntity that = (ClusterWckeyTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (deleted != that.deleted) return false;
        if (isDef != that.isDef) return false;
        if (idWckey != that.idWckey) return false;
        if (wckeyName != null ? !wckeyName.equals(that.wckeyName) : that.wckeyName != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (int) deleted;
        result = 31 * result + (int) isDef;
        result = 31 * result + idWckey;
        result = 31 * result + (wckeyName != null ? wckeyName.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
