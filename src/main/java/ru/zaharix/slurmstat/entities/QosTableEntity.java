package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "qos_table", schema = "slurm_acct_db", catalog = "")
public class QosTableEntity {
    @Basic
    @Column(name = "creation_time")
    private long creationTime;
    @Basic
    @Column(name = "mod_time")
    private long modTime;
    @Basic
    @Column(name = "deleted")
    private Byte deleted;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "flags")
    private Integer flags;
    @Basic
    @Column(name = "grace_time")
    private Integer graceTime;
    @Basic
    @Column(name = "max_jobs_pa")
    private Integer maxJobsPa;
    @Basic
    @Column(name = "max_jobs_per_user")
    private Integer maxJobsPerUser;
    @Basic
    @Column(name = "max_jobs_accrue_pa")
    private Integer maxJobsAccruePa;
    @Basic
    @Column(name = "max_jobs_accrue_pu")
    private Integer maxJobsAccruePu;
    @Basic
    @Column(name = "min_prio_thresh")
    private Integer minPrioThresh;
    @Basic
    @Column(name = "max_submit_jobs_pa")
    private Integer maxSubmitJobsPa;
    @Basic
    @Column(name = "max_submit_jobs_per_user")
    private Integer maxSubmitJobsPerUser;
    @Basic
    @Column(name = "max_tres_pa")
    private String maxTresPa;
    @Basic
    @Column(name = "max_tres_pj")
    private String maxTresPj;
    @Basic
    @Column(name = "max_tres_pn")
    private String maxTresPn;
    @Basic
    @Column(name = "max_tres_pu")
    private String maxTresPu;
    @Basic
    @Column(name = "max_tres_mins_pj")
    private String maxTresMinsPj;
    @Basic
    @Column(name = "max_tres_run_mins_pa")
    private String maxTresRunMinsPa;
    @Basic
    @Column(name = "max_tres_run_mins_pu")
    private String maxTresRunMinsPu;
    @Basic
    @Column(name = "min_tres_pj")
    private String minTresPj;
    @Basic
    @Column(name = "max_wall_duration_per_job")
    private Integer maxWallDurationPerJob;
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
    @Column(name = "preempt")
    private String preempt;
    @Basic
    @Column(name = "preempt_mode")
    private Integer preemptMode;
    @Basic
    @Column(name = "preempt_exempt_time")
    private Integer preemptExemptTime;
    @Basic
    @Column(name = "priority")
    private Integer priority;
    @Basic
    @Column(name = "usage_factor")
    private double usageFactor;
    @Basic
    @Column(name = "usage_thres")
    private Double usageThres;
    @Basic
    @Column(name = "limit_factor")
    private Double limitFactor;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getGraceTime() {
        return graceTime;
    }

    public void setGraceTime(Integer graceTime) {
        this.graceTime = graceTime;
    }

    public Integer getMaxJobsPa() {
        return maxJobsPa;
    }

    public void setMaxJobsPa(Integer maxJobsPa) {
        this.maxJobsPa = maxJobsPa;
    }

    public Integer getMaxJobsPerUser() {
        return maxJobsPerUser;
    }

    public void setMaxJobsPerUser(Integer maxJobsPerUser) {
        this.maxJobsPerUser = maxJobsPerUser;
    }

    public Integer getMaxJobsAccruePa() {
        return maxJobsAccruePa;
    }

    public void setMaxJobsAccruePa(Integer maxJobsAccruePa) {
        this.maxJobsAccruePa = maxJobsAccruePa;
    }

    public Integer getMaxJobsAccruePu() {
        return maxJobsAccruePu;
    }

    public void setMaxJobsAccruePu(Integer maxJobsAccruePu) {
        this.maxJobsAccruePu = maxJobsAccruePu;
    }

    public Integer getMinPrioThresh() {
        return minPrioThresh;
    }

    public void setMinPrioThresh(Integer minPrioThresh) {
        this.minPrioThresh = minPrioThresh;
    }

    public Integer getMaxSubmitJobsPa() {
        return maxSubmitJobsPa;
    }

    public void setMaxSubmitJobsPa(Integer maxSubmitJobsPa) {
        this.maxSubmitJobsPa = maxSubmitJobsPa;
    }

    public Integer getMaxSubmitJobsPerUser() {
        return maxSubmitJobsPerUser;
    }

    public void setMaxSubmitJobsPerUser(Integer maxSubmitJobsPerUser) {
        this.maxSubmitJobsPerUser = maxSubmitJobsPerUser;
    }

    public String getMaxTresPa() {
        return maxTresPa;
    }

    public void setMaxTresPa(String maxTresPa) {
        this.maxTresPa = maxTresPa;
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

    public String getMaxTresPu() {
        return maxTresPu;
    }

    public void setMaxTresPu(String maxTresPu) {
        this.maxTresPu = maxTresPu;
    }

    public String getMaxTresMinsPj() {
        return maxTresMinsPj;
    }

    public void setMaxTresMinsPj(String maxTresMinsPj) {
        this.maxTresMinsPj = maxTresMinsPj;
    }

    public String getMaxTresRunMinsPa() {
        return maxTresRunMinsPa;
    }

    public void setMaxTresRunMinsPa(String maxTresRunMinsPa) {
        this.maxTresRunMinsPa = maxTresRunMinsPa;
    }

    public String getMaxTresRunMinsPu() {
        return maxTresRunMinsPu;
    }

    public void setMaxTresRunMinsPu(String maxTresRunMinsPu) {
        this.maxTresRunMinsPu = maxTresRunMinsPu;
    }

    public String getMinTresPj() {
        return minTresPj;
    }

    public void setMinTresPj(String minTresPj) {
        this.minTresPj = minTresPj;
    }

    public Integer getMaxWallDurationPerJob() {
        return maxWallDurationPerJob;
    }

    public void setMaxWallDurationPerJob(Integer maxWallDurationPerJob) {
        this.maxWallDurationPerJob = maxWallDurationPerJob;
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

    public String getPreempt() {
        return preempt;
    }

    public void setPreempt(String preempt) {
        this.preempt = preempt;
    }

    public Integer getPreemptMode() {
        return preemptMode;
    }

    public void setPreemptMode(Integer preemptMode) {
        this.preemptMode = preemptMode;
    }

    public Integer getPreemptExemptTime() {
        return preemptExemptTime;
    }

    public void setPreemptExemptTime(Integer preemptExemptTime) {
        this.preemptExemptTime = preemptExemptTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public double getUsageFactor() {
        return usageFactor;
    }

    public void setUsageFactor(double usageFactor) {
        this.usageFactor = usageFactor;
    }

    public Double getUsageThres() {
        return usageThres;
    }

    public void setUsageThres(Double usageThres) {
        this.usageThres = usageThres;
    }

    public Double getLimitFactor() {
        return limitFactor;
    }

    public void setLimitFactor(Double limitFactor) {
        this.limitFactor = limitFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QosTableEntity that = (QosTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (id != that.id) return false;
        if (Double.compare(that.usageFactor, usageFactor) != 0) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (flags != null ? !flags.equals(that.flags) : that.flags != null) return false;
        if (graceTime != null ? !graceTime.equals(that.graceTime) : that.graceTime != null) return false;
        if (maxJobsPa != null ? !maxJobsPa.equals(that.maxJobsPa) : that.maxJobsPa != null) return false;
        if (maxJobsPerUser != null ? !maxJobsPerUser.equals(that.maxJobsPerUser) : that.maxJobsPerUser != null)
            return false;
        if (maxJobsAccruePa != null ? !maxJobsAccruePa.equals(that.maxJobsAccruePa) : that.maxJobsAccruePa != null)
            return false;
        if (maxJobsAccruePu != null ? !maxJobsAccruePu.equals(that.maxJobsAccruePu) : that.maxJobsAccruePu != null)
            return false;
        if (minPrioThresh != null ? !minPrioThresh.equals(that.minPrioThresh) : that.minPrioThresh != null)
            return false;
        if (maxSubmitJobsPa != null ? !maxSubmitJobsPa.equals(that.maxSubmitJobsPa) : that.maxSubmitJobsPa != null)
            return false;
        if (maxSubmitJobsPerUser != null ? !maxSubmitJobsPerUser.equals(that.maxSubmitJobsPerUser) : that.maxSubmitJobsPerUser != null)
            return false;
        if (maxTresPa != null ? !maxTresPa.equals(that.maxTresPa) : that.maxTresPa != null) return false;
        if (maxTresPj != null ? !maxTresPj.equals(that.maxTresPj) : that.maxTresPj != null) return false;
        if (maxTresPn != null ? !maxTresPn.equals(that.maxTresPn) : that.maxTresPn != null) return false;
        if (maxTresPu != null ? !maxTresPu.equals(that.maxTresPu) : that.maxTresPu != null) return false;
        if (maxTresMinsPj != null ? !maxTresMinsPj.equals(that.maxTresMinsPj) : that.maxTresMinsPj != null)
            return false;
        if (maxTresRunMinsPa != null ? !maxTresRunMinsPa.equals(that.maxTresRunMinsPa) : that.maxTresRunMinsPa != null)
            return false;
        if (maxTresRunMinsPu != null ? !maxTresRunMinsPu.equals(that.maxTresRunMinsPu) : that.maxTresRunMinsPu != null)
            return false;
        if (minTresPj != null ? !minTresPj.equals(that.minTresPj) : that.minTresPj != null) return false;
        if (maxWallDurationPerJob != null ? !maxWallDurationPerJob.equals(that.maxWallDurationPerJob) : that.maxWallDurationPerJob != null)
            return false;
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
        if (preempt != null ? !preempt.equals(that.preempt) : that.preempt != null) return false;
        if (preemptMode != null ? !preemptMode.equals(that.preemptMode) : that.preemptMode != null) return false;
        if (preemptExemptTime != null ? !preemptExemptTime.equals(that.preemptExemptTime) : that.preemptExemptTime != null)
            return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (usageThres != null ? !usageThres.equals(that.usageThres) : that.usageThres != null) return false;
        if (limitFactor != null ? !limitFactor.equals(that.limitFactor) : that.limitFactor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (flags != null ? flags.hashCode() : 0);
        result = 31 * result + (graceTime != null ? graceTime.hashCode() : 0);
        result = 31 * result + (maxJobsPa != null ? maxJobsPa.hashCode() : 0);
        result = 31 * result + (maxJobsPerUser != null ? maxJobsPerUser.hashCode() : 0);
        result = 31 * result + (maxJobsAccruePa != null ? maxJobsAccruePa.hashCode() : 0);
        result = 31 * result + (maxJobsAccruePu != null ? maxJobsAccruePu.hashCode() : 0);
        result = 31 * result + (minPrioThresh != null ? minPrioThresh.hashCode() : 0);
        result = 31 * result + (maxSubmitJobsPa != null ? maxSubmitJobsPa.hashCode() : 0);
        result = 31 * result + (maxSubmitJobsPerUser != null ? maxSubmitJobsPerUser.hashCode() : 0);
        result = 31 * result + (maxTresPa != null ? maxTresPa.hashCode() : 0);
        result = 31 * result + (maxTresPj != null ? maxTresPj.hashCode() : 0);
        result = 31 * result + (maxTresPn != null ? maxTresPn.hashCode() : 0);
        result = 31 * result + (maxTresPu != null ? maxTresPu.hashCode() : 0);
        result = 31 * result + (maxTresMinsPj != null ? maxTresMinsPj.hashCode() : 0);
        result = 31 * result + (maxTresRunMinsPa != null ? maxTresRunMinsPa.hashCode() : 0);
        result = 31 * result + (maxTresRunMinsPu != null ? maxTresRunMinsPu.hashCode() : 0);
        result = 31 * result + (minTresPj != null ? minTresPj.hashCode() : 0);
        result = 31 * result + (maxWallDurationPerJob != null ? maxWallDurationPerJob.hashCode() : 0);
        result = 31 * result + (grpJobs != null ? grpJobs.hashCode() : 0);
        result = 31 * result + (grpJobsAccrue != null ? grpJobsAccrue.hashCode() : 0);
        result = 31 * result + (grpSubmitJobs != null ? grpSubmitJobs.hashCode() : 0);
        result = 31 * result + (grpTres != null ? grpTres.hashCode() : 0);
        result = 31 * result + (grpTresMins != null ? grpTresMins.hashCode() : 0);
        result = 31 * result + (grpTresRunMins != null ? grpTresRunMins.hashCode() : 0);
        result = 31 * result + (grpWall != null ? grpWall.hashCode() : 0);
        result = 31 * result + (preempt != null ? preempt.hashCode() : 0);
        result = 31 * result + (preemptMode != null ? preemptMode.hashCode() : 0);
        result = 31 * result + (preemptExemptTime != null ? preemptExemptTime.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        temp = Double.doubleToLongBits(usageFactor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (usageThres != null ? usageThres.hashCode() : 0);
        result = 31 * result + (limitFactor != null ? limitFactor.hashCode() : 0);
        return result;
    }
}
