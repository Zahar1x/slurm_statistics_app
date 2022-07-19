package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "convert_version_table", schema = "slurm_acct_db", catalog = "")
public class ConvertVersionTableEntity {
    @Basic
    @Column(name = "mod_time")
    private long modTime;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "version")
    private int version;

    public long getModTime() {
        return modTime;
    }

    public void setModTime(long modTime) {
        this.modTime = modTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConvertVersionTableEntity that = (ConvertVersionTableEntity) o;

        if (modTime != that.modTime) return false;
        if (version != that.version) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (modTime ^ (modTime >>> 32));
        result = 31 * result + version;
        return result;
    }
}
