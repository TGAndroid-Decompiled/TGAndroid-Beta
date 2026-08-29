package org.telegram.ui;
public final class z00 {
    public long f45005a;
    public int f45006b;

    public z00(int i10, long j10) {
        this.f45005a = j10;
        this.f45006b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z00.class == obj.getClass()) {
            z00 z00Var = (z00) obj;
            if (this.f45005a == z00Var.f45005a && this.f45006b == z00Var.f45006b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45006b;
    }
}
