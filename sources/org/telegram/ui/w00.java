package org.telegram.ui;
public final class w00 {
    public long f42428a;
    public int f42429b;

    public w00(int i10, long j10) {
        this.f42428a = j10;
        this.f42429b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w00.class == obj.getClass()) {
            w00 w00Var = (w00) obj;
            if (this.f42428a == w00Var.f42428a && this.f42429b == w00Var.f42429b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42429b;
    }
}
