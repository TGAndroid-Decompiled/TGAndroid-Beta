package org.telegram.ui;
public final class vz {
    public long f52886a;
    public int f52887b;

    public vz(int i7, long j3) {
        this.f52886a = j3;
        this.f52887b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz.class == obj.getClass()) {
            vz vzVar = (vz) obj;
            if (this.f52886a == vzVar.f52886a && this.f52887b == vzVar.f52887b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52887b;
    }
}
