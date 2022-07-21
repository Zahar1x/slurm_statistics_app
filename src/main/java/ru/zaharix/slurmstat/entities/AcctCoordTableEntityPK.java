package ru.zaharix.slurmstat.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class AcctCoordTableEntityPK implements Serializable {

    private Object acct;

    private Object user;

    public Object getAcct() {
        return acct;
    }

    public void setAcct(Object acct) {
        this.acct = acct;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcctCoordTableEntityPK that = (AcctCoordTableEntityPK) o;

        if (acct != null ? !acct.equals(that.acct) : that.acct != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = acct != null ? acct.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
