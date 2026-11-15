package p4;

import java.util.List;
public final class w {
    public final h9.i0 f54875a;
    public final int f54876b;
    public final long f54877c;

    public w(List list, int i7, long j3) {
        this.f54875a = h9.i0.q(list);
        this.f54876b = i7;
        this.f54877c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f54875a.equals(wVar.f54875a) && this.f54876b == wVar.f54876b && this.f54877c == wVar.f54877c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.j1.b(this.f54877c) + (((this.f54875a.hashCode() * 31) + this.f54876b) * 31);
    }
}
