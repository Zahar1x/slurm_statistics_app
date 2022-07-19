package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "federation_table", schema = "slurm_acct_db", catalog = "")
public class FederationTableEntity {
    @Basic
    @Column(name = "creation_time")
    private int creationTime;
    @Basic
    @Column(name = "mod_time")
    private int modTime;
    @Basic
    @Column(name = "deleted")
    private Byte deleted;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "flags")
    private Integer flags;

    public int getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }

    public int getModTime() {
        return modTime;
    }

    public void setModTime(int modTime) {
        this.modTime = modTime;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FederationTableEntity that = (FederationTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (flags != null ? !flags.equals(that.flags) : that.flags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = creationTime;
        result = 31 * result + modTime;
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (flags != null ? flags.hashCode() : 0);
        return result;
    }
}
