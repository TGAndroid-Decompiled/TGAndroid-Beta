package org.telegram.ui;
public final class t10 {
    public long f39980a;
    public int f39981b;

    public t10(int i10, long j10) {
        this.f39980a = j10;
        this.f39981b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t10.class == obj.getClass()) {
            t10 t10Var = (t10) obj;
            if (this.f39980a == t10Var.f39980a && this.f39981b == t10Var.f39981b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39981b;
    }
}
