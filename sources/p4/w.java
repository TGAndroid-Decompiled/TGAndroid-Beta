package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53366a;
    public final int f53367b;
    public final long f53368c;

    public w(List list, int i7, long j3) {
        this.f53366a = h9.i0.q(list);
        this.f53367b = i7;
        this.f53368c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53366a.equals(wVar.f53366a) && this.f53367b == wVar.f53367b && this.f53368c == wVar.f53368c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53368c) + (((this.f53366a.hashCode() * 31) + this.f53367b) * 31);
    }
}
