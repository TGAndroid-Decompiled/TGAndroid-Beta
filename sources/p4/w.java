package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53457a;
    public final int f53458b;
    public final long f53459c;

    public w(List list, int i7, long j3) {
        this.f53457a = h9.i0.q(list);
        this.f53458b = i7;
        this.f53459c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53457a.equals(wVar.f53457a) && this.f53458b == wVar.f53458b && this.f53459c == wVar.f53459c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53459c) + (((this.f53457a.hashCode() * 31) + this.f53458b) * 31);
    }
}
