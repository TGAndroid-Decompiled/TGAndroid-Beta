package org.telegram.ui;
public final class r00 {
    public long f40933a;
    public int f40934b;

    public r00(int i10, long j10) {
        this.f40933a = j10;
        this.f40934b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r00.class == obj.getClass()) {
            r00 r00Var = (r00) obj;
            if (this.f40933a == r00Var.f40933a && this.f40934b == r00Var.f40934b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40934b;
    }
}
