package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "cluster_table", schema = "slurm_acct_db", catalog = "")
public class ClusterTableEntity {
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
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "control_host")
    private String controlHost;
    @Basic
    @Column(name = "control_port")
    private int controlPort;
    @Basic
    @Column(name = "last_port")
    private int lastPort;
    @Basic
    @Column(name = "rpc_version")
    private short rpcVersion;
    @Basic
    @Column(name = "classification")
    private Short classification;
    @Basic
    @Column(name = "dimensions")
    private Short dimensions;
    @Basic
    @Column(name = "plugin_id_select")
    private Short pluginIdSelect;
    @Basic
    @Column(name = "flags")
    private Integer flags;
    @Basic
    @Column(name = "federation")
    private String federation;
    @Basic
    @Column(name = "features")
    private String features;
    @Basic
    @Column(name = "fed_id")
    private int fedId;
    @Basic
    @Column(name = "fed_state")
    private short fedState;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getControlHost() {
        return controlHost;
    }

    public void setControlHost(String controlHost) {
        this.controlHost = controlHost;
    }

    public int getControlPort() {
        return controlPort;
    }

    public void setControlPort(int controlPort) {
        this.controlPort = controlPort;
    }

    public int getLastPort() {
        return lastPort;
    }

    public void setLastPort(int lastPort) {
        this.lastPort = lastPort;
    }

    public short getRpcVersion() {
        return rpcVersion;
    }

    public void setRpcVersion(short rpcVersion) {
        this.rpcVersion = rpcVersion;
    }

    public Short getClassification() {
        return classification;
    }

    public void setClassification(Short classification) {
        this.classification = classification;
    }

    public Short getDimensions() {
        return dimensions;
    }

    public void setDimensions(Short dimensions) {
        this.dimensions = dimensions;
    }

    public Short getPluginIdSelect() {
        return pluginIdSelect;
    }

    public void setPluginIdSelect(Short pluginIdSelect) {
        this.pluginIdSelect = pluginIdSelect;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getFederation() {
        return federation;
    }

    public void setFederation(String federation) {
        this.federation = federation;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getFedId() {
        return fedId;
    }

    public void setFedId(int fedId) {
        this.fedId = fedId;
    }

    public short getFedState() {
        return fedState;
    }

    public void setFedState(short fedState) {
        this.fedState = fedState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterTableEntity that = (ClusterTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (controlPort != that.controlPort) return false;
        if (lastPort != that.lastPort) return false;
        if (rpcVersion != that.rpcVersion) return false;
        if (fedId != that.fedId) return false;
        if (fedState != that.fedState) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (controlHost != null ? !controlHost.equals(that.controlHost) : that.controlHost != null) return false;
        if (classification != null ? !classification.equals(that.classification) : that.classification != null)
            return false;
        if (dimensions != null ? !dimensions.equals(that.dimensions) : that.dimensions != null) return false;
        if (pluginIdSelect != null ? !pluginIdSelect.equals(that.pluginIdSelect) : that.pluginIdSelect != null)
            return false;
        if (flags != null ? !flags.equals(that.flags) : that.flags != null) return false;
        if (federation != null ? !federation.equals(that.federation) : that.federation != null) return false;
        if (features != null ? !features.equals(that.features) : that.features != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (controlHost != null ? controlHost.hashCode() : 0);
        result = 31 * result + controlPort;
        result = 31 * result + lastPort;
        result = 31 * result + (int) rpcVersion;
        result = 31 * result + (classification != null ? classification.hashCode() : 0);
        result = 31 * result + (dimensions != null ? dimensions.hashCode() : 0);
        result = 31 * result + (pluginIdSelect != null ? pluginIdSelect.hashCode() : 0);
        result = 31 * result + (flags != null ? flags.hashCode() : 0);
        result = 31 * result + (federation != null ? federation.hashCode() : 0);
        result = 31 * result + (features != null ? features.hashCode() : 0);
        result = 31 * result + fedId;
        result = 31 * result + (int) fedState;
        return result;
    }
}
