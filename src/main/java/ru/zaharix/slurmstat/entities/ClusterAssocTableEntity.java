package ru.zaharix.slurmstat.entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "cluster_assoc_table", schema = "slurm_acct_db", catalog = "")
public class ClusterAssocTableEntity {
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
    @Column(name = "id_assoc")
    private int idAssoc;
    @Basic
    @Column(name = "user")
    private String user;
    @Basic
    @Column(name = "acct")
    private String acct;
    @Basic
    @Column(name = "partition")
    private String partition;
    @Basic
    @Column(name = "parent_acct")
    private String parentAcct;
    @Basic
    @Column(name = "lft")
    private int lft;
    @Basic
    @Column(name = "rgt")
    private int rgt;
    @Basic
    @Column(name = "shares")
    private int shares;
    @Basic
    @Column(name = "max_jobs")
    private Integer maxJobs;
    @Basic
    @Column(name = "max_jobs_accrue")
    private Integer maxJobsAccrue;
    @Basic
    @Column(name = "min_prio_thresh")
    private Integer minPrioThresh;
    @Basic
    @Column(name = "max_submit_jobs")
    private Integer maxSubmitJobs;
    @Basic
    @Column(name = "max_tres_pj")
    private String maxTresPj;
    @Basic
    @Column(name = "max_tres_pn")
    private String maxTresPn;
    @Basic
    @Column(name = "max_tres_mins_pj")
    private String maxTresMinsPj;
    @Basic
    @Column(name = "max_tres_run_mins")
    private String maxTresRunMins;
    @Basic
    @Column(name = "max_wall_pj")
    private Integer maxWallPj;
    @Basic
    @Column(name = "grp_jobs")
    private Integer grpJobs;
    @Basic
    @Column(name = "grp_jobs_accrue")
    private Integer grpJobsAccrue;
    @Basic
    @Column(name = "grp_submit_jobs")
    private Integer grpSubmitJobs;
    @Basic
    @Column(name = "grp_tres")
    private String grpTres;
    @Basic
    @Column(name = "grp_tres_mins")
    private String grpTresMins;
    @Basic
    @Column(name = "grp_tres_run_mins")
    private String grpTresRunMins;
    @Basic
    @Column(name = "grp_wall")
    private Integer grpWall;
    @Basic
    @Column(name = "priority")
    private Integer priority;
    @Basic
    @Column(name = "def_qos_id")
    private Integer defQosId;
    @Basic
    @Column(name = "qos")
    private byte[] qos;
    @Basic
    @Column(name = "delta_qos")
    private byte[] deltaQos;

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

    public int getIdAssoc() {
        return idAssoc;
    }

    public void setIdAssoc(int idAssoc) {
        this.idAssoc = idAssoc;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Object getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public Object getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public Object getParentAcct() {
        return parentAcct;
    }

    public void setParentAcct(String parentAcct) {
        this.parentAcct = parentAcct;
    }

    public int getLft() {
        return lft;
    }

    public void setLft(int lft) {
        this.lft = lft;
    }

    public int getRgt() {
        return rgt;
    }

    public void setRgt(int rgt) {
        this.rgt = rgt;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public Integer getMaxJobs() {
        return maxJobs;
    }

    public void setMaxJobs(Integer maxJobs) {
        this.maxJobs = maxJobs;
    }

    public Integer getMaxJobsAccrue() {
        return maxJobsAccrue;
    }

    public void setMaxJobsAccrue(Integer maxJobsAccrue) {
        this.maxJobsAccrue = maxJobsAccrue;
    }

    public Integer getMinPrioThresh() {
        return minPrioThresh;
    }

    public void setMinPrioThresh(Integer minPrioThresh) {
        this.minPrioThresh = minPrioThresh;
    }

    public Integer getMaxSubmitJobs() {
        return maxSubmitJobs;
    }

    public void setMaxSubmitJobs(Integer maxSubmitJobs) {
        this.maxSubmitJobs = maxSubmitJobs;
    }

    public String getMaxTresPj() {
        return maxTresPj;
    }

    public void setMaxTresPj(String maxTresPj) {
        this.maxTresPj = maxTresPj;
    }

    public String getMaxTresPn() {
        return maxTresPn;
    }

    public void setMaxTresPn(String maxTresPn) {
        this.maxTresPn = maxTresPn;
    }

    public String getMaxTresMinsPj() {
        return maxTresMinsPj;
    }

    public void setMaxTresMinsPj(String maxTresMinsPj) {
        this.maxTresMinsPj = maxTresMinsPj;
    }

    public String getMaxTresRunMins() {
        return maxTresRunMins;
    }

    public void setMaxTresRunMins(String maxTresRunMins) {
        this.maxTresRunMins = maxTresRunMins;
    }

    public Integer getMaxWallPj() {
        return maxWallPj;
    }

    public void setMaxWallPj(Integer maxWallPj) {
        this.maxWallPj = maxWallPj;
    }

    public Integer getGrpJobs() {
        return grpJobs;
    }

    public void setGrpJobs(Integer grpJobs) {
        this.grpJobs = grpJobs;
    }

    public Integer getGrpJobsAccrue() {
        return grpJobsAccrue;
    }

    public void setGrpJobsAccrue(Integer grpJobsAccrue) {
        this.grpJobsAccrue = grpJobsAccrue;
    }

    public Integer getGrpSubmitJobs() {
        return grpSubmitJobs;
    }

    public void setGrpSubmitJobs(Integer grpSubmitJobs) {
        this.grpSubmitJobs = grpSubmitJobs;
    }

    public String getGrpTres() {
        return grpTres;
    }

    public void setGrpTres(String grpTres) {
        this.grpTres = grpTres;
    }

    public String getGrpTresMins() {
        return grpTresMins;
    }

    public void setGrpTresMins(String grpTresMins) {
        this.grpTresMins = grpTresMins;
    }

    public String getGrpTresRunMins() {
        return grpTresRunMins;
    }

    public void setGrpTresRunMins(String grpTresRunMins) {
        this.grpTresRunMins = grpTresRunMins;
    }

    public Integer getGrpWall() {
        return grpWall;
    }

    public void setGrpWall(Integer grpWall) {
        this.grpWall = grpWall;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getDefQosId() {
        return defQosId;
    }

    public void setDefQosId(Integer defQosId) {
        this.defQosId = defQosId;
    }

    public byte[] getQos() {
        return qos;
    }

    public void setQos(byte[] qos) {
        this.qos = qos;
    }

    public byte[] getDeltaQos() {
        return deltaQos;
    }

    public void setDeltaQos(byte[] deltaQos) {
        this.deltaQos = deltaQos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterAssocTableEntity that = (ClusterAssocTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (deleted != that.deleted) return false;
        if (isDef != that.isDef) return false;
        if (idAssoc != that.idAssoc) return false;
        if (lft != that.lft) return false;
        if (rgt != that.rgt) return false;
        if (shares != that.shares) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (acct != null ? !acct.equals(that.acct) : that.acct != null) return false;
        if (partition != null ? !partition.equals(that.partition) : that.partition != null) return false;
        if (parentAcct != null ? !parentAcct.equals(that.parentAcct) : that.parentAcct != null) return false;
        if (maxJobs != null ? !maxJobs.equals(that.maxJobs) : that.maxJobs != null) return false;
        if (maxJobsAccrue != null ? !maxJobsAccrue.equals(that.maxJobsAccrue) : that.maxJobsAccrue != null)
            return false;
        if (minPrioThresh != null ? !minPrioThresh.equals(that.minPrioThresh) : that.minPrioThresh != null)
            return false;
        if (maxSubmitJobs != null ? !maxSubmitJobs.equals(that.maxSubmitJobs) : that.maxSubmitJobs != null)
            return false;
        if (maxTresPj != null ? !maxTresPj.equals(that.maxTresPj) : that.maxTresPj != null) return false;
        if (maxTresPn != null ? !maxTresPn.equals(that.maxTresPn) : that.maxTresPn != null) return false;
        if (maxTresMinsPj != null ? !maxTresMinsPj.equals(that.maxTresMinsPj) : that.maxTresMinsPj != null)
            return false;
        if (maxTresRunMins != null ? !maxTresRunMins.equals(that.maxTresRunMins) : that.maxTresRunMins != null)
            return false;
        if (maxWallPj != null ? !maxWallPj.equals(that.maxWallPj) : that.maxWallPj != null) return false;
        if (grpJobs != null ? !grpJobs.equals(that.grpJobs) : that.grpJobs != null) return false;
        if (grpJobsAccrue != null ? !grpJobsAccrue.equals(that.grpJobsAccrue) : that.grpJobsAccrue != null)
            return false;
        if (grpSubmitJobs != null ? !grpSubmitJobs.equals(that.grpSubmitJobs) : that.grpSubmitJobs != null)
            return false;
        if (grpTres != null ? !grpTres.equals(that.grpTres) : that.grpTres != null) return false;
        if (grpTresMins != null ? !grpTresMins.equals(that.grpTresMins) : that.grpTresMins != null) return false;
        if (grpTresRunMins != null ? !grpTresRunMins.equals(that.grpTresRunMins) : that.grpTresRunMins != null)
            return false;
        if (grpWall != null ? !grpWall.equals(that.grpWall) : that.grpWall != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (defQosId != null ? !defQosId.equals(that.defQosId) : that.defQosId != null) return false;
        if (!Arrays.equals(qos, that.qos)) return false;
        if (!Arrays.equals(deltaQos, that.deltaQos)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (int) deleted;
        result = 31 * result + (int) isDef;
        result = 31 * result + idAssoc;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (acct != null ? acct.hashCode() : 0);
        result = 31 * result + (partition != null ? partition.hashCode() : 0);
        result = 31 * result + (parentAcct != null ? parentAcct.hashCode() : 0);
        result = 31 * result + lft;
        result = 31 * result + rgt;
        result = 31 * result + shares;
        result = 31 * result + (maxJobs != null ? maxJobs.hashCode() : 0);
        result = 31 * result + (maxJobsAccrue != null ? maxJobsAccrue.hashCode() : 0);
        result = 31 * result + (minPrioThresh != null ? minPrioThresh.hashCode() : 0);
        result = 31 * result + (maxSubmitJobs != null ? maxSubmitJobs.hashCode() : 0);
        result = 31 * result + (maxTresPj != null ? maxTresPj.hashCode() : 0);
        result = 31 * result + (maxTresPn != null ? maxTresPn.hashCode() : 0);
        result = 31 * result + (maxTresMinsPj != null ? maxTresMinsPj.hashCode() : 0);
        result = 31 * result + (maxTresRunMins != null ? maxTresRunMins.hashCode() : 0);
        result = 31 * result + (maxWallPj != null ? maxWallPj.hashCode() : 0);
        result = 31 * result + (grpJobs != null ? grpJobs.hashCode() : 0);
        result = 31 * result + (grpJobsAccrue != null ? grpJobsAccrue.hashCode() : 0);
        result = 31 * result + (grpSubmitJobs != null ? grpSubmitJobs.hashCode() : 0);
        result = 31 * result + (grpTres != null ? grpTres.hashCode() : 0);
        result = 31 * result + (grpTresMins != null ? grpTresMins.hashCode() : 0);
        result = 31 * result + (grpTresRunMins != null ? grpTresRunMins.hashCode() : 0);
        result = 31 * result + (grpWall != null ? grpWall.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (defQosId != null ? defQosId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(qos);
        result = 31 * result + Arrays.hashCode(deltaQos);
        return result;
    }
}
