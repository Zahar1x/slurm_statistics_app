package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusterEventTableEntityPK implements Serializable {
    @Column(name = "time_start")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long timeStart;
    @Column(name = "node_name")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Object nodeName;

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public Object getNodeName() {
        return nodeName;
    }

    public void setNodeName(Object nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterEventTableEntityPK that = (ClusterEventTableEntityPK) o;

        if (timeStart != that.timeStart) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        return result;
    }
}
