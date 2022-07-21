package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusResTableEntityPK implements Serializable {
    private String cluster;
    private int res_id;

    public Object getCluster() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusResTableEntityPK that = (ClusResTableEntityPK) o;

        if (res_id != that.res_id) return false;
        if (cluster != null ? !cluster.equals(that.cluster) : that.cluster != null) return false;

        return true;
    }
    public ClusResTableEntityPK() {}
    @Override
    public int hashCode() {
        int result = cluster != null ? cluster.hashCode() : 0;
        result = 31 * result + res_id;
        return result;
    }
}
