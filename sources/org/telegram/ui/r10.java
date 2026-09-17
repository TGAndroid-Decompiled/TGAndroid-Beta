package org.telegram.ui;
public final class r10 {
    public long f37062a;
    public int f37063b;

    public r10(int i10, long j3) {
        this.f37062a = j3;
        this.f37063b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r10.class == obj.getClass()) {
            r10 r10Var = (r10) obj;
            if (this.f37062a == r10Var.f37062a && this.f37063b == r10Var.f37063b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37063b;
    }
}
