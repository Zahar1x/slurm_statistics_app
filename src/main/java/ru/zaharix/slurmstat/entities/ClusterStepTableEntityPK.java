package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ClusterStepTableEntityPK implements Serializable {
    @Column(name = "job_db_inx")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobDbInx;
    @Column(name = "id_step")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStep;
    @Column(name = "step_het_comp")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stepHetComp;

    public long getJobDbInx() {
        return jobDbInx;
    }

    public void setJobDbInx(long jobDbInx) {
        this.jobDbInx = jobDbInx;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterStepTableEntityPK that = (ClusterStepTableEntityPK) o;

        if (jobDbInx != that.jobDbInx) return false;
        if (idStep != that.idStep) return false;
        if (stepHetComp != that.stepHetComp) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobDbInx ^ (jobDbInx >>> 32));
        result = 31 * result + idStep;
        result = 31 * result + stepHetComp;
        return result;
    }
}
