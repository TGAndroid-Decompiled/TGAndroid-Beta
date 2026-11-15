package org.telegram.ui;
public final class sz {
    public long f51305a;
    public int f51306b;

    public sz(int i7, long j3) {
        this.f51305a = j3;
        this.f51306b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sz.class == obj.getClass()) {
            sz szVar = (sz) obj;
            if (this.f51305a == szVar.f51305a && this.f51306b == szVar.f51306b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51306b;
    }
}
