package p4;

import java.util.List;
public final class w {
    public final h9.i0 f55493a;
    public final int f55494b;
    public final long f55495c;

    public w(List list, int i7, long j3) {
        this.f55493a = h9.i0.q(list);
        this.f55494b = i7;
        this.f55495c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f55493a.equals(wVar.f55493a) && this.f55494b == wVar.f55494b && this.f55495c == wVar.f55495c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.l1.b(this.f55495c) + (((this.f55493a.hashCode() * 31) + this.f55494b) * 31);
    }
}
