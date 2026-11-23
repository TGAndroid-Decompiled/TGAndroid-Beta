package p4;

import java.util.List;
public final class w {
    public final h9.i0 f55571a;
    public final int f55572b;
    public final long f55573c;

    public w(List list, int i7, long j3) {
        this.f55571a = h9.i0.q(list);
        this.f55572b = i7;
        this.f55573c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f55571a.equals(wVar.f55571a) && this.f55572b == wVar.f55572b && this.f55573c == wVar.f55573c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.m1.b(this.f55573c) + (((this.f55571a.hashCode() * 31) + this.f55572b) * 31);
    }
}
