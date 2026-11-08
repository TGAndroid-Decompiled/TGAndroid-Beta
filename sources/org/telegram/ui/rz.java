package org.telegram.ui;
public final class rz {
    public long f49568a;
    public int f49569b;

    public rz(int i7, long j3) {
        this.f49568a = j3;
        this.f49569b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rz.class == obj.getClass()) {
            rz rzVar = (rz) obj;
            if (this.f49568a == rzVar.f49568a && this.f49569b == rzVar.f49569b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49569b;
    }
}
