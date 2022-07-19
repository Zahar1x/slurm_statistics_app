package ru.zaharix.slurmstat.entities;

import javax.persistence.*;

@Entity
@Table(name = "table_defs_table", schema = "slurm_acct_db", catalog = "")
public class TableDefsTableEntity {
    @Basic
    @Column(name = "creation_time")
    private int creationTime;
    @Basic
    @Column(name = "mod_time")
    private int modTime;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "table_name")
    private String tableName;
    @Basic
    @Column(name = "definition")
    private String definition;

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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableDefsTableEntity that = (TableDefsTableEntity) o;

        if (creationTime != that.creationTime) return false;
        if (modTime != that.modTime) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (definition != null ? !definition.equals(that.definition) : that.definition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = creationTime;
        result = 31 * result + modTime;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (definition != null ? definition.hashCode() : 0);
        return result;
    }
}
