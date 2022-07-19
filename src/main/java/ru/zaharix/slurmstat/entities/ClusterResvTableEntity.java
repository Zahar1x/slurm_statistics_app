package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_resv_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterResvTableEntityPK.class)
public class ClusterResvTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_resv")
    private int idResv;
    @Basic
    @Column(name = "deleted")
    private byte deleted;
    @Basic
    @Column(name = "assoclist")
    private String assoclist;
    @Basic
    @Column(name = "flags")
    private long flags;
    @Basic
    @Column(name = "nodelist")
    private String nodelist;
    @Basic
    @Column(name = "node_inx")
    private String nodeInx;
    @Basic
    @Column(name = "resv_name")
    private String resvName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "time_start")
    private long timeStart;
    @Basic
    @Column(name = "time_end")
    private long timeEnd;
    @Basic
    @Column(name = "tres")
    private String tres;
    @Basic
    @Column(name = "unused_wall")
    private Object unusedWall;

    public int getIdResv() {
        return idResv;
    }

    public void setIdResv(int idResv) {
        this.idResv = idResv;
    }

    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    public String getAssoclist() {
        return assoclist;
    }

    public void setAssoclist(String assoclist) {
        this.assoclist = assoclist;
    }

    public long getFlags() {
        return flags;
    }

    public void setFlags(long flags) {
        this.flags = flags;
    }

    public String getNodelist() {
        return nodelist;
    }

    public void setNodelist(String nodelist) {
        this.nodelist = nodelist;
    }

    public String getNodeInx() {
        return nodeInx;
    }

    public void setNodeInx(String nodeInx) {
        this.nodeInx = nodeInx;
    }

    public String getResvName() {
        return resvName;
    }

    public void setResvName(String resvName) {
        this.resvName = resvName;
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

    public String getTres() {
        return tres;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }

    public Object getUnusedWall() {
        return unusedWall;
    }

    public void setUnusedWall(Object unusedWall) {
        this.unusedWall = unusedWall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterResvTableEntity that = (ClusterResvTableEntity) o;

        if (idResv != that.idResv) return false;
        if (deleted != that.deleted) return false;
        if (flags != that.flags) return false;
        if (timeStart != that.timeStart) return false;
        if (timeEnd != that.timeEnd) return false;
        if (assoclist != null ? !assoclist.equals(that.assoclist) : that.assoclist != null) return false;
        if (nodelist != null ? !nodelist.equals(that.nodelist) : that.nodelist != null) return false;
        if (nodeInx != null ? !nodeInx.equals(that.nodeInx) : that.nodeInx != null) return false;
        if (resvName != null ? !resvName.equals(that.resvName) : that.resvName != null) return false;
        if (tres != null ? !tres.equals(that.tres) : that.tres != null) return false;
        if (unusedWall != null ? !unusedWall.equals(that.unusedWall) : that.unusedWall != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idResv;
        result = 31 * result + (int) deleted;
        result = 31 * result + (assoclist != null ? assoclist.hashCode() : 0);
        result = 31 * result + (int) (flags ^ (flags >>> 32));
        result = 31 * result + (nodelist != null ? nodelist.hashCode() : 0);
        result = 31 * result + (nodeInx != null ? nodeInx.hashCode() : 0);
        result = 31 * result + (resvName != null ? resvName.hashCode() : 0);
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (timeEnd ^ (timeEnd >>> 32));
        result = 31 * result + (tres != null ? tres.hashCode() : 0);
        result = 31 * result + (unusedWall != null ? unusedWall.hashCode() : 0);
        return result;
    }
}
