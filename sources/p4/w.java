package p4;

import java.util.List;
public final class w {
    public final h9.i0 f55458a;
    public final int f55459b;
    public final long f55460c;

    public w(List list, int i7, long j3) {
        this.f55458a = h9.i0.q(list);
        this.f55459b = i7;
        this.f55460c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f55458a.equals(wVar.f55458a) && this.f55459b == wVar.f55459b && this.f55460c == wVar.f55460c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.m1.b(this.f55460c) + (((this.f55458a.hashCode() * 31) + this.f55459b) * 31);
    }
}
