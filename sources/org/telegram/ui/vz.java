package org.telegram.ui;
public final class vz {
    public long f52921a;
    public int f52922b;

    public vz(int i7, long j3) {
        this.f52921a = j3;
        this.f52922b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.f52921a == vzVar.f52921a && this.f52922b == vzVar.f52922b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52922b;
    }
}
