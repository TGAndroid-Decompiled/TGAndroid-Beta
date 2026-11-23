package org.telegram.ui;
public final class vz {
    public long f52889a;
    public int f52890b;

    public vz(int i7, long j3) {
        this.f52889a = j3;
        this.f52890b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.f52889a == vzVar.f52889a && this.f52890b == vzVar.f52890b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52890b;
    }
}
