package org.telegram.ui;
public final class uz {
    public long f50595a;
    public int f50596b;

    public uz(int i7, long j3) {
        this.f50595a = j3;
        this.f50596b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uz.class == obj.getClass()) {
            uz uzVar = (uz) obj;
            if (this.f50595a == uzVar.f50595a && this.f50596b == uzVar.f50596b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50596b;
    }
}
