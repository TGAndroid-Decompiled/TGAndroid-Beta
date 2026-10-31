package org.telegram.ui;
public final class s00 {
    public long f41322a;
    public int f41323b;

    public s00(int i10, long j10) {
        this.f41322a = j10;
        this.f41323b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s00.class == obj.getClass()) {
            s00 s00Var = (s00) obj;
            if (this.f41322a == s00Var.f41322a && this.f41323b == s00Var.f41323b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41323b;
    }
}
