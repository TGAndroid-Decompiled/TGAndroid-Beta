package org.telegram.ui;
public final class z00 {
    public long f46145a;
    public int f46146b;

    public z00(int i10, long j10) {
        this.f46145a = j10;
        this.f46146b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z00.class == obj.getClass()) {
            z00 z00Var = (z00) obj;
            if (this.f46145a == z00Var.f46145a && this.f46146b == z00Var.f46146b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46146b;
    }
}
