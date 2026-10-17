package org.telegram.ui;
public final class y00 {
    public long f43301a;
    public int f43302b;

    public y00(int i10, long j10) {
        this.f43301a = j10;
        this.f43302b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y00.class == obj.getClass()) {
            y00 y00Var = (y00) obj;
            if (this.f43301a == y00Var.f43301a && this.f43302b == y00Var.f43302b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43302b;
    }
}
