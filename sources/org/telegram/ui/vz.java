package org.telegram.ui;
public final class vz {
    public long f52876a;
    public int f52877b;

    public vz(int i7, long j3) {
        this.f52876a = j3;
        this.f52877b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.f52876a == vzVar.f52876a && this.f52877b == vzVar.f52877b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52877b;
    }
}
