package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_table", schema = "slurm_acct_db", catalog = "")
public class UserTableEntity {
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
    @Column(name = "admin_level")
    private short adminLevel;

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

    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(short adminLevel) {
        this.adminLevel = adminLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTableEntity that = (UserTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (adminLevel != that.adminLevel) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (creationTime ^ (creationTime >>> 32));
        result = 31 * result + (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) adminLevel;
        return result;
    }
}
