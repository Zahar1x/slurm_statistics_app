package ru.zaharix.slurmstat.entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "txn_table", schema = "slurm_acct_db", catalog = "")
public class TxnTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "timestamp")
    private long timestamp;
    @Basic
    @Column(name = "action")
    private short action;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "actor")
    private Object actor;
    @Basic
    @Column(name = "cluster")
    private Object cluster;
    @Basic
    @Column(name = "info")
    private byte[] info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public short getAction() {
        return action;
    }

    public void setAction(short action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getActor() {
        return actor;
    }

    public void setActor(Object actor) {
        this.actor = actor;
    }

    public Object getCluster() {
        return cluster;
    }

    public void setCluster(Object cluster) {
        this.cluster = cluster;
    }

    public byte[] getInfo() {
        return info;
    }

    public void setInfo(byte[] info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TxnTableEntity that = (TxnTableEntity) o;

        if (id != that.id) return false;
        if (timestamp != that.timestamp) return false;
        if (action != that.action) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (actor != null ? !actor.equals(that.actor) : that.actor != null) return false;
        if (cluster != null ? !cluster.equals(that.cluster) : that.cluster != null) return false;
        if (!Arrays.equals(info, that.info)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
        result = 31 * result + (int) action;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (actor != null ? actor.hashCode() : 0);
        result = 31 * result + (cluster != null ? cluster.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(info);
        return result;
    }
}
