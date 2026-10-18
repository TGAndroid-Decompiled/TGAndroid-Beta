package org.telegram.ui;
public final class y00 {
    public long f43325a;
    public int f43326b;

    public y00(int i10, long j10) {
        this.f43325a = j10;
        this.f43326b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y00.class == obj.getClass()) {
            y00 y00Var = (y00) obj;
            if (this.f43325a == y00Var.f43325a && this.f43326b == y00Var.f43326b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43326b;
    }
}
