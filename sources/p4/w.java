package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53470a;
    public final int f53471b;
    public final long f53472c;

    public w(List list, int i7, long j3) {
        this.f53470a = h9.i0.q(list);
        this.f53471b = i7;
        this.f53472c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53470a.equals(wVar.f53470a) && this.f53471b == wVar.f53471b && this.f53472c == wVar.f53472c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53472c) + (((this.f53470a.hashCode() * 31) + this.f53471b) * 31);
    }
}
