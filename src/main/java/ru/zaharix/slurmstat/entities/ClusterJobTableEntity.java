package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_job_table", schema = "slurm_acct_db", catalog = "")
public class ClusterJobTableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "job_db_inx")
    private long jobDbInx;
    @Basic
    @Column(name = "mod_time")
    private long modTime;
    @Basic
    @Column(name = "deleted")
    private byte deleted;
    @Basic
    @Column(name = "account")
    private Object account;
    @Basic
    @Column(name = "admin_comment")
    private String adminComment;
    @Basic
    @Column(name = "array_task_str")
    private String arrayTaskStr;
    @Basic
    @Column(name = "array_max_tasks")
    private int arrayMaxTasks;
    @Basic
    @Column(name = "array_task_pending")
    private int arrayTaskPending;
    @Basic
    @Column(name = "batch_script")
    private String batchScript;
    @Basic
    @Column(name = "constraints")
    private String constraints;
    @Basic
    @Column(name = "container")
    private String container;
    @Basic
    @Column(name = "cpus_req")
    private int cpusReq;
    @Basic
    @Column(name = "derived_ec")
    private int derivedEc;
    @Basic
    @Column(name = "derived_es")
    private String derivedEs;
    @Basic
    @Column(name = "env_vars")
    private String envVars;
    @Basic
    @Column(name = "exit_code")
    private int exitCode;
    @Basic
    @Column(name = "flags")
    private int flags;
    @Basic
    @Column(name = "job_name")
    private Object jobName;
    @Basic
    @Column(name = "id_assoc")
    private int idAssoc;
    @Basic
    @Column(name = "id_array_job")
    private int idArrayJob;
    @Basic
    @Column(name = "id_array_task")
    private int idArrayTask;
    @Basic
    @Column(name = "id_block")
    private Object idBlock;
    @Basic
    @Column(name = "id_job")
    private int idJob;
    @Basic
    @Column(name = "id_qos")
    private int idQos;
    @Basic
    @Column(name = "id_resv")
    private int idResv;
    @Basic
    @Column(name = "id_wckey")
    private int idWckey;
    @Basic
    @Column(name = "id_user")
    private int idUser;
    @Basic
    @Column(name = "id_group")
    private int idGroup;
    @Basic
    @Column(name = "het_job_id")
    private int hetJobId;
    @Basic
    @Column(name = "het_job_offset")
    private int hetJobOffset;
    @Basic
    @Column(name = "kill_requid")
    private int killRequid;
    @Basic
    @Column(name = "state_reason_prev")
    private int stateReasonPrev;
    @Basic
    @Column(name = "mcs_label")
    private Object mcsLabel;
    @Basic
    @Column(name = "mem_req")
    private long memReq;
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
    @Column(name = "partition")
    private Object partition;
    @Basic
    @Column(name = "priority")
    private int priority;
    @Basic
    @Column(name = "state")
    private int state;
    @Basic
    @Column(name = "timelimit")
    private int timelimit;
    @Basic
    @Column(name = "time_submit")
    private long timeSubmit;
    @Basic
    @Column(name = "time_eligible")
    private long timeEligible;
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
    @Column(name = "gres_used")
    private String gresUsed;
    @Basic
    @Column(name = "wckey")
    private Object wckey;
    @Basic
    @Column(name = "work_dir")
    private String workDir;
    @Basic
    @Column(name = "submit_line")
    private String submitLine;
    @Basic
    @Column(name = "system_comment")
    private String systemComment;
    @Basic
    @Column(name = "track_steps")
    private byte trackSteps;
    @Basic
    @Column(name = "tres_alloc")
    private String tresAlloc;
    @Basic
    @Column(name = "tres_req")
    private String tresReq;

    public long getJobDbInx() {
        return jobDbInx;
    }

    public void setJobDbInx(long jobDbInx) {
        this.jobDbInx = jobDbInx;
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

    public Object getAccount() {
        return account;
    }

    public void setAccount(Object account) {
        this.account = account;
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

    public String getArrayTaskStr() {
        return arrayTaskStr;
    }

    public void setArrayTaskStr(String arrayTaskStr) {
        this.arrayTaskStr = arrayTaskStr;
    }

    public int getArrayMaxTasks() {
        return arrayMaxTasks;
    }

    public void setArrayMaxTasks(int arrayMaxTasks) {
        this.arrayMaxTasks = arrayMaxTasks;
    }

    public int getArrayTaskPending() {
        return arrayTaskPending;
    }

    public void setArrayTaskPending(int arrayTaskPending) {
        this.arrayTaskPending = arrayTaskPending;
    }

    public String getBatchScript() {
        return batchScript;
    }

    public void setBatchScript(String batchScript) {
        this.batchScript = batchScript;
    }

    public String getConstraints() {
        return constraints;
    }

    public void setConstraints(String constraints) {
        this.constraints = constraints;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public int getCpusReq() {
        return cpusReq;
    }

    public void setCpusReq(int cpusReq) {
        this.cpusReq = cpusReq;
    }

    public int getDerivedEc() {
        return derivedEc;
    }

    public void setDerivedEc(int derivedEc) {
        this.derivedEc = derivedEc;
    }

    public String getDerivedEs() {
        return derivedEs;
    }

    public void setDerivedEs(String derivedEs) {
        this.derivedEs = derivedEs;
    }

    public String getEnvVars() {
        return envVars;
    }

    public void setEnvVars(String envVars) {
        this.envVars = envVars;
    }

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public Object getJobName() {
        return jobName;
    }

    public void setJobName(Object jobName) {
        this.jobName = jobName;
    }

    public int getIdAssoc() {
        return idAssoc;
    }

    public void setIdAssoc(int idAssoc) {
        this.idAssoc = idAssoc;
    }

    public int getIdArrayJob() {
        return idArrayJob;
    }

    public void setIdArrayJob(int idArrayJob) {
        this.idArrayJob = idArrayJob;
    }

    public int getIdArrayTask() {
        return idArrayTask;
    }

    public void setIdArrayTask(int idArrayTask) {
        this.idArrayTask = idArrayTask;
    }

    public Object getIdBlock() {
        return idBlock;
    }

    public void setIdBlock(Object idBlock) {
        this.idBlock = idBlock;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public int getIdQos() {
        return idQos;
    }

    public void setIdQos(int idQos) {
        this.idQos = idQos;
    }

    public int getIdResv() {
        return idResv;
    }

    public void setIdResv(int idResv) {
        this.idResv = idResv;
    }

    public int getIdWckey() {
        return idWckey;
    }

    public void setIdWckey(int idWckey) {
        this.idWckey = idWckey;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getHetJobId() {
        return hetJobId;
    }

    public void setHetJobId(int hetJobId) {
        this.hetJobId = hetJobId;
    }

    public int getHetJobOffset() {
        return hetJobOffset;
    }

    public void setHetJobOffset(int hetJobOffset) {
        this.hetJobOffset = hetJobOffset;
    }

    public int getKillRequid() {
        return killRequid;
    }

    public void setKillRequid(int killRequid) {
        this.killRequid = killRequid;
    }

    public int getStateReasonPrev() {
        return stateReasonPrev;
    }

    public void setStateReasonPrev(int stateReasonPrev) {
        this.stateReasonPrev = stateReasonPrev;
    }

    public Object getMcsLabel() {
        return mcsLabel;
    }

    public void setMcsLabel(Object mcsLabel) {
        this.mcsLabel = mcsLabel;
    }

    public long getMemReq() {
        return memReq;
    }

    public void setMemReq(long memReq) {
        this.memReq = memReq;
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

    public Object getPartition() {
        return partition;
    }

    public void setPartition(Object partition) {
        this.partition = partition;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(int timelimit) {
        this.timelimit = timelimit;
    }

    public long getTimeSubmit() {
        return timeSubmit;
    }

    public void setTimeSubmit(long timeSubmit) {
        this.timeSubmit = timeSubmit;
    }

    public long getTimeEligible() {
        return timeEligible;
    }

    public void setTimeEligible(long timeEligible) {
        this.timeEligible = timeEligible;
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

    public String getGresUsed() {
        return gresUsed;
    }

    public void setGresUsed(String gresUsed) {
        this.gresUsed = gresUsed;
    }

    public Object getWckey() {
        return wckey;
    }

    public void setWckey(Object wckey) {
        this.wckey = wckey;
    }

    public String getWorkDir() {
        return workDir;
    }

    public void setWorkDir(String workDir) {
        this.workDir = workDir;
    }

    public String getSubmitLine() {
        return submitLine;
    }

    public void setSubmitLine(String submitLine) {
        this.submitLine = submitLine;
    }

    public String getSystemComment() {
        return systemComment;
    }

    public void setSystemComment(String systemComment) {
        this.systemComment = systemComment;
    }

    public byte getTrackSteps() {
        return trackSteps;
    }

    public void setTrackSteps(byte trackSteps) {
        this.trackSteps = trackSteps;
    }

    public String getTresAlloc() {
        return tresAlloc;
    }

    public void setTresAlloc(String tresAlloc) {
        this.tresAlloc = tresAlloc;
    }

    public String getTresReq() {
        return tresReq;
    }

    public void setTresReq(String tresReq) {
        this.tresReq = tresReq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterJobTableEntity that = (ClusterJobTableEntity) o;

        if (jobDbInx != that.jobDbInx) return false;
        if (modTime != that.modTime) return false;
        if (deleted != that.deleted) return false;
        if (arrayMaxTasks != that.arrayMaxTasks) return false;
        if (arrayTaskPending != that.arrayTaskPending) return false;
        if (cpusReq != that.cpusReq) return false;
        if (derivedEc != that.derivedEc) return false;
        if (exitCode != that.exitCode) return false;
        if (flags != that.flags) return false;
        if (idAssoc != that.idAssoc) return false;
        if (idArrayJob != that.idArrayJob) return false;
        if (idArrayTask != that.idArrayTask) return false;
        if (idJob != that.idJob) return false;
        if (idQos != that.idQos) return false;
        if (idResv != that.idResv) return false;
        if (idWckey != that.idWckey) return false;
        if (idUser != that.idUser) return false;
        if (idGroup != that.idGroup) return false;
        if (hetJobId != that.hetJobId) return false;
        if (hetJobOffset != that.hetJobOffset) return false;
        if (killRequid != that.killRequid) return false;
        if (stateReasonPrev != that.stateReasonPrev) return false;
        if (memReq != that.memReq) return false;
        if (nodesAlloc != that.nodesAlloc) return false;
        if (priority != that.priority) return false;
        if (state != that.state) return false;
        if (timelimit != that.timelimit) return false;
        if (timeSubmit != that.timeSubmit) return false;
        if (timeEligible != that.timeEligible) return false;
        if (timeStart != that.timeStart) return false;
        if (timeEnd != that.timeEnd) return false;
        if (timeSuspended != that.timeSuspended) return false;
        if (trackSteps != that.trackSteps) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (adminComment != null ? !adminComment.equals(that.adminComment) : that.adminComment != null) return false;
        if (arrayTaskStr != null ? !arrayTaskStr.equals(that.arrayTaskStr) : that.arrayTaskStr != null) return false;
        if (batchScript != null ? !batchScript.equals(that.batchScript) : that.batchScript != null) return false;
        if (constraints != null ? !constraints.equals(that.constraints) : that.constraints != null) return false;
        if (container != null ? !container.equals(that.container) : that.container != null) return false;
        if (derivedEs != null ? !derivedEs.equals(that.derivedEs) : that.derivedEs != null) return false;
        if (envVars != null ? !envVars.equals(that.envVars) : that.envVars != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (idBlock != null ? !idBlock.equals(that.idBlock) : that.idBlock != null) return false;
        if (mcsLabel != null ? !mcsLabel.equals(that.mcsLabel) : that.mcsLabel != null) return false;
        if (nodelist != null ? !nodelist.equals(that.nodelist) : that.nodelist != null) return false;
        if (nodeInx != null ? !nodeInx.equals(that.nodeInx) : that.nodeInx != null) return false;
        if (partition != null ? !partition.equals(that.partition) : that.partition != null) return false;
        if (gresUsed != null ? !gresUsed.equals(that.gresUsed) : that.gresUsed != null) return false;
        if (wckey != null ? !wckey.equals(that.wckey) : that.wckey != null) return false;
        if (workDir != null ? !workDir.equals(that.workDir) : that.workDir != null) return false;
        if (submitLine != null ? !submitLine.equals(that.submitLine) : that.submitLine != null) return false;
        if (systemComment != null ? !systemComment.equals(that.systemComment) : that.systemComment != null)
            return false;
        if (tresAlloc != null ? !tresAlloc.equals(that.tresAlloc) : that.tresAlloc != null) return false;
        if (tresReq != null ? !tresReq.equals(that.tresReq) : that.tresReq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobDbInx ^ (jobDbInx >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (int) deleted;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (adminComment != null ? adminComment.hashCode() : 0);
        result = 31 * result + (arrayTaskStr != null ? arrayTaskStr.hashCode() : 0);
        result = 31 * result + arrayMaxTasks;
        result = 31 * result + arrayTaskPending;
        result = 31 * result + (batchScript != null ? batchScript.hashCode() : 0);
        result = 31 * result + (constraints != null ? constraints.hashCode() : 0);
        result = 31 * result + (container != null ? container.hashCode() : 0);
        result = 31 * result + cpusReq;
        result = 31 * result + derivedEc;
        result = 31 * result + (derivedEs != null ? derivedEs.hashCode() : 0);
        result = 31 * result + (envVars != null ? envVars.hashCode() : 0);
        result = 31 * result + exitCode;
        result = 31 * result + flags;
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + idAssoc;
        result = 31 * result + idArrayJob;
        result = 31 * result + idArrayTask;
        result = 31 * result + (idBlock != null ? idBlock.hashCode() : 0);
        result = 31 * result + idJob;
        result = 31 * result + idQos;
        result = 31 * result + idResv;
        result = 31 * result + idWckey;
        result = 31 * result + idUser;
        result = 31 * result + idGroup;
        result = 31 * result + hetJobId;
        result = 31 * result + hetJobOffset;
        result = 31 * result + killRequid;
        result = 31 * result + stateReasonPrev;
        result = 31 * result + (mcsLabel != null ? mcsLabel.hashCode() : 0);
        result = 31 * result + (int) (memReq ^ (memReq >>> 32));
        result = 31 * result + (nodelist != null ? nodelist.hashCode() : 0);
        result = 31 * result + nodesAlloc;
        result = 31 * result + (nodeInx != null ? nodeInx.hashCode() : 0);
        result = 31 * result + (partition != null ? partition.hashCode() : 0);
        result = 31 * result + priority;
        result = 31 * result + state;
        result = 31 * result + timelimit;
        result = 31 * result + (int) (timeSubmit ^ (timeSubmit >>> 32));
        result = 31 * result + (int) (timeEligible ^ (timeEligible >>> 32));
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        result = 31 * result + (int) (timeEnd ^ (timeEnd >>> 32));
        result = 31 * result + (int) (timeSuspended ^ (timeSuspended >>> 32));
        result = 31 * result + (gresUsed != null ? gresUsed.hashCode() : 0);
        result = 31 * result + (wckey != null ? wckey.hashCode() : 0);
        result = 31 * result + (workDir != null ? workDir.hashCode() : 0);
        result = 31 * result + (submitLine != null ? submitLine.hashCode() : 0);
        result = 31 * result + (systemComment != null ? systemComment.hashCode() : 0);
        result = 31 * result + (int) trackSteps;
        result = 31 * result + (tresAlloc != null ? tresAlloc.hashCode() : 0);
        result = 31 * result + (tresReq != null ? tresReq.hashCode() : 0);
        return result;
    }
}
