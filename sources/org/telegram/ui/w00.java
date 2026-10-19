package org.telegram.ui;
public final class w00 {
    public long f42418a;
    public int f42419b;

    public w00(int i10, long j10) {
        this.f42418a = j10;
        this.f42419b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w00.class == obj.getClass()) {
            w00 w00Var = (w00) obj;
            if (this.f42418a == w00Var.f42418a && this.f42419b == w00Var.f42419b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42419b;
    }
}
