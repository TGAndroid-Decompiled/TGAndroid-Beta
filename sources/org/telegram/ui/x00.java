package org.telegram.ui;
public final class x00 {
    public long f44299a;
    public int f44300b;

    public x00(int i9, long j10) {
        this.f44299a = j10;
        this.f44300b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x00.class == obj.getClass()) {
            x00 x00Var = (x00) obj;
            if (this.f44299a == x00Var.f44299a && this.f44300b == x00Var.f44300b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44300b;
    }
}
