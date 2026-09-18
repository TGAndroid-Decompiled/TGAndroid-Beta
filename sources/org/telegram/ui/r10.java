package org.telegram.ui;
public final class r10 {
    public long f37067a;
    public int f37068b;

    public r10(int i10, long j3) {
        this.f37067a = j3;
        this.f37068b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r10.class == obj.getClass()) {
            r10 r10Var = (r10) obj;
            if (this.f37067a == r10Var.f37067a && this.f37068b == r10Var.f37068b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37068b;
    }
}
