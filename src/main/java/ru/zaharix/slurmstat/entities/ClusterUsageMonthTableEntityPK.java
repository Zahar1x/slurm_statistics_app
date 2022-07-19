package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusterUsageMonthTableEntityPK implements Serializable {
    @Column(name = "id_tres")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTres;
    @Column(name = "time_start")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long timeStart;

    public int getIdTres() {
        return idTres;
    }

    public void setIdTres(int idTres) {
        this.idTres = idTres;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterUsageMonthTableEntityPK that = (ClusterUsageMonthTableEntityPK) o;

        if (idTres != that.idTres) return false;
        if (timeStart != that.timeStart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTres;
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        return result;
    }
}
