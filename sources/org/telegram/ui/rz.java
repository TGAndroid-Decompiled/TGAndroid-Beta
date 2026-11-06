package org.telegram.ui;
public final class rz {
    public long f49590a;
    public int f49591b;

    public rz(int i7, long j3) {
        this.f49590a = j3;
        this.f49591b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rz.class == obj.getClass()) {
            rz rzVar = (rz) obj;
            if (this.f49590a == rzVar.f49590a && this.f49591b == rzVar.f49591b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49591b;
    }
}
