package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusResTableEntityPK implements Serializable {
    @Column(name = "cluster")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Object cluster;
    @Column(name = "res_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resId;

    public Object getCluster() {
        return cluster;
    }

    public void setCluster(Object cluster) {
        this.cluster = cluster;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusResTableEntityPK that = (ClusResTableEntityPK) o;

        if (resId != that.resId) return false;
        if (cluster != null ? !cluster.equals(that.cluster) : that.cluster != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cluster != null ? cluster.hashCode() : 0;
        result = 31 * result + resId;
        return result;
    }
}
