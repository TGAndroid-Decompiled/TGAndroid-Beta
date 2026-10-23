package org.telegram.ui;
public final class w00 {
    public long f42429a;
    public int f42430b;

    public w00(int i10, long j10) {
        this.f42429a = j10;
        this.f42430b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w00.class == obj.getClass()) {
            w00 w00Var = (w00) obj;
            if (this.f42429a == w00Var.f42429a && this.f42430b == w00Var.f42430b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42430b;
    }
}
