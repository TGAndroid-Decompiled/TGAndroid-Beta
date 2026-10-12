package org.telegram.ui;
public final class u10 {
    public long f40516a;
    public int f40517b;

    public u10(int i10, long j10) {
        this.f40516a = j10;
        this.f40517b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u10.class == obj.getClass()) {
            u10 u10Var = (u10) obj;
            if (this.f40516a == u10Var.f40516a && this.f40517b == u10Var.f40517b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40517b;
    }
}
