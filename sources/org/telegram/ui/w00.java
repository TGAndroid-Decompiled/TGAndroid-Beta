package org.telegram.ui;
public final class w00 {
    public long f42425a;
    public int f42426b;

    public w00(int i10, long j10) {
        this.f42425a = j10;
        this.f42426b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w00.class == obj.getClass()) {
            w00 w00Var = (w00) obj;
            if (this.f42425a == w00Var.f42425a && this.f42426b == w00Var.f42426b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42426b;
    }
}
