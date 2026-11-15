package org.telegram.ui;
public final class sz {
    public long f51306a;
    public int f51307b;

    public sz(int i7, long j3) {
        this.f51306a = j3;
        this.f51307b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sz.class == obj.getClass()) {
            sz szVar = (sz) obj;
            if (this.f51306a == szVar.f51306a && this.f51307b == szVar.f51307b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51307b;
    }
}
