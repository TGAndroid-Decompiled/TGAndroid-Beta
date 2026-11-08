package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53458a;
    public final int f53459b;
    public final long f53460c;

    public w(List list, int i7, long j3) {
        this.f53458a = h9.i0.q(list);
        this.f53459b = i7;
        this.f53460c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53458a.equals(wVar.f53458a) && this.f53459b == wVar.f53459b && this.f53460c == wVar.f53460c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53460c) + (((this.f53458a.hashCode() * 31) + this.f53459b) * 31);
    }
}
