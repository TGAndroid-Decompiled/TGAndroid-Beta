package org.telegram.ui;
public final class rz {
    public long f49569a;
    public int f49570b;

    public rz(int i7, long j3) {
        this.f49569a = j3;
        this.f49570b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rz.class == obj.getClass()) {
            rz rzVar = (rz) obj;
            if (this.f49569a == rzVar.f49569a && this.f49570b == rzVar.f49570b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49570b;
    }
}
