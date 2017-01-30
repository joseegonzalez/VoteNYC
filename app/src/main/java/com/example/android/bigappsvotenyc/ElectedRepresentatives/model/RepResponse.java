package com.example.android.bigappsvotenyc.ElectedRepresentatives.model;

import java.util.List;

/**
 * Created by catwong on 1/29/17.
 */

public class RepResponse {

    private String kind;
    private NormalizedInput normalizedInput;
    private List<Office> offices;
    private List<Official> officials;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public NormalizedInput getNormalizedInput() {
        return normalizedInput;
    }

    public void setNormalizedInput(NormalizedInput normalizedInput) {
        this.normalizedInput = normalizedInput;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

    public List<Official> getOfficials() {
        return officials;
    }

    public void setOfficials(List<Official> officials) {
        this.officials = officials;
    }
}
