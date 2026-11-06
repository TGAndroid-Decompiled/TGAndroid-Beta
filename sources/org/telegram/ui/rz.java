package org.telegram.ui;
public final class rz {
    public long f49589a;
    public int f49590b;

    public rz(int i7, long j3) {
        this.f49589a = j3;
        this.f49590b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rz.class == obj.getClass()) {
            rz rzVar = (rz) obj;
            if (this.f49589a == rzVar.f49589a && this.f49590b == rzVar.f49590b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49590b;
    }
}
