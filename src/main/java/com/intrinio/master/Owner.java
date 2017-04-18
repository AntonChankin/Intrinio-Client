package com.intrinio.master;

import com.intrinio.common.Result;

import java.util.Objects;

/**
 *  Information on insider and institutional owner of securities covered by Intrinio.
 */
public class Owner implements Result {
    /**  - the Central Index Key issued by the SEC, which is the unique identifier all owner filings */
    private String owner_cik;
    /**  - the name of the owner, either an institutional owner or an insider owner */
    private String owner_name;

    public String getOwner_cik() {
        return owner_cik;
    }

    public void setOwner_cik(String owner_cik) {
        this.owner_cik = owner_cik;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(owner_cik, owner.owner_cik) &&
                Objects.equals(owner_name, owner.owner_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner_cik, owner_name);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "owner_cik='" + owner_cik + '\'' +
                ", owner_name='" + owner_name + '\'' +
                '}';
    }
}
