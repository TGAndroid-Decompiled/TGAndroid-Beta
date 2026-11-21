package org.telegram.ui;
public final class vz {
    public long f52917a;
    public int f52918b;

    public vz(int i7, long j3) {
        this.f52917a = j3;
        this.f52918b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.f52917a == vzVar.f52917a && this.f52918b == vzVar.f52918b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52918b;
    }
}
