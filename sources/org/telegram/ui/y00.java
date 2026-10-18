package org.telegram.ui;
public final class y00 {
    public long f43287a;
    public int f43288b;

    public y00(int i10, long j10) {
        this.f43287a = j10;
        this.f43288b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y00.class == obj.getClass()) {
            y00 y00Var = (y00) obj;
            if (this.f43287a == y00Var.f43287a && this.f43288b == y00Var.f43288b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43288b;
    }
}
