package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_step_table", schema = "slurm_acct_db", catalog = "")
@IdClass(ClusterStepTableEntityPK.class)
public class ClusterStepTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "job_db_inx")
    private long jobDbInx;
    @Basic
    @Column(name = "deleted")
    private byte deleted;
    @Basic
    @Column(name = "exit_code")
    private int exitCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_step")
    private int idStep;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "step_het_comp")
    private int stepHetComp;
    @Basic
    @Column(name = "kill_requid")
    private int killRequid;
    @Basic
    @Column(name = "nodelist")
    private String nodelist;
    @Basic
    @Column(name = "nodes_alloc")
    private int nodesAlloc;
    @Basic
    @Column(name = "node_inx")
    private String nodeInx;
    @Basic
    @Column(name = "state")
    private short state;
    @Basic
    @Column(name = "step_name")
    private String stepName;
    @Basic
    @Column(name = "task_cnt")
    private int taskCnt;
    @Basic
    @Column(name = "task_dist")
    private int taskDist;
    @Basic
    @Column(name = "time_start")
    private long timeStart;
    @Basic
    @Column(name = "time_end")
    private long timeEnd;
    @Basic
    @Column(name = "time_suspended")
    private long timeSuspended;
    @Basic
    @Column(name = "user_sec")
    private long userSec;
    @Basic
    @Column(name = "user_usec")
    private int userUsec;
    @Basic
    @Column(name = "sys_sec")
    private long sysSec;
    @Basic
    @Column(name = "sys_usec")
    private int sysUsec;
    @Basic
    @Column(name = "act_cpufreq")
    private Object actCpufreq;
    @Basic
    @Column(name = "consumed_energy")
    private long consumedEnergy;
    @Basic
    @Column(name = "container")
    private String container;
    @Basic
    @Column(name = "req_cpufreq_min")
    private int reqCpufreqMin;
    @Basic
    @Column(name = "req_cpufreq")
    private int reqCpufreq;
    @Basic
    @Column(name = "req_cpufreq_gov")
    private int reqCpufreqGov;
    @Basic
    @Column(name = "submit_line")
    private String submitLine;
    @Basic
    @Column(name = "tres_alloc")
    private String tresAlloc;
    @Basic
    @Column(name = "tres_usage_in_ave")
    private String tresUsageInAve;
    @Basic
    @Column(name = "tres_usage_in_max")
    private String tresUsageInMax;
    @Basic
    @Column(name = "tres_usage_in_max_taskid")
    private String tresUsageInMaxTaskid;
    @Basic
    @Column(name = "tres_usage_in_max_nodeid")
    private String tresUsageInMaxNodeid;
    @Basic
    @Column(name = "tres_usage_in_min")
    private String tresUsageInMin;
    @Basic
    @Column(name = "tres_usage_in_min_taskid")
    private String tresUsageInMinTaskid;
    @Basic
    @Column(name = "tres_usage_in_min_nodeid")
    private String tresUsageInMinNodeid;
    @Basic
    @Column(name = "tres_usage_in_tot")
    private String tresUsageInTot;
    @Basic
    @Column(name = "tres_usage_out_ave")
    private String tresUsageOutAve;
    @Basic
    @Column(name = "tres_usage_out_max")
    private String tresUsageOutMax;
    @Basic
    @Column(name = "tres_usage_out_max_taskid")
    private String tresUsageOutMaxTaskid;
    @Basic
    @Column(name = "tres_usage_out_max_nodeid")
    private String tresUsageOutMaxNodeid;
    @Basic
    @Column(name = "tres_usage_out_min")
    private String tresUsageOutMin;
    @Basic
    @Column(name = "tres_usage_out_min_taskid")
    private String tresUsageOutMinTaskid;
    @Basic
    @Column(name = "tres_usage_out_min_nodeid")
    private String tresUsageOutMinNodeid;
    @Basic
    @Column(name = "tres_usage_out_tot")
    private String tresUsageOutTot;

    public long getJobDbInx() {
        return jobDbInx;
    }

    public void setJobDbInx(long jobDbInx) {
        this.jobDbInx = jobDbInx;
    }

    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    public int getIdStep() {
        return idStep;
    }

    public void setIdStep(int idStep) {
        this.idStep = idStep;
    }

    public int getStepHetComp() {
        return stepHetComp;
    }

    public void setStepHetComp(int stepHetComp) {
        this.stepHetComp = stepHetComp;
    }

    public int getKillRequid() {
        return killRequid;
    }

    public void setKillRequid(int killRequid) {
        this.killRequid = killRequid;
    }

    public String getNodelist() {
        return nodelist;
    }

    public void setNodelist(String nodelist) {
        this.nodelist = nodelist;
    }

    public int getNodesAlloc() {
        return nodesAlloc;
    }

    public void setNodesAlloc(int nodesAlloc) {
        this.nodesAlloc = nodesAlloc;
    }

    public String getNodeInx() {
        return nodeInx;
    }

    public void setNodeInx(String nodeInx) {
        this.nodeInx = nodeInx;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public int getTaskCnt() {
        return taskCnt;
    }

    public void setTaskCnt(int taskCnt) {
        this.taskCnt = taskCnt;
    }

    public int getTaskDist() {
        return taskDist;
    }

    public void setTaskDist(int taskDist) {
        this.taskDist = taskDist;
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

    public long getTimeSuspended() {
        return timeSuspended;
    }

    public void setTimeSuspended(long timeSuspended) {
        this.timeSuspended = timeSuspended;
    }

    public long getUserSec() {
        return userSec;
    }

    public void setUserSec(long userSec) {
        this.userSec = userSec;
    }

    public int getUserUsec() {
        return userUsec;
    }

    public void setUserUsec(int userUsec) {
        this.userUsec = userUsec;
    }

    public long getSysSec() {
        return sysSec;
    }

    public void setSysSec(long sysSec) {
        this.sysSec = sysSec;
    }

    public int getSysUsec() {
        return sysUsec;
    }

    public void setSysUsec(int sysUsec) {
        this.sysUsec = sysUsec;
    }

    public Object getActCpufreq() {
        return actCpufreq;
    }

    public void setActCpufreq(Object actCpufreq) {
        this.actCpufreq = actCpufreq;
    }

    public long getConsumedEnergy() {
        return consumedEnergy;
    }

    public void setConsumedEnergy(long consumedEnergy) {
        this.consumedEnergy = consumedEnergy;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public int getReqCpufreqMin() {
        return reqCpufreqMin;
    }

    public void setReqCpufreqMin(int reqCpufreqMin) {
        this.reqCpufreqMin = reqCpufreqMin;
    }

    public int getReqCpufreq() {
        return reqCpufreq;
    }

    public void setReqCpufreq(int reqCpufreq) {
        this.reqCpufreq = reqCpufreq;
    }

    public int getReqCpufreqGov() {
        return reqCpufreqGov;
    }

    public void setReqCpufreqGov(int reqCpufreqGov) {
        this.reqCpufreqGov = reqCpufreqGov;
    }

    public String getSubmitLine() {
        return submitLine;
    }

    public void setSubmitLine(String submitLine) {
        this.submitLine = submitLine;
    }

    public String getTresAlloc() {
        return tresAlloc;
    }

    public void setTresAlloc(String tresAlloc) {
        this.tresAlloc = tresAlloc;
    }

    public String getTresUsageInAve() {
        return tresUsageInAve;
    }

    public void setTresUsageInAve(String tresUsageInAve) {
        this.tresUsageInAve = tresUsageInAve;
    }

    public String getTresUsageInMax() {
        return tresUsageInMax;
    }

    public void setTresUsageInMax(String tresUsageInMax) {
        this.tresUsageInMax = tresUsageInMax;
    }

    public String getTresUsageInMaxTaskid() {
        return tresUsageInMaxTaskid;
    }

    public void setTresUsageInMaxTaskid(String tresUsageInMaxTaskid) {
        this.tresUsageInMaxTaskid = tresUsageInMaxTaskid;
    }

    public String getTresUsageInMaxNodeid() {
        return tresUsageInMaxNodeid;
    }

    public void setTresUsageInMaxNodeid(String tresUsageInMaxNodeid) {
        this.tresUsageInMaxNodeid = tresUsageInMaxNodeid;
    }

    public String getTresUsageInMin() {
        return tresUsageInMin;
    }

    public void setTresUsageInMin(String tresUsageInMin) {
        this.tresUsageInMin = tresUsageInMin;
    }

    public String getTresUsageInMinTaskid() {
        return tresUsageInMinTaskid;
    }

    public void setTresUsageInMinTaskid(String tresUsageInMinTaskid) {
        this.tresUsageInMinTaskid = tresUsageInMinTaskid;
    }

    public String getTresUsageInMinNodeid() {
        return tresUsageInMinNodeid;
    }

    public void setTresUsageInMinNodeid(String tresUsageInMinNodeid) {
        this.tresUsageInMinNodeid = tresUsageInMinNodeid;
    }

    public String getTresUsageInTot() {
        return tresUsageInTot;
    }

    public void setTresUsageInTot(String tresUsageInTot) {
        this.tresUsageInTot = tresUsageInTot;
    }

    public String getTresUsageOutAve() {
        return tresUsageOutAve;
    }

    public void setTresUsageOutAve(String tresUsageOutAve) {
        this.tresUsageOutAve = tresUsageOutAve;
    }

    public String getTresUsageOutMax() {
        return tresUsageOutMax;
    }

    public void setTresUsageOutMax(String tresUsageOutMax) {
        this.tresUsageOutMax = tresUsageOutMax;
    }

    public String getTresUsageOutMaxTaskid() {
        return tresUsageOutMaxTaskid;
    }

    public void setTresUsageOutMaxTaskid(String tresUsageOutMaxTaskid) {
        this.tresUsageOutMaxTaskid = tresUsageOutMaxTaskid;
    }

    public String getTresUsageOutMaxNodeid() {
        return tresUsageOutMaxNodeid;
    }

    public void setTresUsageOutMaxNodeid(String tresUsageOutMaxNodeid) {
        this.tresUsageOutMaxNodeid = tresUsageOutMaxNodeid;
    }

    public String getTresUsageOutMin() {
        return tresUsageOutMin;
    }

    public void setTresUsageOutMin(String tresUsageOutMin) {
        this.tresUsageOutMin = tresUsageOutMin;
    }

    public String getTresUsageOutMinTaskid() {
        return tresUsageOutMinTaskid;
    }

    public void setTresUsageOutMinTaskid(String tresUsageOutMinTaskid) {
        this.tresUsageOutMinTaskid = tresUsageOutMinTaskid;
    }

    public String getTresUsageOutMinNodeid() {
        return tresUsageOutMinNodeid;
    }

    public void setTresUsageOutMinNodeid(String tresUsageOutMinNodeid) {
        this.tresUsageOutMinNodeid = tresUsageOutMinNodeid;
    }

    public String getTresUsageOutTot() {
        return tresUsageOutTot;
    }

    public void setTresUsageOutTot(String tresUsageOutTot) {
        this.tresUsageOutTot = tresUsageOutTot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterStepTableEntity that = (ClusterStepTableEntity) o;

        if (jobDbInx != that.jobDbInx) return false;
        if (deleted != that.deleted) return false;
        if (exitCode != that.exitCode) return false;
        if (idStep != that.idStep) return false;
        if (stepHetComp != that.stepHetComp) return false;
        if (killRequid != that.killRequid) return false;
        if (nodesAlloc != that.nodesAlloc) return false;
        if (state != that.state) return false;
        if (taskCnt != that.taskCnt) return false;
        if (taskDist != that.taskDist) return false;
        if (timeStart != that.timeStart) return false;
        if (timeEnd != that.timeEnd) return false;
        if (timeSuspended != that.timeSuspended) return false;
        if (userSec != that.userSec) return false;
        if (userUsec != that.userUsec) return false;
        if (sysSec != that.sysSec) return false;
        if (sysUsec != that.sysUsec) return false;
        if (consumedEnergy != that.consumedEnergy) return false;
        if (reqCpufreqMin != that.reqCpufreqMin) return false;
        if (reqCpufreq != that.reqCpufreq) return false;
        if (reqCpufreqGov != that.reqCpufreqGov) return false;
        if (nodelist != null ? !nodelist.equals(that.nodelist) : that.nodelist != null) return false;
        if (nodeInx != null ? !nodeInx.equals(that.nodeInx) : that.nodeInx != null) return false;
        if (stepName != null ? !stepName.equals(that.stepName) : that.stepName != null) return false;
        if (actCpufreq != null ? !actCpufreq.equals(that.actCpufreq) : that.actCpufreq != null) return false;
        if (container != null ? !container.equals(that.container) : that.container != null) return false;
        if (submitLine != null ? !submitLine.equals(that.submitLine) : that.submitLine != null) return false;
        if (tresAlloc != null ? !tresAlloc.equals(that.tresAlloc) : that.tresAlloc != null) return false;
        if (tresUsageInAve != null ? !tresUsageInAve.equals(that.tresUsageInAve) : that.tresUsageInAve != null)
            return false;
        if (tresUsageInMax != null ? !tresUsageInMax.equals(that.tresUsageInMax) : that.tresUsageInMax != null)
            return false;
        if (tresUsageInMaxTaskid != null ? !tresUsageInMaxTaskid.equals(that.tresUsageInMaxTaskid) : that.tresUsageInMaxTaskid != null)
            return false;
        if (tresUsageInMaxNodeid != null ? !tresUsageInMaxNodeid.equals(that.tresUsageInMaxNodeid) : that.tresUsageInMaxNodeid != null)
            return false;
        if (tresUsageInMin != null ? !tresUsageInMin.equals(that.tresUsageInMin) : that.tresUsageInMin != null)
            return false;
        if (tresUsageInMinTaskid != null ? !tresUsageInMinTaskid.equals(that.tresUsageInMinTaskid) : that.tresUsageInMinTaskid != null)
            return false;
        if (tresUsageInMinNodeid != null ? !tresUsageInMinNodeid.equals(that.tresUsageInMinNodeid) : that.tresUsageInMinNodeid != null)
            return false;
        if (tresUsageInTot != null ? !tresUsageInTot.equals(that.tresUsageInTot) : that.tresUsageInTot != null)
            return false;
        if (tresUsageOutAve != null ? !tresUsageOutAve.equals(that.tresUsageOutAve) : that.tresUsageOutAve != null)
            return false;
        if (tresUsageOutMax != null ? !tresUsageOutMax.equals(that.tresUsageOutMax) : that.tresUsageOutMax != null)
            return false;
        if (tresUsageOutMaxTaskid != null ? !tresUsageOutMaxTaskid.equals(that.tresUsageOutMaxTaskid) : that.tresUsageOutMaxTaskid != null)
            return false;
        if (tresUsageOutMaxNodeid != null ? !tresUsageOutMaxNodeid.equals(that.tresUsageOutMaxNodeid) : that.tresUsageOutMaxNodeid != null)
            return false;
        if (tresUsageOutMin != null ? !tresUsageOutMin.equals(that.tresUsageOutMin) : that.tresUsageOutMin != null)
            return false;
        if (tresUsageOutMinTaskid != null ? !tresUsageOutMinTaskid.equals(that.tresUsageOutMinTaskid) : that.tresUsageOutMinTaskid != null)
            return false;
        if (tresUsageOutMinNodeid != null ? !tresUsageOutMinNodeid.equals(that.tresUsageOutMinNodeid) : that.tresUsageOutMinNodeid != null)
            return false;
        if (tresUsageOutTot != null ? !tresUsageOutTot.equals(that.tresUsageOutTot) : that.tresUsageOutTot != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobDbInx ^ (jobDbInx >>> 32));
        result = 31 * result + (int) deleted;
        result = 31 * result + exitCode;
        result = 31 * result + idStep;
        result = 31 * result + stepHetComp;
        result = 31 * result + killRequid;
        result = 31 * result + (nodelist != null ? nodelist.hashCode() : 0);
        result = 31 * result + nodesAlloc;
        result = 31 * result + (nodeInx != null ? nodeInx.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + (stepName != null ? stepName.hashCode() : 0);
        result = 31 * result + taskCnt;
        result = 31 * result + taskDist;
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (timeEnd ^ (timeEnd >>> 32));
        result = 31 * result + (int) (timeSuspended ^ (timeSuspended >>> 32));
        result = 31 * result + (int) (userSec ^ (userSec >>> 32));
        result = 31 * result + userUsec;
        result = 31 * result + (int) (sysSec ^ (sysSec >>> 32));
        result = 31 * result + sysUsec;
        result = 31 * result + (actCpufreq != null ? actCpufreq.hashCode() : 0);
        result = 31 * result + (int) (consumedEnergy ^ (consumedEnergy >>> 32));
        result = 31 * result + (container != null ? container.hashCode() : 0);
        result = 31 * result + reqCpufreqMin;
        result = 31 * result + reqCpufreq;
        result = 31 * result + reqCpufreqGov;
        result = 31 * result + (submitLine != null ? submitLine.hashCode() : 0);
        result = 31 * result + (tresAlloc != null ? tresAlloc.hashCode() : 0);
        result = 31 * result + (tresUsageInAve != null ? tresUsageInAve.hashCode() : 0);
        result = 31 * result + (tresUsageInMax != null ? tresUsageInMax.hashCode() : 0);
        result = 31 * result + (tresUsageInMaxTaskid != null ? tresUsageInMaxTaskid.hashCode() : 0);
        result = 31 * result + (tresUsageInMaxNodeid != null ? tresUsageInMaxNodeid.hashCode() : 0);
        result = 31 * result + (tresUsageInMin != null ? tresUsageInMin.hashCode() : 0);
        result = 31 * result + (tresUsageInMinTaskid != null ? tresUsageInMinTaskid.hashCode() : 0);
        result = 31 * result + (tresUsageInMinNodeid != null ? tresUsageInMinNodeid.hashCode() : 0);
        result = 31 * result + (tresUsageInTot != null ? tresUsageInTot.hashCode() : 0);
        result = 31 * result + (tresUsageOutAve != null ? tresUsageOutAve.hashCode() : 0);
        result = 31 * result + (tresUsageOutMax != null ? tresUsageOutMax.hashCode() : 0);
        result = 31 * result + (tresUsageOutMaxTaskid != null ? tresUsageOutMaxTaskid.hashCode() : 0);
        result = 31 * result + (tresUsageOutMaxNodeid != null ? tresUsageOutMaxNodeid.hashCode() : 0);
        result = 31 * result + (tresUsageOutMin != null ? tresUsageOutMin.hashCode() : 0);
        result = 31 * result + (tresUsageOutMinTaskid != null ? tresUsageOutMinTaskid.hashCode() : 0);
        result = 31 * result + (tresUsageOutMinNodeid != null ? tresUsageOutMinNodeid.hashCode() : 0);
        result = 31 * result + (tresUsageOutTot != null ? tresUsageOutTot.hashCode() : 0);
        return result;
    }
}
