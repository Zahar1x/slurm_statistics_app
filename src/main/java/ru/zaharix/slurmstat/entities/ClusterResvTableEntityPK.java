package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusterResvTableEntityPK implements Serializable {
    @Column(name = "id_resv")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResv;
    @Column(name = "time_start")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long timeStart;

    public int getIdResv() {
        return idResv;
    }

    public void setIdResv(int idResv) {
        this.idResv = idResv;
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

        ClusterResvTableEntityPK that = (ClusterResvTableEntityPK) o;

        if (idResv != that.idResv) return false;
        if (timeStart != that.timeStart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idResv;
        result = 31 * result + (int) (timeStart ^ (timeStart >>> 32));
        return result;
    }
}
