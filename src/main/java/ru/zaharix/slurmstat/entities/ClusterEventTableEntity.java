package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_event_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterEventTableEntityPK.class)
public class ClusterEventTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "time_start")
    private long timeStart;
    @Basic
    @Column(name = "time_end")
    private long timeEnd;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "node_name")
    private String nodeName;
    @Basic
    @Column(name = "cluster_nodes")
    private String clusterNodes;
    @Basic
    @Column(name = "reason")
    private String reason;
    @Basic
    @Column(name = "reason_uid")
    private int reasonUid;
    @Basic
    @Column(name = "state")
    private int state;
    @Basic
    @Column(name = "tres")
    private String tres;

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

    public Object getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getClusterNodes() {
        return clusterNodes;
    }

    public void setClusterNodes(String clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getReasonUid() {
        return reasonUid;
    }

    public void setReasonUid(int reasonUid) {
        this.reasonUid = reasonUid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTres() {
        return tres;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterEventTableEntity that = (ClusterEventTableEntity) o;

        if (timeStart != that.timeStart) return false;
        if (timeEnd != that.timeEnd) return false;
        if (reasonUid != that.reasonUid) return false;
        if (state != that.state) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
        if (clusterNodes != null ? !clusterNodes.equals(that.clusterNodes) : that.clusterNodes != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (tres != null ? !tres.equals(that.tres) : that.tres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (timeEnd ^ (timeEnd >>> 32));
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        result = 31 * result + (clusterNodes != null ? clusterNodes.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + reasonUid;
        result = 31 * result + state;
        result = 31 * result + (tres != null ? tres.hashCode() : 0);
        return result;
    }
}
