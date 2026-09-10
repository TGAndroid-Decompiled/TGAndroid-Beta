package org.telegram.ui;
public final class r10 {
    public long f36168a;
    public int f36169b;

    public r10(int i10, long j3) {
        this.f36168a = j3;
        this.f36169b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r10.class == obj.getClass()) {
            r10 r10Var = (r10) obj;
            if (this.f36168a == r10Var.f36168a && this.f36169b == r10Var.f36169b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36169b;
    }
}
