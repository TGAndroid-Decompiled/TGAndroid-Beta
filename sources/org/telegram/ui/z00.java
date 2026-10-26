package org.telegram.ui;
public final class z00 {
    public long f46148a;
    public int f46149b;

    public z00(int i10, long j10) {
        this.f46148a = j10;
        this.f46149b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z00.class == obj.getClass()) {
            z00 z00Var = (z00) obj;
            if (this.f46148a == z00Var.f46148a && this.f46149b == z00Var.f46149b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46149b;
    }
}
