package org.telegram.ui;
public final class uz {
    public long f52761a;
    public int f52762b;

    public uz(int i7, long j3) {
        this.f52761a = j3;
        this.f52762b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uz.class == obj.getClass()) {
            uz uzVar = (uz) obj;
            if (this.f52761a == uzVar.f52761a && this.f52762b == uzVar.f52762b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f52762b;
    }
}
