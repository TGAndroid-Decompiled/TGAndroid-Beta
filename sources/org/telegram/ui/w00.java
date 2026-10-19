package org.telegram.ui;
public final class w00 {
    public long f42419a;
    public int f42420b;

    public w00(int i10, long j10) {
        this.f42419a = j10;
        this.f42420b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w00.class == obj.getClass()) {
            w00 w00Var = (w00) obj;
            if (this.f42419a == w00Var.f42419a && this.f42420b == w00Var.f42420b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42420b;
    }
}
